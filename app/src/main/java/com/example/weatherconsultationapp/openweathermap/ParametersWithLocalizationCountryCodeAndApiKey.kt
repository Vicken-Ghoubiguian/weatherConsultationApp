package com.example.weatherconsultationapp.openweathermap

//
class ParametersWithLocalizationCountryCodeAndApiKey : Parameters {

    //
    override var parametersType: ParametersEnum = ParametersEnum.PARAMETERSWITHLOCALIZATIONCOUNTRYCODEAPIKEY

    //
    private var localization: String? = null
    private var countryCode: String? = null
    private var apiKey: String? = null

    //
    constructor(localization: String, countryCode: String, apiKey: String) {

        //
        this.localization = localization
        this.countryCode = countryCode
        this.apiKey = apiKey
    }

    //
    public override fun getLocalization(): String? {

        //
        return this.localization
    }

    //
    public override fun getCountryCode(): String? {

        //
        return this.countryCode
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