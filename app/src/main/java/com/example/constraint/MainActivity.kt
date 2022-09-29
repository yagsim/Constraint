package com.example.constraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val switch: Switch= findViewById(R.id.switch1)
        val imagen: ImageView=findViewById(R.id.imageView2)
        val but:Button=findViewById(R.id.button)
        var bol=true
        var bole=true
        but.setOnClickListener{view->
            if(bole){
                imagen.setImageDrawable(getDrawable(R.drawable.foto))
                bole=false
            }else{
                imagen.setImageDrawable(null)
                bole=true
            }
        }

        switch.setOnClickListener{ view->
            if(bol){
                imagen.setImageDrawable(getDrawable(R.drawable.img_20220925_194220))
                bol=false
            }else{
                imagen.setImageDrawable(null)
                bol=true
            }
        }
    }


    }

