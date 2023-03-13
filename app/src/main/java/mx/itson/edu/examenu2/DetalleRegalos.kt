package mx.itson.edu.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class DetalleRegalos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_regalos)


    }


    private class AdaptadorRegalos: BaseAdapter {
        var detalle = ArrayList<Detalles>()
        var contexto:Context?=null

        constructor(contexto: Context, detalle:ArrayList<Detalles>){
            this.detalle=detalle
            this.contexto=contexto
        }
        override fun getCount(): Int {
            return detalle.size
        }

        override fun getItem(p0: Int): Any {
            return detalle[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var prod=detalle[p0]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.activity_detalle_regalos, null)


        }

    }
}