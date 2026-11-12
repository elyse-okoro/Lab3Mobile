package com.example.lab3mobile.ui.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3mobile.R

/**
 * Хранит ссылки на элементы карточки: findViewById вызывается один раз, при создании.
 */
class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val dayText: TextView = itemView.findViewById(R.id.tip_day)
    val titleText: TextView = itemView.findViewById(R.id.tip_title)
    val imageView: ImageView = itemView.findViewById(R.id.tip_image)
    val summaryText: TextView = itemView.findViewById(R.id.tip_summary)
}
