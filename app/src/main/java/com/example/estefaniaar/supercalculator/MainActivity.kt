package com.example.estefaniaar.supercalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View)
    {
        var a = number1.text.toString().toInt()
        var b = number2.text.toString().toInt()
        val res = a + b
        result.text = "Result: $res"
    }
    fun sub (view: View)
    {
        var a = number1.text.toString().toInt()
        var b = number2.text.toString().toInt()
        val res = a - b
        result.text = "Result: $res"
    }
    fun mul(view: View)
    {
        var a = number1.text.toString().toInt()
        var b = number2.text.toString().toInt()
        val res = a * b
        result.text = "Result: $res"
    }
    fun div (view: View)
    {
        var a = number1.text.toString().toDouble()
        var b = number2.text.toString().toDouble()
        val res = a / b
        result. text = "Result: $res"
    }
}
