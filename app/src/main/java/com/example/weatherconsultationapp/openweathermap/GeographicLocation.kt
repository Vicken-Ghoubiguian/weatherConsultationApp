package com.example.weatherconsultationapp.openweathermap

//
class GeographicLocation {

    //
    private var countryCode: String? = null
    private var cityName: String? = null

    //
    constructor(countryCode: String, cityName: String) {

        //
        this.countryCode = countryCode
        this.cityName = cityName
    }

    //
    public fun getCountryCode(): String? {

        return this.countryCode
    }

    //
    public fun getCityName(): String? {

        return this.cityName
    }
}