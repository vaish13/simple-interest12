package com.example.simpleinterest

import android.icu.util.LocaleData.MeasurementSystem.SI
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncal : Button = findViewById(R.id.btn)

        val txtprincipal : EditText = findViewById(R.id.edittextprincipal)

        val txtrate : EditText = findViewById(R.id.edittextrate)

        val txttym : EditText = findViewById(R.id.edittexttym)

        val ans: TextView = findViewById(R.id.tverror)



        btncal.setOnClickListener{

            val principal=txtprincipal.text.toString().toInt()

            val rate=txtrate.text.toString().toInt()

            val tym=txttym.text.toString().toInt()

            val SI=(principal*rate*tym)/100;
            ans.text=SI.toString()

        }


    }
}