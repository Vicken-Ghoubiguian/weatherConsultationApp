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

        this.countryCodeArrayList.add("IO")
        this.countryCodeArrayList.add("BN")
        this.countryCodeArrayList.add("BG")
        this.countryCodeArrayList.add("BF")
        this.countryCodeArrayList.add("BI")
        this.countryCodeArrayList.add("CV")

        this.countryCodeArrayList.add("TD")
        this.countryCodeArrayList.add("CL")
        this.countryCodeArrayList.add("CN")
        this.countryCodeArrayList.add("CX")
        this.countryCodeArrayList.add("CC")
        this.countryCodeArrayList.add("CO")
        this.countryCodeArrayList.add("KM")
        this.countryCodeArrayList.add("CD")
        this.countryCodeArrayList.add("CG")
        this.countryCodeArrayList.add("CK")
        this.countryCodeArrayList.add("CR")
        this.countryCodeArrayList.add("HR")
        this.countryCodeArrayList.add("CU")
        this.countryCodeArrayList.add("CW")

        this.countryCodeArrayList.add("FI")
        this.countryCodeArrayList.add("FR")

        this.countryCodeArrayList.add("KP")
        this.countryCodeArrayList.add("KR")
        this.countryCodeArrayList.add("KW")
        this.countryCodeArrayList.add("KG")
        this.countryCodeArrayList.add("LA")
        this.countryCodeArrayList.add("LV")
        this.countryCodeArrayList.add("LB")
        this.countryCodeArrayList.add("LS")
        this.countryCodeArrayList.add("LR")
        this.countryCodeArrayList.add("LY")
        this.countryCodeArrayList.add("LI")
        this.countryCodeArrayList.add("LT")
        this.countryCodeArrayList.add("LU")
        this.countryCodeArrayList.add("MO")
        this.countryCodeArrayList.add("MG")
        this.countryCodeArrayList.add("MW")
        this.countryCodeArrayList.add("MY")
        this.countryCodeArrayList.add("MV")
        this.countryCodeArrayList.add("ML")
        this.countryCodeArrayList.add("MT")
        this.countryCodeArrayList.add("MH")
        this.countryCodeArrayList.add("MQ")
        this.countryCodeArrayList.add("MR")
        this.countryCodeArrayList.add("MU")
        this.countryCodeArrayList.add("YT")
        this.countryCodeArrayList.add("MX")
        this.countryCodeArrayList.add("FM")
        this.countryCodeArrayList.add("MD")
        this.countryCodeArrayList.add("MC")
        this.countryCodeArrayList.add("MN")
        this.countryCodeArrayList.add("ME")
        this.countryCodeArrayList.add("MS")
        this.countryCodeArrayList.add("MA")
        this.countryCodeArrayList.add("MZ")
        this.countryCodeArrayList.add("MM")
        this.countryCodeArrayList.add("NA")
        this.countryCodeArrayList.add("NR")
        this.countryCodeArrayList.add("NP")
        this.countryCodeArrayList.add("NL")
        this.countryCodeArrayList.add("NC")
        this.countryCodeArrayList.add("NZ")
        this.countryCodeArrayList.add("NI")
        this.countryCodeArrayList.add("NE")
        this.countryCodeArrayList.add("NG")
        this.countryCodeArrayList.add("NU")
        this.countryCodeArrayList.add("NF")
        this.countryCodeArrayList.add("MP")
        this.countryCodeArrayList.add("NO")
        this.countryCodeArrayList.add("OM")
        this.countryCodeArrayList.add("PK")
        this.countryCodeArrayList.add("PW")
        this.countryCodeArrayList.add("PS")
        this.countryCodeArrayList.add("PA")
        this.countryCodeArrayList.add("PG")
        this.countryCodeArrayList.add("PY")
        this.countryCodeArrayList.add("PE")
        this.countryCodeArrayList.add("PH")
        this.countryCodeArrayList.add("PN")
        this.countryCodeArrayList.add("PL")
        this.countryCodeArrayList.add("PT")
        this.countryCodeArrayList.add("PR")
        this.countryCodeArrayList.add("QA")
        this.countryCodeArrayList.add("MK")
        this.countryCodeArrayList.add("RO")
        this.countryCodeArrayList.add("RU")
        this.countryCodeArrayList.add("RW")
        this.countryCodeArrayList.add("RE")
        this.countryCodeArrayList.add("BL")
        this.countryCodeArrayList.add("SH")
        this.countryCodeArrayList.add("KN")
        this.countryCodeArrayList.add("LC")
        this.countryCodeArrayList.add("MF")
        this.countryCodeArrayList.add("PM")
        this.countryCodeArrayList.add("VC")
        this.countryCodeArrayList.add("WS")
        this.countryCodeArrayList.add("SM")
        this.countryCodeArrayList.add("ST")
        this.countryCodeArrayList.add("SA")
        this.countryCodeArrayList.add("SN")
        this.countryCodeArrayList.add("RS")
        this.countryCodeArrayList.add("SC")
        this.countryCodeArrayList.add("SL")
        this.countryCodeArrayList.add("SG")
        this.countryCodeArrayList.add("SX")
        this.countryCodeArrayList.add("SK")
        this.countryCodeArrayList.add("SI")
        this.countryCodeArrayList.add("SB")
        this.countryCodeArrayList.add("SO")
        this.countryCodeArrayList.add("ZA")
        this.countryCodeArrayList.add("GS")
        this.countryCodeArrayList.add("SS")
        this.countryCodeArrayList.add("ES")
        this.countryCodeArrayList.add("LK")
        this.countryCodeArrayList.add("SD")
        this.countryCodeArrayList.add("SR")
        this.countryCodeArrayList.add("SJ")
        this.countryCodeArrayList.add("SE")
        this.countryCodeArrayList.add("CH")
        this.countryCodeArrayList.add("SY")
        this.countryCodeArrayList.add("TW")
        this.countryCodeArrayList.add("TJ")
        this.countryCodeArrayList.add("TZ")
        this.countryCodeArrayList.add("TH")
        this.countryCodeArrayList.add("TL")
        this.countryCodeArrayList.add("TG")
        this.countryCodeArrayList.add("TK")
        this.countryCodeArrayList.add("TO")
        this.countryCodeArrayList.add("TT")
        this.countryCodeArrayList.add("TN")
        this.countryCodeArrayList.add("TR")
        this.countryCodeArrayList.add("TM")
        this.countryCodeArrayList.add("TC")
        this.countryCodeArrayList.add("TV")
        this.countryCodeArrayList.add("UG")
        this.countryCodeArrayList.add("UA")
        this.countryCodeArrayList.add("AE")
        this.countryCodeArrayList.add("GB")
        this.countryCodeArrayList.add("UM")
        this.countryCodeArrayList.add("US")
        this.countryCodeArrayList.add("UY")
        this.countryCodeArrayList.add("UZ")
        this.countryCodeArrayList.add("VU")
        this.countryCodeArrayList.add("VE")
        this.countryCodeArrayList.add("VN")
        this.countryCodeArrayList.add("VG")
        this.countryCodeArrayList.add("VI")
        this.countryCodeArrayList.add("WF")
        this.countryCodeArrayList.add("EH")
        this.countryCodeArrayList.add("YE")
        this.countryCodeArrayList.add("ZM")
        this.countryCodeArrayList.add("ZW")
        this.countryCodeArrayList.add("AX")

        // Extraction of country code Spinner...
        this.countryCodesSpinner = findViewById(R.id.countryCodesSpinner)
        //this.countryCodesSpinner!!.se

        // Extraction of the validation weather's button and its click listener...
        this.validationWeatherButton = findViewById(R.id.validationWeatherButton)
        validationWeatherButton!!.setOnClickListener {

            // Extraction of localisation's TextView and its value (a city, an island, an atoll or others)...
            this.localisationNameSTextView = findViewById(R.id.localisationName)
            val localisationName: String = localisationNameSTextView!!.text.toString()

            // Extraction of openWeather API Key's TextView and its value...
            this.openWeatherAPIKeySTextView = findViewById(R.id.openWeatherAPIKey)
            val openWeatherAPIKey: String = openWeatherAPIKeySTextView!!.text.toString()

            //
        }
    }
}