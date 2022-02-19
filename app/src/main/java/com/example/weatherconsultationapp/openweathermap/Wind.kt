package com.example.weatherconsultationapp.openweathermap

//
class Wind {

    //
    private var speed: Double? = null
    private var deg: Double? = null
    private var gust: Double? = null

    //
    constructor(speed: Double, deg: Double, gust: Double) {

        this.speed = speed
        this.deg = deg
        this.gust = gust
    }

    //
    public fun getSpeed(): Double? {

        return this.speed
    }

    //
    public fun getDeg(): Double? {

        return this.deg
    }

    //
    public fun getGust(): Double? {

        return this.gust
    }

    //
    public override fun toString(): String {

        return ""
    }
}