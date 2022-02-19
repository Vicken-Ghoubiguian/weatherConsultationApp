package com.example.weatherconsultationapp.openweathermap

//
class Temperature {

    //
    private var value: Double? = null
    private var measureUnit: TemperatureUnitEnum? = null

    //
    constructor(value: Double) {

        //
        this.value = value
        this.measureUnit = TemperatureUnitEnum.KELVIN
    }

    //
    public fun getValue(): Double? {

        return this.value
    }
}