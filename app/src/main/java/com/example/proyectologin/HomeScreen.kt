package com.example.proyectologin


import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.proyectologin.databinding.ActivityMainBinding
import com.example.proyectologin.databinding.FragmentHomeScreenBinding

class HomeScreen : Fragment() {

    lateinit var layout: FragmentHomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        layout= FragmentHomeScreenBinding.inflate(inflater,container,false)
        return layout.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layout.apply {

            btnHome.setOnClickListener {
                //Log.i("result","Click en el Boton: Inicio")
                val p=Bundle()
                p.putString("asas","sasasas")
                Navigation.findNavController(it).navigate(R.id.action_homeScreen_to_blankFragmentA,p)
            }

            btnNosotros.setOnClickListener {
                //Log.i("result","Click en el Boton: Nosotros")
                Navigation.findNavController(it).navigate(R.id.action_homeScreen_to_blankFragmentB)
            }

            btnContactos.setOnClickListener {
                //Log.i("result","Click en el Boton: Contactos")
                Navigation.findNavController(it).navigate(R.id.action_homeScreen_to_blankFragmentC)

            }

        }

    }

}