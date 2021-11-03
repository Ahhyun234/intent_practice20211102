package com.nepplus.intent_practice20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_practiceintence.*

class Practiceintence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practiceintence)

        btnGoMain.setOnClickListener {

            finish()
        }
    }
}