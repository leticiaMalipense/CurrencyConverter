package br.edu.ifsp.currencyconverter.model

data class Available (
    val currencies: Map<String, String>,
    val status: String
)