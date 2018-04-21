package com.example.android.tarantoguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TurismFragment extends Fragment {

    public TurismFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.location_list, container, false);


        // Create a fake list of earthquake locations.
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Ponte Girevole", "Ponte S. Francesco da Paola, 74100 Taranto TA, Italia", R.drawable.turism_1));
        locations.add(new Location("Castello Aragonese", "Piazza Castello, 4, 74123 Taranto TA, Italia", R.drawable.turism_2));
        locations.add(new Location("Colonne Doriche", "Via Duomo, 74123 Taranto TA, Italia", R.drawable.turism_3));
        locations.add(new Location("Parco Archeologico", "Via G. Lacaita, 5, 74121 Taranto TA, Italia", R.drawable.turism_4));
        locations.add(new Location("Parco Cimino", "Pineta Cimino, 74121 Taranto TA, Italia", R.drawable.turism_5));


        LocationAdapter Location = new LocationAdapter(getActivity(), locations);
        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(Location);

        return rootview;
    }

}
