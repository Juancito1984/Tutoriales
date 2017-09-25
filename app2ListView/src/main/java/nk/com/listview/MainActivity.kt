package nk.com.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuarios =  arrayListOf<String>()

        for (i in 1..30){
            usuarios.add("Usuario $i")
        }

        val adaptador = ArrayAdapter(this,android.R.layout.simple_list_item_1, usuarios)

        mLvUsuarios.adapter = adaptador

        mLvUsuarios.setOnItemClickListener { adapterView, view, i, l ->
            alertas("Precionaste el ${usuarios[i]}")

        }
    }

    fun alertas(mensaje:String){
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}
