package id.kotlin.affirmations.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import id.kotlin.affirmations.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

//    val values = resources.getStringArray(R.array.fruits)

    val fruits = mutableListOf<String>()
    for (fruit in 1 until 100.plus(1)) {
      fruits.add("Fruits $fruit")
    }

    val dataSet = DataSource().loadAffirmations()
//    val adapter = MainAdapter(fruits)
    val adapter = ItemAdapter(dataSet)
    rv_main.adapter = adapter
    rv_main.layoutManager = GridLayoutManager(this, 2)
  }
}