package com.example.myapplicationandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondOneActivity : DebugActivity() {
    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_one_screen)

        val dataReceived = intent.getStringExtra("EXTRA_DATA")
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = "$dataReceived, seja bem vindo a segunda tela da sua aplicação android."

        val second1 = findViewById<Button>(R.id.btnNext)
        val previus = findViewById<Button>(R.id.btnPrevius)

        second1.setOnClickListener {
            val intent = Intent(context, ThirdOneActivity::class.java)
            intent.putExtra("EXTRA_DATA", dataReceived)
            startActivity(intent)
        }
        previus.setOnClickListener(){
            val intent = Intent(context, FirstOneActivity::class.java)
            intent.putExtra("EXTRA_DATA", dataReceived)
            startActivity(intent)
        }

    }

}