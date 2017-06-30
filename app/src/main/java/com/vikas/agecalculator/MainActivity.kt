package com.vikas.agecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Kotlin provides support library to direct access the view items by id
        /*btnFindAge.setOnClickListener {
            //Fired when button clicked
            calculateAgeAndShow()
        }*/
    }

    private fun calculateAgeAndShow() {
        val yearStr: String = etYearOfBirth.text.toString()

        val currentYear = Calendar.getInstance()[Calendar.YEAR]

        val yearOfBirth: Int = if (yearStr.length == 0) currentYear else yearStr.toInt()
        val myAge = currentYear - yearOfBirth
        tvMyAge.text = "Your age is $myAge years"
    }

    fun onFindAgeEvent(view: View) {
        calculateAgeAndShow()
    }
}
