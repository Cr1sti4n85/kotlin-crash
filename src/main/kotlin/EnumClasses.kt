
enum class Country {
    CHILE, PERU, BOLIVIA, ARGENTINA, BRASIL
}

enum class CountryCode(val code: String) {
    CHILE("CL"), PERU("PE"), BOLIVIA("BO")
    , ARGENTINA("AR"), BRASIL("BR")
}

fun greetMe(vararg countries: Country) {
    for (country in countries){
        val output = when(country){
            Country.CHILE -> "Hola po ctm. Eres de ${Country.CHILE} Tu Codigo de pais es ${CountryCode.CHILE.code}"
            Country.PERU -> "Buenas pe. Eres de ${Country.PERU} Tu Codigo de pais es ${CountryCode.PERU.code}"
            Country.BOLIVIA -> "Hola puis. Eres de ${Country.BOLIVIA} Tu Codigo de pais es ${CountryCode.BOLIVIA.code}"
            Country.ARGENTINA -> "Como andamos boludo. Eres de ${Country.ARGENTINA} Tu Codigo de pais es ${CountryCode.ARGENTINA.code}"
            Country.BRASIL -> "Tudo bem? Voce mora no ${Country.BRASIL} O seu codigo do pais es ${CountryCode.BRASIL.code}"
        }
        println(output)
    }
}

fun enums(){
    println("Paises disponibles: ")

    for (country in Country.entries){
        println(country.name)
    }
    greetMe(Country.BOLIVIA, Country.PERU, Country.BRASIL)
}