package com.example.proyectologin.ui.clsFragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.proyectologin.R
import com.example.proyectologin.databinding.FragmentInicioBinding

class Inicio : Fragment() {

    lateinit var layout:FragmentInicioBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layout= FragmentInicioBinding.inflate(inflater,container,false)
        return layout.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layout.apply {

            btnInfo.setOnClickListener {

                val info=MyMessage()

                info.isCancelable=false

                info.show(parentFragmentManager,"")

            }

        }
    }

}