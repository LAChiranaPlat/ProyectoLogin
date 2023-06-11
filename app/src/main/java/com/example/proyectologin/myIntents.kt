package com.example.proyectologin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import com.example.proyectologin.databinding.ActivityMyIntentsBinding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class myIntents : AppCompatActivity() {

    lateinit var layout:ActivityMyIntentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityMyIntentsBinding.inflate(layoutInflater)
        setContentView(layout.root)

        layout.apply {

            btnLaunch.setOnClickListener {

                val picker =
                    MaterialTimePicker.Builder()
                        .setTimeFormat(TimeFormat.CLOCK_12H)
                        .setHour(0)
                        .setMinute(0)
                        .setTitleText("Selecciona la Hora de tu Alarma")
                        .build()

                picker.show(supportFragmentManager,"")

                picker.addOnPositiveButtonClickListener {
                    val intent=Intent(AlarmClock.ACTION_SET_ALARM)

                    intent.putExtra(AlarmClock.EXTRA_HOUR,picker.hour)
                    intent.putExtra(AlarmClock.EXTRA_MINUTES,picker.minute)
                    intent.putExtra(AlarmClock.EXTRA_MESSAGE,"mensaje")

                    startActivity(intent)

                }
                picker.addOnNegativeButtonClickListener {  }


            }

            btnTimer.setOnClickListener {

                val intent=Intent(AlarmClock.ACTION_SET_TIMER)
                intent.putExtra(AlarmClock.EXTRA_MESSAGE,"A Programar")
                intent.putExtra(AlarmClock.EXTRA_LENGTH,60)
                intent.putExtra(AlarmClock.EXTRA_SKIP_UI,true)

                startActivity(intent)

            }

            btnMaps.setOnClickListener {
/*
                val intent=Intent(Intent.ACTION_VIEW)
                intent.data= Uri.parse("geo:0,0?q=ica, ica, peru")

                startActivity(intent)
*/
                /*
                val intent=Intent(Intent.ACTION_DIAL)
                intent.data= Uri.parse("tel:922135474")
                startActivity(intent)
*/
/*
                val intent= Intent(Intent.ACTION_SENDTO)
                intent.data=Uri.parse("smsto:955221816")
                intent.putExtra("sms_body","es hora de programar")

                startActivity(intent)
*/

                startActivity(  Intent(MediaStore.ACTION_IMAGE_CAPTURE))


//                startActivity(  Intent(Intent.ACTION_PICK).apply {
//                    type="image/*"
//                }  )

/*
                var face="com.facebook.katana"
                var instagram="com.instagram.android"
                var vlc="org.videolan.vlc"

                val intent=packageManager.getLaunchIntentForPackage(vlc)
                startActivity(intent)
*/
            }


        }
    }
}