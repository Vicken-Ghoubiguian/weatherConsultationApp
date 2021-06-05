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
        validationWeatherButton.setOnClickListener {

            // Extraction of wished localisation value (a city, an island, an atoll or others)...
            val localisationNameSTextView: TextView = findViewById(R.id.localisationName)
            val localisationName: String = localisationNameSTextView.text.toString()

            // Extraction of informed openWeather API Key value...
            val openWeatherAPIKeySTextView: TextView = findViewById(R.id.openWeatherAPIKey)
            val openWeatherAPIKey: String = openWeatherAPIKeySTextView.text.toString()
        }
    }
}