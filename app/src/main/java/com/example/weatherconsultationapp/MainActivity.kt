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

    // Declaration of the ArrayList which will contain all countryCodes to use in UI spinner...
    private var countryCodeArrayList = ArrayList<String>()

    // Overriden function to create the main activity...
    override fun onCreate(savedInstanceState: Bundle?) {

        // Definition of the main activity...
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adding all of the country codes in the specified ArrayList<String>...
        this.countryCodeArrayList.add("AL")
        this.countryCodeArrayList.add("AF")
        this.countryCodeArrayList.add("DZ")
        this.countryCodeArrayList.add("AS")
        this.countryCodeArrayList.add("AD")

        this.countryCodeArrayList.add("EH")
        this.countryCodeArrayList.add("YE")
        this.countryCodeArrayList.add("ZM")
        this.countryCodeArrayList.add("ZW")
        this.countryCodeArrayList.add("AX")

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