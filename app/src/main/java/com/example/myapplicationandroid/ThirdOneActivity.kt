package com.example.myapplicationandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdOneActivity : DebugActivity()  {
        private val context: Context get() = this

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_third_one_screean)

            val dataReceived = intent.getStringExtra("EXTRA_DATA")
            val textView = findViewById<TextView>(R.id.textView2)
            textView.text = "$dataReceived, seja bem vindo a terceira tela da sua aplicação android."


            val second1 = findViewById<Button>(R.id.finish)
            second1.setOnClickListener {
                val intent = Intent(context, BemVindoActivity::class.java)
                intent.putExtra("EXTRA_DATA", dataReceived)
                startActivity(intent)
            }
        }
}