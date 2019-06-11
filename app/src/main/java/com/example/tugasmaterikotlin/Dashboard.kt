package com.example.tugasmaterikotlin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        usernameView.text = Konstanta.username

        if (Konstanta.getGender() == "Men") {
            usernameView.setTextColor(Color.GREEN)
        } else {
            usernameView.setTextColor(Color.MAGENTA)
        }

        btnLogout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}