package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        set the layout
        setContentView(R.layout.activity_main)

//        first method
        val btnShowToast: Button = findViewById(R.id.btnShowToast)
        btnShowToast.setOnClickListener{
//            not work
            Log.i("MainActivity", "button was clicked!")

            Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()

        }

        val btnSecond: Button = findViewById(R.id.btnSecond)
        btnSecond.setOnClickListener{
//            get the user input on the text field
            val userInput: EditText = findViewById(R.id.userInput)
            val msg: String = userInput.text.toString()

//            show the toast msg
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

//            redirect to the another page
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)


        }
    }
}