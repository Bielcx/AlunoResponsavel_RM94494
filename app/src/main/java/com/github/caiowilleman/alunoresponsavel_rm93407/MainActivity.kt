import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.caiowilleman.alunoresponsavel_rm93407.Dica
import com.github.caiowilleman.alunoresponsavel_rm93407.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DicaAdapter(getDicas())
    }

    private fun getDicas(): List<Dica> {
        return listOf(
            Dica("Use lâmpadas LED", "Substitua suas lâmpadas incandescentes por LED para economizar energia."),
            Dica("Desligue aparelhos em standby", "Evite deixar aparelhos eletrônicos em modo standby.")
            // Adicione mais dicas aqui
        )
    }
}
