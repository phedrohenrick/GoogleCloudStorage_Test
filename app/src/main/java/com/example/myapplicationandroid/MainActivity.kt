package com.example.myapplicationandroid

import com.example.myapplicationandroid.BemVindoActivity
import com.example.myapplicationandroid.DebugActivity

import android.content.Context
import android.os.Bundle
import android.widget.*
import android.content.Intent
import com.example.myapplicationandroid.R

class MainActivity : DebugActivity() {

    private val TAG = "RastrearCiclodeVida"

    private val context: Context get() = this


    override fun onCreate(sevedInstaceState: Bundle?) {
        super.onCreate(sevedInstaceState)
        //Definindo visao
        setContentView(R.layout.activity_main)//chamo a activity
        val btLogin = findViewById<Button>(R.id.buttonFazLogin)
        btLogin.setOnClickListener{
            val tLogin = findViewById<TextView>(R.id.editTextLogin)
            val tSenha = findViewById<TextView>(R.id.editTextSenha)
            // val tcheck = findViewById<CheckBox>(R.id.checkboxnFazLogin)
            val login: String = tLogin.text.toString()
            val senha: String = tSenha.text.toString()
            //val checked: Boolean = tcheck.isChecked

            if(login != " " && senha != " " /*&& checked*/){

                val intent = Intent(context, BemVindoActivity::class.java)
                intent.putExtra("EXTRA_DATA", login)
                startActivity(intent)

            }//else{
             //   toast("Login ou senha inválidos!!")
           // }

        }
    }

    private fun toast(s: String) {

    }

}

