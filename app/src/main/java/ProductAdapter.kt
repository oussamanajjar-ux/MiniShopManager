package com.example.minishopmanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ProductAdapter(context: Context, private val products: List<Product>) :
    ArrayAdapter<Product>(context, 0, products) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView
            ?: LayoutInflater.from(context).inflate(R.layout.item_product, parent, false)

        val product = products[position]

        view.findViewById<ImageView>(R.id.imgProduct).setImageResource(product.imageRes)
        view.findViewById<TextView>(R.id.tvProductName).text = product.name

        view.findViewById<Button>(R.id.btnBuy).setOnClickListener {
            Toast.makeText(context, "Produit acheté : ${product.name}", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}