package com.example.class6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    Context contexto;

    String [] nombres, mensaje, horaUltimoMensaje, numeroTelefono, pais;
    int idImagen;

    LayoutInflater inflater;


    public ListAdapter(Context contexto, String[] nombres, String[] mensaje, String[] horaUltimoMensaje, String[] numeroTelefono, String[] pais, int idImagen){

        this.contexto = contexto;
        this.nombres = nombres;
        this.mensaje = mensaje;
        this.horaUltimoMensaje = horaUltimoMensaje;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount(){return nombres.length;}

    @Override
    public Object getItem(int I){return null;}

    @Override
    public View getView(int i, View vista, ViewGroup viewGroup){

        vista = inflater.inflate(R.layout.list_item, null);
        ImageView fotoperfil =  vista.findViewById(R.id.imagenPerfil);
        TextView nombreUsuario =  vista.findViewById(R.id.nombrePersona);
        TextView ultimoMensaje =  vista.findViewById(R.id.ultimoMensaje);
        TextView horaMensaje =  vista.findViewById(R.id.horaMensaje);
        fotoperfil.setImageResource(idImagen);
        nombreUsuario.setText(nombres[i]);
        ultimoMensaje.setText(mensaje[i]);
        horaMensaje.setText(horaUltimoMensaje[i]);

        return vista;
    }

    @Override
    public long getItemId(int i){return 0;}



}
