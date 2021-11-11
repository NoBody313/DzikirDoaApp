package com.example.dzikirdoaapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.dzikirdoaapp.R

class PagiPetangDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang)

        // Pagi
        val cvDzikirPagi: CardView = findViewById(R.id.cv_dzikir_pagi)
        cvDzikirPagi.setOnClickListener {
            startActivity(Intent(this, DzikirPagiActivity::class.java))
        }

        val btnDzikirPagi: ImageView = findViewById(R.id.img_btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener {
            startActivity(Intent(this, DzikirPagiActivity::class.java))
        }

        // Petang
        val cvDzikirPetang: CardView = findViewById(R.id.cv_dzikir_petang)
        cvDzikirPetang.setOnClickListener {
            startActivity(Intent(this, DzikirPetangActivity::class.java))
        }

        val btnDzikirPetang: ImageView = findViewById(R.id.img_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener {
            startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
    }

//    override fun onClick(v: View?) {
//        when (v?.id){
//            R.id.cv_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
//            R.id.img_btn_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
//
//            R.id.cv_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
//            R.id.img_btn_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
//
//        }
//
//    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
