package com.example.proyectologin.ui.clsFragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectologin.R
import com.example.proyectologin.databinding.ActivityContentFragmentBinding

class ContentFragment : AppCompatActivity() {

    lateinit var layout:ActivityContentFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityContentFragmentBinding.inflate(layoutInflater)
        setContentView(layout.root)

        val frInicio=Inicio()
        val frContactos=Contactos()
        val frCreditos=Creditos()

        layout.apply {


            btnInicio.setOnClickListener {

                val managerFrag=supportFragmentManager.beginTransaction()
                managerFrag.setCustomAnimations(R.anim.entradas,R.anim.salidas,0,0)
                managerFrag.replace(fcvScreen.id,frInicio)
                managerFrag.addToBackStack(null)
                managerFrag.commit()

            }

            btnContacts.setOnClickListener {

                val pack=Bundle()
                pack.putString("x","alexander")

                frContactos.arguments=pack

                val managerFrag=supportFragmentManager.beginTransaction()
                managerFrag.setCustomAnimations(R.anim.entradas,R.anim.salidas,0,0)
                managerFrag.replace(fcvScreen.id,frContactos)
                managerFrag.addToBackStack(null)
                managerFrag.commit()

            }

            btnCreditos.setOnClickListener {

                val pack=Bundle()
                pack.putString("y","LAChira Plat")

                frCreditos.arguments=pack

                val managerFrag=supportFragmentManager.beginTransaction()
                managerFrag.setCustomAnimations(R.anim.entradas,R.anim.salidas,0,0)
                managerFrag.replace(fcvScreen.id,frCreditos)
                managerFrag.addToBackStack(null)
                managerFrag.commit()
            }

        }

    }
}