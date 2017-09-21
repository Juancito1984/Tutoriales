package nk.com.tutoriales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tiposDeVariables()
        mTvSalida.text = ""
        //cicloFor()
        //cicloWhile()
        //cicloDoWhile()
        //funcionWhen()

    }

    //Tipos de variables
    fun tiposDeVariables() {
        var nombre: String = "Juan"
        var entero: Int = 10
        var doble: Double = 10.2
        var flotante: Float = 21.5f
        var condicion: Boolean = true
        var caracter: Char = 'a'

        mTvSalida.text = caracter.toString()
    }

    //Ciclo For

    fun cicloFor() {
        for (i in 1..50) {
            mTvSalida.append("Ciclo For en: $i\n")
        }
    }

    fun cicloWhile() {
        var contador = 0
        while (contador < 20) {
            mTvSalida.append("cicloWhile en: $contador\n")
            contador++
        }
    }

    fun cicloDoWhile() {
        var contador = 0
        do {
            mTvSalida.append("ciclo DOWhile en $contador\n")
            contador++
        } while (contador < 50)
    }

    fun funcionWhen(){
        var numero = 10
        when(numero){
            0 -> mTvSalida.text= "El numero es $numero"
            1 -> mTvSalida.text= "El numero es $numero"
            2 -> mTvSalida.text= "El numero es $numero"
            3 -> mTvSalida.text= "El numero es $numero"
            4 -> mTvSalida.text= "El numero es $numero"
            else -> mTvSalida.text = "No se cumple ninguna condicion"
        }
    }


}

