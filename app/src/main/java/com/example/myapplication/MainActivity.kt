package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val emailEditText=findViewById<EditText>(R.id.editTextTextEmailAddress)
    val nameEditText=findViewById<EditText>(R.id.editTextTextPersonName)
    val phoneEditText=findViewById<EditText>(R.id.editTextPhone)
    val passwordEditText=findViewById<EditText>(R.id.editTextTextPassword)
    val submit=findViewById<Button>(R.id.button2)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener {
            val user=User(nameEditText.text.toString(),emailEditText.text.toString(),phoneEditText.text.toString(),passwordEditText.text.toString())

        }


    }
}