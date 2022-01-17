package id.kotlin.affirmations.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import id.kotlin.affirmations.R
import id.kotlin.affirmations.main.MainAdapter.MainHolder
import kotlinx.android.synthetic.main.item_main.view.*
import kotlinx.android.synthetic.main.list_item.view.*

class ItemAdapter(private val values: List<Affirmation>) : Adapter<ItemAdapter.MainHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
    MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))

  override fun onBindViewHolder(holder: ItemAdapter.MainHolder, position: Int) {
    holder.bind(values[holder.adapterPosition])
  }

  override fun getItemCount() = values.count()

  inner class MainHolder(private val view: View) : ViewHolder(view) {
    fun bind(value: Affirmation) {
      with(view) {
        item_text.text = context.resources.getString(value.stringResourceId)
        item_image.setImageResource(value.imageResourceId)
      }
    }
  }
}