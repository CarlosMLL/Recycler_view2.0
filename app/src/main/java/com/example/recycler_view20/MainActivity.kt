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
import adapter.adapter2
import adapter.bebidasA2


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView3()
        initRecyclerView()
       initRecyclerView2()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initRecyclerView3() {
        binding.Recyclerview2
    }
        private fun initRecyclerView(){
            binding.Recyclerview

        }
    private fun initRecyclerView2() {
        binding.Recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
       binding.Recyclerview2.layoutManager=LinearLayoutManager(this)
        binding.Recyclerview.adapter= bebidasadapter(bebidasProvider.bebida) {clickSelected(it) }
       binding.Recyclerview2.adapter=adapter2(bebidasA2.bebidas3)
    }
   fun clickSelected(bebidasA: bebidasA){
Toast.makeText(this, "500 pesos", Toast.LENGTH_SHORT).show()
    }
}