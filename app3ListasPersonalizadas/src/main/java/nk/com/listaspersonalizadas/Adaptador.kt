package nk.com.listaspersonalizadas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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

        vista?.mTvNombre?.text= items[position].nombre
        vista?.mTvDeporte?.text= items[position].deporte


        return vista!!


    }
}