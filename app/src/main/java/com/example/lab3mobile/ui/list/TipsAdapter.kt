package com.example.lab3mobile.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3mobile.R
import com.example.lab3mobile.data.Tip

class TipsAdapter(
    private val tips: List<Tip>,
    private val onTipClick: (Tip) -> Unit
) : RecyclerView.Adapter<TipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tip, parent, false)
        val holder = TipViewHolder(view)
        view.setOnClickListener {
            val position = holder.bindingAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                onTipClick(tips[position])
            }
        }
        return holder
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.dayText.text = holder.itemView.context.getString(R.string.tip_day, tip.day)
        holder.titleText.setText(tip.titleRes)
        holder.imageView.setImageResource(tip.imageRes)
        holder.summaryText.setText(tip.summaryRes)
    }

    override fun getItemCount(): Int = tips.size
}
