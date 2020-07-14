package br.edu.ifsp.currencyconverter.model

object MoneyApi {

    val URL_BASE = "https://currency-converter5.p.rapidapi.com/currency/"
    val LIST_AVAILABLE = "list"
    val CONVERTER = "convert?from=%s&to=%s&amount=%s"
    val X_RAPIDAPI_KEY_FIELD = "x-rapidapi-key"
    val X_RAPIDAPI_KEY_VALUE = "{X_RAPIDAPI_KEY_VALUE}"
    val X_RAPIDAPI_HOST_FIELD = "x-rapidapi-host"
    val X_RAPIDAPI_HOST_VALUE = "currency-converter5.p.rapidapi.com"

}