package com.example.weatherconsultationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

// Definition of the 'MainActivity' class which define the main activity controller...
class MainActivity : AppCompatActivity() {

    // Declaration of all graphic elements for this little Android app...
    private var validationWeatherButton: Button? = null
    private var localisationNameSTextView: TextView? = null
    private var openWeatherAPIKeySTextView: TextView? = null
    private var countryCodesSpinner: Spinner? = null

    // Declaration of all elements to configure the OpenWeather HTTPS Request URL...
    private var firstPartOfOpenWeatherHTTPSRequest = "https://api.openweathermap.org/data/2.5/weather?q=";
    private var secondPartOfOpenWeatherHTTPSRequest = "&appid=";

    // Overriden function to create the main activity...
    override fun onCreate(savedInstanceState: Bundle?) {

        // Definition of the main activity...
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Extraction of the validation weather's button and its click listener...
        this.validationWeatherButton = findViewById(R.id.validationWeatherButton)
        validationWeatherButton!!.setOnClickListener {

            // Extraction of localisation's TextView and its value (a city, an island, an atoll or others)...
            this.localisationNameSTextView = findViewById(R.id.localisationName)
            val localisationName: String = localisationNameSTextView!!.text.toString()

            // Extraction of openWeather API Key's TextView and its value...
            this.openWeatherAPIKeySTextView = findViewById(R.id.openWeatherAPIKey)
            val openWeatherAPIKey: String = openWeatherAPIKeySTextView!!.text.toString()

            // Extraction of country code Spinner...
            this.countryCodesSpinner = findViewById(R.id.countryCodesSpinner)


        }
    }
}