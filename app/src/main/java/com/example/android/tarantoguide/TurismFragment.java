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
        locations.add(new Location(R.string.poi_1, R.string.address_poi_1, R.drawable.turism_1));
        locations.add(new Location(R.string.poi_2, R.string.address_poi_2, R.drawable.turism_2));
        locations.add(new Location(R.string.poi_3, R.string.address_poi_3, R.drawable.turism_3));
        locations.add(new Location(R.string.poi_4, R.string.address_poi_4, R.drawable.turism_4));
        locations.add(new Location(R.string.poi_5, R.string.address_poi_5, R.drawable.turism_5));


        LocationAdapter Location = new LocationAdapter(getActivity(), locations);
        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(Location);

        return rootview;
    }

}
