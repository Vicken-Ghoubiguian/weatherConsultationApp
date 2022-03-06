package com.example.weatherconsultationapp.openweathermap

//
class ParametersWithLatitudeLongitudeAndApiKey : Parameters {

    //
    override var parametersType: ParametersEnum = ParametersEnum.PARAMETERSWITHLATITUDELONGITUDE

    //
    private var latitude: Double? = null
    private var longitude: Double? = null
    private var apiKey: String? = null

    //
    constructor(latitude: Double, longitude: Double,  apiKey: String) {

        //
        this.latitude = latitude
        this.longitude = longitude
        this.apiKey = apiKey
    }

    //
    override fun getLatitude(): Double? {

        //
        return this.latitude
    }

    //
    override fun getLongitude(): Double? {

        //
        return this.longitude
    }

    //
    override fun getAPIKey(): String? {

        //
        return this.apiKey
    }

    //
    override fun getLocalization(): String? {

        //
        TODO("Not yet implemented")
    }

    //
    override fun getCountryCode(): String? {

        //
        TODO("Not yet implemented")
    }

    //
    public override fun toString(): String {

        //
        return ""
    }
}