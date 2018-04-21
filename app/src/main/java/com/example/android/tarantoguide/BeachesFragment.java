package com.example.android.tarantoguide;


import android.app.Activity;
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
public class BeachesFragment extends Fragment {

    public BeachesFragment() {
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
        locations.add(new Location(R.string.beach_1, R.string.address_beach_1, R.drawable.beach_1));
        locations.add(new Location(R.string.beach_2, R.string.address_beach_2, R.drawable.beach_2));
        locations.add(new Location(R.string.beach_3, R.string.address_beach_3, R.drawable.beach_3));
        locations.add(new Location(R.string.beach_4, R.string.address_beach_4, R.drawable.beach_4));
        locations.add(new Location(R.string.beach_5, R.string.address_beach_5, R.drawable.beach_5));



        LocationAdapter Location = new LocationAdapter(getActivity(), locations);
        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(Location);

        return rootview;
    }
}

