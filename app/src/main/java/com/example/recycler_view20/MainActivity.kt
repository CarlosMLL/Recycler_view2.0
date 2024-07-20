package com.example.recycler_view20

import adapter.bebidasadapter
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycler_view20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

        private fun initRecyclerView(){
            binding.Recyclerview.layoutManager = LinearLayoutManager(this)
            binding.Recyclerview.adapter= bebidasadapter(bebidasProvider.bebida) {clickSelected(it)}

        }
    fun clickSelected(bebidasA: bebidasA){
Toast.makeText(this, "500 pesos", Toast.LENGTH_SHORT).show()
    }
//hola mundo
}