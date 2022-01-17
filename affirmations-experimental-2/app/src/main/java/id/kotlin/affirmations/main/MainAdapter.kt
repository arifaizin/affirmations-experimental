package id.kotlin.affirmations.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import id.kotlin.affirmations.R
import id.kotlin.affirmations.main.MainAdapter.MainHolder
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter(private val values: List<String>) : Adapter<MainHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
    MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false))

  override fun onBindViewHolder(holder: MainHolder, position: Int) {
    holder.bind(values[holder.adapterPosition])
  }

  override fun getItemCount() = values.count()

  inner class MainHolder(private val view: View) : ViewHolder(view) {
    fun bind(value: String) {
      with(view) {
        tv_main.text = value
      }
    }
  }
}