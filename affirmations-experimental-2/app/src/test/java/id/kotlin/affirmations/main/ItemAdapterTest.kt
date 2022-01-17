package id.kotlin.affirmations.main

import id.kotlin.affirmations.R
import org.junit.Assert.*
import org.junit.Test

class ItemAdapterTest{
    @Test
    fun checkAdapterSize(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(data)

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

    }
}