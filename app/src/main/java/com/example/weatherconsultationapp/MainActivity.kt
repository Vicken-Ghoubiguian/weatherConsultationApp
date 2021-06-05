package com.example.weatherconsultationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// Definition of the 'MainActivity' class which define the main activity controller...
class MainActivity : AppCompatActivity() {

    // Overriden function to create the main activity...
    override fun onCreate(savedInstanceState: Bundle?) {

        // Definition of the main activity...
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        val validationWeatherButton: Button = findViewById(R.id.validationWeatherButton)


        // Extraction of wished localisation value (a city, an island, an atoll or others)...
        val localisationName: String = (findViewById(R.id.localisationName) as TextView).text.toString()

        // Extraction of informed openWeather API Key value...
        val openWeatherAPIKey: String = (findViewById(R.id.openWeatherAPIKey) as TextView).text.toString()
    }
}