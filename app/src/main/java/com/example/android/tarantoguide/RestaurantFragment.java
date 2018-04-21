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
import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
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
        locations.add(new Location(R.string.restaurant_1, R.string.address_restaurant_1, R.drawable.ristorante_1));
        locations.add(new Location(R.string.restaurant_2, R.string.address_restaurant_2, R.drawable.ristorante_2));
        locations.add(new Location(R.string.restaurant_3, R.string.address_restaurant_3, R.drawable.ristorante_3));
        locations.add(new Location(R.string.restaurant_4, R.string.address_restaurant_4, R.drawable.ristorante_4));


        LocationAdapter Location = new LocationAdapter(getActivity(), locations);
        final ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(Location);

        return rootview;
    }
}
