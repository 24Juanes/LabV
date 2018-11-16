package com.example.juanes24.labv;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoFragment extends Fragment {

    ArrayList<Sedes> listaSedes;
    RecyclerView recyclerView;
    private android.support.v4.app.FragmentManager fm;
    private FragmentTransaction ft;


    public ListadoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listado, container, false);

        final FragmentTransaction transaction = getFragmentManager().beginTransaction();

        listaSedes = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarSedes();

        ListadoAdapter listadoAdapter = new ListadoAdapter(listaSedes);

        listadoAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes().equals("Florida")){
                    Toast.makeText(getContext(),"Seleccion: "+ listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes(),Toast.LENGTH_LONG).show();
                    transaction.replace(R.id.frame,new FloridaFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }else if(listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes().equals("Gran Via")){
                    Toast.makeText(getContext(),"Seleccion: "+ listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes(),Toast.LENGTH_LONG).show();
                    transaction.replace(R.id.frame,new GranViaFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                else if(listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes().equals("Laureles")){
                    Toast.makeText(getContext(),"Seleccion: "+ listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes(),Toast.LENGTH_LONG).show();
                    transaction.replace(R.id.frame,new LaurelesFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                else if(listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes().equals("Los Colores")){
                    Toast.makeText(getContext(),"Seleccion: "+ listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes(),Toast.LENGTH_LONG).show();
                    transaction.replace(R.id.frame,new LosColoresFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                else if(listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes().equals("Las Palmas")){
                    Toast.makeText(getContext(),"Seleccion: "+ listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes(),Toast.LENGTH_LONG).show();
                    transaction.replace(R.id.frame,new PalmasFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                else if(listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes().equals("San Lucas")){
                    Toast.makeText(getContext(),"Seleccion: "+ listaSedes.get(recyclerView.getChildAdapterPosition(v)).getSedes(),Toast.LENGTH_LONG).show();
                    transaction.replace(R.id.frame,new SanLucasFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            }
        });
        recyclerView.setAdapter(listadoAdapter);
        return view;
    }

    private void llenarSedes() {
        listaSedes.add(new Sedes("Florida","Calle 71 # 65 - 150",R.drawable.ilFornoFlorida));
        listaSedes.add(new Sedes("Gran Vía","Cra. 76 #5-346",R.drawable.ilFornoGranVia));
        listaSedes.add(new Sedes("Laureles","Circular 5, Segundo Parque de Laureles ##73-15",R.drawable.ilFornoLaureles));
        listaSedes.add(new Sedes("Los Colores","Cl. 53 #71a86",R.drawable.ilFornoLosColores));
        listaSedes.add(new Sedes("Las Palmas","Las Palmas #35",R.drawable.ilFornoPalmas));
        listaSedes.add(new Sedes("San Lucas","Cr25 B 18 A Sur-137",R.drawable.ilFornoSanLucas));
    }

}
