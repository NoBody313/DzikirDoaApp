package com.example.dzikirdoaapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirdoaapp.Adapter.DzikirDoaAdapter
import com.example.dzikirdoaapp.DataDzikirDoa
import com.example.dzikirdoaapp.R

class DzikirPetangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)

        val rvDzikirPetang = findViewById<RecyclerView>(R.id.rv_dzikir_petang)
        rvDzikirPetang.layoutManager = LinearLayoutManager(this)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rvDzikirPetang.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPetang)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}