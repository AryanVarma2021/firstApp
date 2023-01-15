package com.example.security

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class memberAdapter(private val listMembers: List<memberModel>) : RecyclerView.Adapter<memberAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent : ViewGroup, viewType:Int): memberAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.item_member, parent, false)
        return ViewHolder(item)
    }
    override fun onBindViewHolder(holder : memberAdapter.ViewHolder, position :Int) {
        val item = listMembers[position]
        holder.username.text = item.name
    }
    override fun getItemCount() : Int {
        return listMembers.size

    }
    class ViewHolder(val item : View) : RecyclerView.ViewHolder(item) {
        val username = item.findViewById<TextView>(R.id.user_name)
        val imguser = item.findViewById<ImageView>(R.id.user_img)
        val useraddress = item.findViewById<TextView>(R.id.user_address)
        val time = item.findViewById<TextView>(R.id.time)
        val imgbattery = item.findViewById<ImageView>(R.id.img_battery)
        val batteryText = item.findViewById<TextView>(R.id.textbattery)
        val imglocation = item.findViewById<ImageView>(R.id.img_location)
        val locationtext = item.findViewById<TextView>(R.id.textlocation)
        val imgwifi = item.findViewById<ImageView>(R.id.img_wifi)
        val wifiText = item.findViewById<TextView>(R.id.textwifi)
        val call = item.findViewById<ImageView>(R.id.call)




    }

}