package com.example.juanes24.labv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class LosColoresFragment extends Fragment implements OnMapReadyCallback  {
    private TextView tSede, tDescripcion;
    private ImageView iImagen;
    MapView mapView;
    GoogleMap mMap;


    public LosColoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_florida, container, false);

        mapView = view.findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
        tSede = view.findViewById(R.id.tSede);
        tDescripcion = view.findViewById(R.id.tDescripcion);
        iImagen = view.findViewById(R.id.iImagen);

        tSede.setText("il Forno Los Colores");
        tDescripcion.setText("Dirección: \n  Cl. 53 #71a86"+
                "\nHorario: \n" +
                "   lunes\t11:30a22:00\n" +
                "   martes\t11:11:30a22:00\n" +
                "   miércoles\t11:30a22:00\n" +
                "   jueves\t11:30a22:00\n" +
                "   viernes\t11:30a22:00\n" +
                "   sábado\t11:30a22:00\n" +
                "   domingo\t11:30a22:00\n" +
                "Teléfono: 6050115");
        iImagen.setImageResource(R.drawable.forno);

        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng ilforno = new LatLng(6.262074, -75.586412);
        mMap.addMarker(new MarkerOptions().position(ilforno)
                .title("il Forno Los Colores"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ilforno));

    }
    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }
}