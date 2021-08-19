package com.app_devs.recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.app_devs.recyclerview.R
import com.app_devs.recyclerview.databinding.ItemCardBinding
import com.app_devs.recyclerview.models.EntryModel
import com.bumptech.glide.Glide

open class EntryAdapter(private val context: Context, private val list:ArrayList<EntryModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(ItemCardBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model=list[position]
       if(holder is MyViewHolder)
       {
           holder.binding.name.text=model.name
           Glide.with(context).load(model.image).into(holder.binding.ivPhoto)
           if(position%2==0)
           {
               holder.binding.layout.setBackgroundColor(ContextCompat.getColor(context,R.color.evenBg))
           }
           else
           {
               holder.binding.
                   layout.setBackgroundColor(ContextCompat.getColor(context,R.color.white))
           }
       }
    }

    override fun getItemCount(): Int {
       return list.size
    }
    class MyViewHolder(val binding: ItemCardBinding):RecyclerView.ViewHolder(binding.root)
}