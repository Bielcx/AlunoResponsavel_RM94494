import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.github.caiowilleman.alunoresponsavel_rm93407.Dica
import com.github.caiowilleman.alunoresponsavel_rm93407.R

class DicaAdapter(private val listaDicas: List<Dica>) : RecyclerView.Adapter<DicaAdapter.DicaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DicaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dica, parent, false)
        return DicaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DicaViewHolder, position: Int) {
        val dica = listaDicas[position]
        holder.tituloTextView.text = dica.titulo
        holder.descricaoTextView.text = dica.descricao
    }

    override fun getItemCount() = listaDicas.size

    class DicaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tituloTextView: TextView = itemView.findViewById(R.id.tituloTextView)
        val descricaoTextView: TextView = itemView.findViewById(R.id.descricaoTextView)
    }
}
