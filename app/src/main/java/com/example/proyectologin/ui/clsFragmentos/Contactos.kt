package com.example.proyectologin.ui.clsFragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentResultListener
import com.example.proyectologin.R
import com.example.proyectologin.databinding.FragmentContactosBinding

class Contactos : Fragment() {

    lateinit var layout:FragmentContactosBinding
    lateinit var usuario:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        usuario=arguments?.getString("x","SN")!!
    }

    override fun onCreateView(//CREAN LAS VISTAS
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        layout= FragmentContactosBinding.inflate(inflater,container,false)
        return layout.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {//VISTAS CREADAS
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireContext(),usuario,Toast.LENGTH_LONG).show()

        layout.apply {

            btnA.setOnClickListener {
                var message="Click en el primer boton"
                Toast.makeText(requireContext(),message,Toast.LENGTH_LONG).show()

                val pack=Bundle()
                pack.putString("mss",message)

                parentFragmentManager.setFragmentResult("dataButton",pack)

            }

            btnB.setOnClickListener {
                var message="Click en el segundo boton"
                Toast.makeText(requireContext(),message,Toast.LENGTH_LONG).show()

            }

        }

        var cont=0;
        parentFragmentManager.setFragmentResultListener("status",this, FragmentResultListener({req,paq->
            Toast.makeText(requireContext(),paq.getString("status","---"),Toast.LENGTH_LONG).show()
            layout.btnA.text="Cambio de Texto $cont"
            cont++
        }))

    }


}