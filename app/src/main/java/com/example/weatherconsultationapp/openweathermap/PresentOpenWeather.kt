package com.example.weatherconsultationapp.openweathermap

//
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.runBlocking

//
class PresentOpenWeather {

    //
    private var parameters: Parameters? = null

    //
    constructor(localization: String, countryCode: String, apiKey: String) {

        //
        //this.parameters = ParametersWithLocalizationCountryCodeAndApiKey(localization, countryCode, apiKey)
    }

    //
    constructor(localization: String, apiKey: String) {

        //
        //this.parameters = ParametersWithLocalizationAndApiKey(localization, apiKey)
    }

    //
    constructor(latitude: Double, longitude: Double, apiKey: String) {

        //
        //this.parameters = ParametersWithLatitudeLongitudeAndApiKey(latitude, longitude, apiKey)
    }
}