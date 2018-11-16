package com.example.juanes24.labv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListadoAdapter extends RecyclerView.Adapter<ListadoAdapter.ViewHolder> implements View.OnClickListener{

    ArrayList<Sedes> listaSedes;
    private View.OnClickListener listener;

    public ListadoAdapter(ArrayList<Sedes> listaSedes) {
        this.listaSedes = listaSedes;
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View view) {
        if(listener != null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tSedes, tDescripcion;
        ImageView iImagen;

        public ViewHolder(View itemView) {
            super(itemView);
            tSedes = itemView.findViewById(R.id.tSede);
            tDescripcion = itemView.findViewById(R.id.tDescripcion);
            iImagen = itemView.findViewById(R.id.iImagen);
        }
    }

    @NonNull
    @Override
    public ListadoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListadoAdapter.ViewHolder holder, int position) {
        holder.tSedes.setText(listaSedes.get(position).getSedes());
        holder.tDescripcion.setText(listaSedes.get(position).getInfo());
        holder.iImagen.setImageResource(listaSedes.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaSedes.size();
    }
    }