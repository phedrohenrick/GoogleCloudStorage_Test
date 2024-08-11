package com.example.myapplicationandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class BemVindoActivity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Visões
        setContentView(R.layout.activity_bem_vindo)


        val dataReceived = intent.getStringExtra("EXTRA_DATA")
        val textView = findViewById<TextView>(R.id.Bem_vindo)
        textView.text = "$dataReceived, seja bem vindo! NEXT para ir para a próxima página"

        val next1 = findViewById<Button>(R.id.buttonNext1)
        val previus = findViewById<Button>(R.id.btnCancel)

        next1.setOnClickListener{
            val intent = Intent(context, FirstOneActivity::class.java)
            intent.putExtra("EXTRA_DATA", dataReceived)
            startActivity(intent)

        }
        previus.setOnClickListener(){
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra("EXTRA_DATA", dataReceived)
            startActivity(intent)
        }
    }
}