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
public class MesuemFragment extends Fragment {


    public MesuemFragment() {
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
        locations.add(new Location("Museo Nazionale", "Via Cavour, 10, 74123 Taranto TA, Italia", R.drawable.museum_1));
        locations.add(new Location("Museo Spartano", "Corso Vittorio Emanuele II, 39, 74123 Taranto TA, Italia", R.drawable.museum_2));


        LocationAdapter Location = new LocationAdapter(getActivity(), locations);
        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(Location);

        return rootview;
    }

}
