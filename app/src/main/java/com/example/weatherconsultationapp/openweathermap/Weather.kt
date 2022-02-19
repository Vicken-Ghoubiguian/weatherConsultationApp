package com.example.weatherconsultationapp.openweathermap

//
class Weather {

    //
    private var id: Int? = null
    private var main: String? = null
    private var description: String? = null
    private var iconUrl: String? = null

    //
    constructor(id: Int, main: String, description: String, iconUrl: String) {

        this.id = id
        this.main = main
        this.description = description
        this.iconUrl = iconUrl
    }

    //
    public fun getId(): Int? {

        return this.id
    }

    //
    public fun getMain(): String? {

        return this.main
    }

    //
    public fun getDescription(): String? {

        return this.description
    }

    //
    public fun getIconURL(): String? {

        return this.iconUrl
    }
}