package com.joseaguilar.cardview_en_recyclerview.Adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.joseaguilar.cardview_en_recyclerview.Clases.Personajes;
import com.joseaguilar.cardview_en_recyclerview.R;

import java.util.ArrayList;

public class AdapterPersonajes extends RecyclerView.Adapter<AdapterPersonajes.ViewHolderPersonajes> {

    ArrayList<Personajes> listaPersonajes;

    public AdapterPersonajes(ArrayList<Personajes> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }


    @Override
    public AdapterPersonajes.ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.molde_lista_personajes, null, false);
        return new ViewHolderPersonajes(view);
    }


    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {
        TextView txtnombre, txtdescripcion;
        ImageView foto;
        public ViewHolderPersonajes(View itemView) {
            super(itemView);
            txtnombre = (TextView) itemView.findViewById(R.id.idNombre);
            txtdescripcion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }


    @Override
    public void onBindViewHolder(AdapterPersonajes.ViewHolderPersonajes holder, int position) {
        holder.txtnombre.setText(listaPersonajes.get(position).getNombre());
        holder.txtdescripcion.setText(listaPersonajes.get(position).getInfo());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto());
    }


    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }


}
