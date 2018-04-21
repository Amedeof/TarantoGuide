package com.example.android.tarantoguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = Location.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param locations A List of Location objects to display in a list
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    /*
    Set a view
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationTextView = listItemView.findViewById(R.id.location_name);
        locationTextView.setText(currentLocation.getNameLocation());

        TextView addressTextView = listItemView.findViewById(R.id.address);
        addressTextView.setText(currentLocation.getAddressLocation());

        ImageView imageTextView = listItemView.findViewById(R.id.image);
        imageTextView.setImageResource(currentLocation.getImageLocation());
        return listItemView;


    }
}
