package com.example.minishopmanager

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CatalogueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)

        val listView = findViewById<ListView>(R.id.listViewProduits)

        val products = listOf(
            Product("Téléphone", R.drawable.ic_phone),
            Product("Casque Bluetooth", R.drawable.ic_headset),
            Product("Montre connectée", R.drawable.ic_watch),
            Product("Chargeur USB", R.drawable.ic_usb),
            Product("Accessoires", R.drawable.ic_accessories),
            Product("Cosmétiques", R.drawable.ic_cosmetics)
        )

        listView.adapter = ProductAdapter(this, products)

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                "Produit sélectionné : ${products[position].name}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}