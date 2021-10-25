package com.example.coffeshops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Tarjeta>()
        items.add(Tarjeta("Antico Caffe Greco", R.drawable.images, "St. Italy, Rome"))
        items.add(Tarjeta("Coffee Room", R.drawable.images1, "St. Germany, Berlin"))
        items.add(Tarjeta("Coffee Ibiza", R.drawable.images2, "St. Colon, Madrid"))
        items.add(Tarjeta("Pudding Coffee Shop", R.drawable.images3, "St. Diagonal, Barcelona"))
        items.add(Tarjeta("L' Express", R.drawable.images4, "St. Picadilly Circus, London"))
        items.add(Tarjeta("Coffe corner", R.drawable.images5, "St. Angel Guimera, Valencia"))
        items.add(Tarjeta("Sweet Cup", R.drawable.images6, "St. Kinkerstraat, Amsterdam"))

        val recView = findViewById<RecyclerView>(R.id.recyclerView)
        recView.setHasFixedSize(true)
        val adaptador = CardsAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this)
        adaptador.onClick = {
        }
    }
}