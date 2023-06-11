package com.example.proyectologin.core

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.forEach
import com.example.proyectologin.core.Tools.empty
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputLayout

object Tools {

    fun TextInputLayout.str()= this.editText?.text.toString()

    fun TextInputLayout.empty()= this.editText?.text!!.isEmpty()//verifica cada textinputlayout

    fun TextInputLayout.on(){
        this.editText?.requestFocus()
    }

    fun verifyForm(cl:ConstraintLayout):Boolean{

        cl.forEach { view->

            if(view is TextInputLayout)
                if(view.empty())
                    return false

        }

        return true

    }//revisa todo

    fun message(ct:Context,title:String,message:String,strSi:String="Aceptar",funcionSi:()->Unit={},strNo:String="Cancelar",funcionNO:()->Unit={},){

        MaterialAlertDialogBuilder(ct)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(strSi){x,y->
                funcionSi()
            }.setNegativeButton(strNo){x,y->
                funcionNO()
            }
            .show()

    }

    fun hiddeKey(ct:Context,v: View){
        val imm=ct.applicationContext.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken,0)
    }

}