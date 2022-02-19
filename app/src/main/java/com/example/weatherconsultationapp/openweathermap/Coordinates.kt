package com.example.weatherconsultationapp.openweathermap

//
class Coordinates {

    //
    private var longitude: Double? = null
    private var latitude: Double? = null

    //
    constructor(longitude: Double, latitude: Double) {

        //
        this.longitude = longitude
        this.latitude = latitude
    }

    //
    public fun getLongitude(): Double? {

        return this.longitude
    }

    //
    public fun getLatitude(): Double? {

        return this.latitude
    }

    //
    public override fun toString(): String {

        return "(" + this.longitude + "," + this.latitude + ")"
    }
}