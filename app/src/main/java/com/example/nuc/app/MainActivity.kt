package com.example.nuc.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

val database = FirebaseDatabase.getInstance()
val myRef = database.getReference("Brad")

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write a message to the database

        val dogs = myRef.child("Dog_1")

        TextBox.text = dogs.toString()
    }


}
