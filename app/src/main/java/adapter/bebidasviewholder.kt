package adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycler_view20.bebidasA
import com.example.recycler_view20.databinding.LayaoutbebidasBinding

class bebidasviewholder (view:View):RecyclerView.ViewHolder(view){

    val binding= LayaoutbebidasBinding.bind(view)
    fun render(bebidasA: bebidasA){
        binding.nombre.text= bebidasA.nombre
        binding.origen.text= bebidasA.origen
        Glide.with(binding.foto.context).load(bebidasA.foto).into(binding.foto)
        itemView.setOnClickListener { Toast.makeText(itemView.context, "500 pesos", Toast.LENGTH_SHORT).show()
        //final223
        }
    }
}