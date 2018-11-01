package com.cristhian.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista:ListView = findViewById(R.id.lista)
        val list = arrayOf("Elemento 1","Elemento 2","Elemento 3","Elemento 4",
                            "Elemento 5","Elemento 6","Elemento 7","Elemento 8",
                            "Elemento 9","Elemento 10","Elemento 11","Elemento 12",
                            "Elemento 13","Elemento 14","Elemento 15","Elemento 16",
                            "Elemento 17","Elemento 18","Elemento 19","Elemento 20",
                            "Elemento 21","Elemento 22","Elemento 23","Elemento 24",
                            "Elemento 25","Elemento 26","Elemento 27","Elemento 28")
        lista.adapter = MyAdapter(this,list)
    }
}
