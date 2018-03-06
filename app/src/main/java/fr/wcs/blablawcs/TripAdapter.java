package fr.wcs.blablawcs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wilder on 05/03/18.
 */



public class TripAdapter extends ArrayAdapter<TripModel> {
    public TripAdapter(Context context, ArrayAdapter<TripModel> trips, View convertView) {
        super(context, 0, (List<TripModel>) trips);
    }

    public TripAdapter(Context context, ArrayList<TripModel> trip) {
        super(context, 0, trip);
    }


    @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            TripModel trip = (TripModel) getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.idem_trip, parent, false);
            }
            TextView textFirstname = (TextView)convertView.findViewById(R.id.textView_firstname);
            TextView textLastname = (TextView)convertView.findViewById(R.id.textView_lastname);
            TextView textDate = (TextView)convertView.findViewById(R.id.textView_date);
            TextView textPrice = (TextView)convertView.findViewById(R.id.textView_price);
            String prix = "$"+String.valueOf(trip.getPrice());
            textPrice.setText(prix);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            String dateformat = sdf.format(trip.getDate());
            String date = dateformat + "PM";
            textDate.setText(date);

            // Lookup view for data population

            // Populate the data into the template view using the data object
            textFirstname.setText(trip.getFirstname());
            textLastname.setText(trip.getLastname());





            return convertView;
        }





    ;



}

