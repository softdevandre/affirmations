package com.softdevandre.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.softdevandre.affirmations.adapter.ItemAdapter
import com.softdevandre.affirmations.data.Datasource
import com.softdevandre.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = binding.rvRecyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}