package com.example.tugasmaterikotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gender = arrayOf("Men", "Woman")
        val spinner = findViewById<Spinner>(R.id.spinnerGender)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, gender)
        spinner.adapter = arrayAdapter

        btnLogin.setOnClickListener {
            if (username.text.toString().equals("")) {
                Toast.makeText(applicationContext, "Please Fill all data", Toast.LENGTH_SHORT).show()
            } else {
                Konstanta.setGender(spinner.selectedItem.toString())
                Konstanta.username = username.text.toString()
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
            }
        }
    }
}
