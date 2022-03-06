package com.example.weatherconsultationapp.openweathermap

//
class ParametersWithLocalizationAndApiKey : Parameters {

    //
    override var parametersType: ParametersEnum = ParametersEnum.PARAMETERSWITHLOCALIZATIONAPIKEY

    //
    private var localization: String? = null
    private var apiKey: String? = null

    //
    constructor(localization: String, apiKey: String) {

        //
        this.localization = localization
        this.apiKey = apiKey
    }

    //
    public override fun getLocalization(): String? {

        //
        return this.localization
    }

    //
    public override fun getCountryCode(): String? {

        TODO("Not yet implemented")
    }

    //
    public override fun getAPIKey(): String? {

        //
        return this.apiKey
    }

    //
    override fun getLatitude(): Double? {

        //
        TODO("Not yet implemented")
    }

    //
    override fun getLongitude(): Double? {

        //
        TODO("Not yet implemented")
    }

    //
    public override fun toString(): String {

        //
        return ""
    }
}