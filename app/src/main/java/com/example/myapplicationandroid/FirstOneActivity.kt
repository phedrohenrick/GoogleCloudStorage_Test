package com.example.myapplicationandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class FirstOneActivity : DebugActivity() {
    private val context: Context get() = this


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_one_screen)

        val dataReceived = intent.getStringExtra("EXTRA_DATA")
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = "$dataReceived, seja bem vindo a primeira tela da sua aplicação android."

        val first1 = findViewById<Button>(R.id.btnLogin)
        val previus = findViewById<Button>(R.id.btnCancel)
        first1.setOnClickListener {

            val intent = Intent(context, SecondOneActivity::class.java)
            intent.putExtra("EXTRA_DATA", dataReceived)
            startActivity(intent)


        }
        previus.setOnClickListener(){
            val intent = Intent(context, BemVindoActivity::class.java)
            intent.putExtra("EXTRA_DATA", dataReceived)
            startActivity(intent)
        }
    }

}
