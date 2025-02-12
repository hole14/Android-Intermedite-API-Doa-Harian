package com.example.apidoa

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apidoa.databinding.ActivityDetailDoaBinding
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONArray

class DetailDoaActivity : AppCompatActivity() {
    companion object{
        private val TAG = DetailDoaActivity::class.java.simpleName
    }
    private lateinit var binding: ActivityDetailDoaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val judul = intent.getStringExtra(DoaAdapter.EXTRA_DOA)
        val ayat = intent.getStringExtra(DoaAdapter.EXTRA_AYAT)
        val latin = intent.getStringExtra(DoaAdapter.EXTRA_LATIN)
        val arti = intent.getStringExtra(DoaAdapter.EXTRA_ARTI)

        binding.tvJudul.text = judul
        binding.tvAyat.text = ayat
        binding.tvLatin.text = latin
        binding.tvArti.text = arti

    }
}