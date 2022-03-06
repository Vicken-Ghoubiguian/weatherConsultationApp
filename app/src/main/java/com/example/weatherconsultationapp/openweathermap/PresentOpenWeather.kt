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
    private var httpGetResult: String? = null

    //
    constructor(localization: String, countryCode: String, apiKey: String) {

        //
        this.parameters = ParametersWithLocalizationCountryCodeAndApiKey(localization, countryCode, apiKey)
    }

    //
    constructor(localization: String, apiKey: String) {

        //
        this.parameters = ParametersWithLocalizationAndApiKey(localization, apiKey)
    }

    //
    constructor(latitude: Double, longitude: Double, apiKey: String) {

        //
        this.parameters = ParametersWithLatitudeLongitudeAndApiKey(latitude, longitude, apiKey)
    }

    //
    public suspend fun openWeatherInitializer() {

        //
        val openWeatherClient = HttpClient(CIO)

        //
        var httpOpenWeatherRequest = ""

        //
        if (this.parameters?.parametersType == ParametersEnum.PARAMETERSWITHLOCALIZATIONAPIKEY) {

            //
            httpOpenWeatherRequest =
                "https://api.openweathermap.org/data/2.5/weather?q=" + this.parameters?.getLocalization() + "&appid=" + this.parameters?.getAPIKey()

        //
        } else if (this.parameters?.parametersType == ParametersEnum.PARAMETERSWITHLOCALIZATIONCOUNTRYCODEAPIKEY) {

            //
            httpOpenWeatherRequest =
                "https://api.openweathermap.org/data/2.5/weather?q=" + this.parameters?.getLocalization() + "," + this.parameters?.getCountryCode() + "&appid=" + this.parameters?.getAPIKey()

        //
        } else {

            //
            httpOpenWeatherRequest =
                "https://api.openweathermap.org/data/2.5/weather?lat=" + this.parameters?.getLatitude()
                    .toString() + "&lon=" + this.parameters?.getLongitude()
                    .toString() + "&appid=" + this.parameters?.getAPIKey()
        }

        //
        var getHTTPResultTransitionVar: String = ""

        //
        try {

            //
            runBlocking {

                //
                val openWeatheResponse: HttpResponse = openWeatherClient.get<HttpResponse>(httpOpenWeatherRequest)

                //
                getHTTPResultTransitionVar = openWeatherClient.get<String>(httpOpenWeatherRequest)

                //
                println(openWeatheResponse.status)
            }

            this.httpGetResult = getHTTPResultTransitionVar

            //
        } catch(exp : Exception) {

            //
            println(exp.toString())

            //
        } finally {

            //
            openWeatherClient.close()
        }
    }
}