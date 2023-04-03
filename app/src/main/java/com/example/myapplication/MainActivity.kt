package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var database:DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val user=User(binding.editTextTextPersonName.editableText.toString(),binding.editTextTextEmailAddress.editableText.toString(),binding.editTextPhone.editableText.toString(),binding.editTextTextPassword.editableText.toString())
            database=FirebaseDatabase.getInstance().reference
            database.child(binding.editTextTextPersonName.editableText.toString()).setValue(user).addOnSuccessListener {
                Toast.makeText(this, "Successfully Registered", Toast.LENGTH_SHORT).show()
               binding.editTextPhone.editableText.clear()
                binding.editTextTextPassword.editableText.clear()
                binding.editTextTextEmailAddress.editableText.clear()
                binding.editTextTextPersonName.editableText.clear()

            }.addOnFailureListener {
                Toast.makeText(this, "Try Again or check your connection", Toast.LENGTH_SHORT).show()
            }


        }


    }
}