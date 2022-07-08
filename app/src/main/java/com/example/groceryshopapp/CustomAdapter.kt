package com.example.groceryshopapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (private val mList: List<ItemViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        holder.txt_Item_Name.text = ItemsViewModel.itemName
        holder.txt_Item_Qnty.text = ItemsViewModel.itemQnty
        holder.txt_Item_Price.text = ItemsViewModel.itemPrice
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val txt_Item_Name: TextView = itemView.findViewById(R.id.txt_item_name)
        val txt_Item_Qnty: TextView = itemView.findViewById(R.id.txt_item_qnty)
        val txt_Item_Price: TextView = itemView.findViewById(R.id.txt_item_price)

    }
}
