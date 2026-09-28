package com.f52124019.aplikasi_uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AnggotaAdapter(private val context: Context, private val listAnggota: List<Anggota>) : BaseAdapter() {

    override fun getCount(): Int = listAnggota.size

    override fun getItem(position: Int): Any = listAnggota[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_anggota, parent, false)

        val imgFoto = view.findViewById<ImageView>(R.id.imgFoto)
        val tvNama = view.findViewById<TextView>(R.id.tvNama)
        val tvNim = view.findViewById<TextView>(R.id.tvNim)
        val tvProdi = view.findViewById<TextView>(R.id.tvProdi)
        val tvStatus = view.findViewById<TextView>(R.id.tvStatus)

        val anggota = listAnggota[position]

        tvNama.text = anggota.nama
        tvNim.text = "NIM. ${anggota.nim}"
        tvProdi.text = "Prodi: ${anggota.prodi}"
        tvStatus.text = "Status: ${anggota.status}"
        imgFoto.setImageResource(anggota.fotoResId)

        return view
    }
}
