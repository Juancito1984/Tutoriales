package nk.com.listaspersonalizadas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var items: MutableList<Persona> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..50) {
            items.add(Persona("Usuario $i", "Deporte ${i * 10}"))
        }

        val adaptador = Adaptador(this, items)

        mLvListas.adapter = adaptador

        mLvListas.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, items[i].nombre, Toast.LENGTH_SHORT).show()
        }


    }
}
