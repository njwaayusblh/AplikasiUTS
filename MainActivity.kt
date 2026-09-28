package com.f52124019.aplikasi_uts

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listViewAnggota)

        val dataAnggota = listOf(
            Anggota(
                "Istianur Khalija",
                "F52124012",
                "Sistem Informasi",
                "Mahasiswa Aktif",
                R.drawable.istianur
            ),
            Anggota(
                "Riska Ayudia",
                "F52124025",
                "Sistem Informasi",
                "Mahasiswa Aktif",
                R.drawable.riska
            ),
            Anggota(
                "Najwa Ayu Sabilah",
                "F52124019",
                "Sistem Informasi",
                "Mahasiswa Aktif",
                R.drawable.najwa
            )
        )

        val adapter = AnggotaAdapter(this, dataAnggota)
        listView.adapter = adapter
    }
}
