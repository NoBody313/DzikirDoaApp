package com.example.dzikirdoaapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirdoaapp.Adapter.DzikirDoaAdapter
import com.example.dzikirdoaapp.DataDzikirDoa
import com.example.dzikirdoaapp.R

class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)

        val rvDzikirPagi = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}