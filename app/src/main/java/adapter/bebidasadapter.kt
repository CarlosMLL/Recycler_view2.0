package adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view20.bebidasA
import com.example.recycler_view20.R

class bebidasadapter (private val bebidasB:List<bebidasA>, private val click:(bebidasA)->Unit): RecyclerView.Adapter<bebidasviewholder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bebidasviewholder {
        val layoutinflater= LayoutInflater.from(parent.context)
        return bebidasviewholder(layoutinflater.inflate(R.layout.layaoutbebidas, parent, false))
    }

    override fun getItemCount(): Int {
       return bebidasB.size
    }

    override fun onBindViewHolder(holder: bebidasviewholder, position: Int) {
        val item = bebidasB[position]
        holder.render(item, click)
    }
}