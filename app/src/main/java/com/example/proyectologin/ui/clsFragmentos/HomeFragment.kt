package com.example.proyectologin.ui.clsFragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentResultListener
import com.example.proyectologin.R
import com.example.proyectologin.databinding.ActivityHomeFragmentBinding

class HomeFragment : AppCompatActivity() {

    lateinit var layout:ActivityHomeFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityHomeFragmentBinding.inflate(layoutInflater)

        setContentView(layout.root)

        supportFragmentManager.setFragmentResultListener("dataButton",this,
            FragmentResultListener({req,data->
                Log.i("resultado",data.toString())
            })
        )

        layout.apply {
            btnChange.setOnClickListener {
                val pack=Bundle()
                pack.putString("status","1")


                supportFragmentManager.setFragmentResult("status",pack)
            }
        }

    }
}