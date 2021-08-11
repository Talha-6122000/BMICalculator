package com.example.bmicalculator.ui.home.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bmicalculator.R
import com.example.bmicalculator.ui.home.model.AgeModel

class AgeAdapter(val ageNumber:ArrayList<AgeModel>,val context: Context) : RecyclerView.Adapter<AgeAdapter.ViewHolder>() {
    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view)
    {

      val tvAge=view.findViewById<TextView>(R.id.age_tv);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.age_layout,
                parent,
                false
            )
        )    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: AgeModel = ageNumber[position]

        holder.tvAge.text = model.getAge().toString()
        if(model.getIsOnScreen())
        {
            holder.tvAge.setTextColor(Color.BLACK)
        }
        else
        {
            holder.tvAge.setTextColor(Color.parseColor("#212121"))
        }
    }

    override fun getItemCount(): Int {
        return ageNumber.size
    }

}