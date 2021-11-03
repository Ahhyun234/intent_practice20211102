package com.nepplus.intent_practice20211102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoIntense.setOnClickListener {

            val newIntent = Intent(this,Practiceintence::class.java)
            startActivity(newIntent)
//  다른 화면으로 넘어가는 변수 선언 및 명령문 연습
        }
    }
}