package com.kp.fizzbuzz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fizzBuzz = FizzBuzz()
        for (i in 1..100){
            System.out.println("$i = ${fizzBuzz.convert(i)}")
        }
    }
}
