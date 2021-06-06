package com.hizkeel.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        feedTheFish();

        filter()
    }

    fun filter(){
        val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
        println( decorations.filter {it[0] == 'p'})
    }

    fun fishFood (day : String) : String {
        var food = ""
        when (day) {
            "Monday" -> food = "flakes"
            "Tuesday" -> food = "pellets"
            "Wednesday" -> food = "redworms"
            "Thursday" -> food = "granules"
            "Friday" -> food = "mosquitoes"
            "Saturday" -> food = "lettuce"
            "Sunday" -> food = "plankton"
        }
        return food
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)

        println ("Today is $day and the fish eat $food")
    }

    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")


        val x = week[Random().nextInt(week.size)]

        println (x)

        return x
    }
}