package com.example.proyectologin.ui

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.PackageManagerCompat
import com.example.proyectologin.R
import com.example.proyectologin.databinding.ActivitySistemaBinding
import com.google.android.material.textfield.TextInputLayout

class Sistema : AppCompatActivity() {

    lateinit var layout: ActivitySistemaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivitySistemaBinding.inflate(layoutInflater)

        setContentView(layout.root)

        var nick=intent.getStringExtra("user")

        layout.apply {
            txtSaludo.text="Bievenido $nick al Sistema"
        }

    }
}