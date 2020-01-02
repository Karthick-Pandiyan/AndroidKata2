package com.kp.fizzbuzz

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

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
