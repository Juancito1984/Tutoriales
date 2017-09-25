package nk.com.listaspersonalizadas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import kotlinx.android.synthetic.main.contenedor.view.*

/**
 * Created by J Pablo on 25/09/2017.
 */
class Adaptador(context: Context, val items:MutableList<Persona>):ArrayAdapter<Persona>(
        context, R.layout.contenedor,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var vista= convertView
        if (vista==null){
            vista=LayoutInflater.from(parent?.context).inflate(R.layout.contenedor, parent, false)
        }

        ponerImagen(vista?.imagen!!, position)
        vista?.mTvNombre?.text= items[position].nombre
        vista?.mTvDeporte?.text= items[position].deporte


        return vista!!


    }

    fun ponerImagen(imagen:ImageView, posicion: Int){
        when(posicion){
            0-> imagen.setImageResource(R.drawable.hombre)
            1-> imagen.setImageResource(R.drawable.mujer)
            2-> imagen.setImageResource(R.drawable.hombre2)
            3-> imagen.setImageResource(R.drawable.mujer2)
            4-> imagen.setImageResource(R.drawable.hombre3)
            5-> imagen.setImageResource(R.drawable.mujer3)
            else ->imagen.setImageResource(R.mipmap.ic_launcher)
        }
    }
}