package com.example.weatherconsultationapp.openweathermap

//
class UV {

    //
    private var index: Int? = null
    private var risk: UVRiskEnum? = null

    //
    public fun getIndex(): Int? {

        return this.index
    }

    //
    public fun getRisk(): UVRiskEnum? {

        return this.risk
    }
}