package com.example.firstapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        get the data from first activity
        val bundle: Bundle? = intent.extras

//        get the passed data in first activity
        val msg = bundle!!.getString("user_input")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        val textView: TextView = findViewById(R.id.textView2)

//        given text show in layout two
        textView.text = msg





    }
}