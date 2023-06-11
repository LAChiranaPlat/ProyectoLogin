package com.example.proyectologin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.proyectologin.R
import com.example.proyectologin.core.Tools.empty
import com.example.proyectologin.core.Tools.hiddeKey
import com.example.proyectologin.core.Tools.message
import com.example.proyectologin.core.Tools.on
import com.example.proyectologin.core.Tools.str
import com.example.proyectologin.core.Tools.verifyForm
import com.example.proyectologin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var layout:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout = ActivityMainBinding.inflate(layoutInflater)

        setContentView(layout.root)

        layout.apply {

            tilNick.on()

            btnIngresar.onFocusChangeListener = View.OnFocusChangeListener({ view, focus ->
                if (focus) {
                    hiddeKey(this@MainActivity, view)
                }
            })

            btnIngresar.setOnClickListener {

                if (!verifyForm(content))
                    return@setOnClickListener

                if (!tilNick.str().equals("huarseral") || !tilKey.str().equals("jireh")) {
                    message(this@MainActivity,
                        getString(R.string.tituloLoginError),
                        getString(R.string.messageLoginError),
                        getString(R.string.btnOkLogin), {
                            tilNick.on()
                        })
                    return@setOnClickListener
                }

                /*val intento = Intent(this@MainActivity, Sistema::class.java)
                intento.putExtra("user",tilNick.str())
                startActivity(intento)*/

                startActivity(

                    Intent(this@MainActivity, Sistema::class.java).apply {
                        putExtra("user",tilNick.str())
                    }

                )



            }

        }

    }

}