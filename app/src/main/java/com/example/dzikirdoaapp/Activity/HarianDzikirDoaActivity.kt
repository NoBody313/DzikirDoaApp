package com.example.dzikirdoaapp.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirdoaapp.Adapter.DzikirDoaAdapter
import com.example.dzikirdoaapp.DataDzikirDoa.listDzikir
import com.example.dzikirdoaapp.DzikirDoa
import com.example.dzikirdoaapp.R

class HarianDzikirDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harian_dzikir_doa)

        val rvDzikirDoaHarian = findViewById<RecyclerView>(R.id.rv_dzikir_doa_harian)
        rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rvDzikirDoaHarian.adapter = DzikirDoaAdapter(listDzikir)
    }

    private fun iniData() {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in desc.indices) {
            val Dzikir = DzikirDoa(
                desc[data],
                lafaz[data],
                terjemah[data],
            )
            listDzikir.add(Dzikir)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}