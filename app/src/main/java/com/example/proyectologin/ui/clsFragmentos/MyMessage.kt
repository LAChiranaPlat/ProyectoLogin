package com.example.proyectologin.ui.clsFragmentos

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.proyectologin.R
import com.example.proyectologin.databinding.FragmentMyMessageBinding

class MyMessage : DialogFragment() {

    lateinit var layout:FragmentMyMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        layout=FragmentMyMessageBinding.inflate(inflater,container,false)

        return layout.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layout.bntGo.setOnClickListener {
            dismiss()
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        returnTransition
       // super.onDismiss(dialog)
        Log.i("result","Clic en el lado oscuro de la luna")
    }//volver modal

}