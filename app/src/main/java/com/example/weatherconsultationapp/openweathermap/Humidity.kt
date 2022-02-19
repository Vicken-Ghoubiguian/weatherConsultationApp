package com.example.weatherconsultationapp.openweathermap

//
class Humidity {

    //
    private var value: Int? = null
    private val unitScale: String = "%"

    //
    constructor(value: Int) {

        this.value = value
    }

    //
    public fun getValue(): Int? {

        return this.value
    }

    //
    public fun getUnitScale(): String {

        return this.unitScale
    }

    //
    public override fun toString(): String {

        return this.value.toString() + " " + this.unitScale
    }
}