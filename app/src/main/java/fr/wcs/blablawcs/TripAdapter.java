package fr.wcs.blablawcs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
                // le item_trip layout qu'on rempli avec les valeurs de la liste
            }
            TextView textFirstname = (TextView)convertView.findViewById(R.id.textView_firstname);
            TextView textLastname = (TextView)convertView.findViewById(R.id.textView_lastname);
            TextView textDate = (TextView)convertView.findViewById(R.id.textView_date);
            TextView textPrice = (TextView)convertView.findViewById(R.id.textView_price);
            // recup le champs de texte du layout
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





    /* Mettre en surclasse Adapter <Objet>
        Constructeur de l'adapter -> alt entrée -> context et list item.
        getView > prend le contenu de l'adapter et le mettre à l'interieur du contenu de la liste
        getView est surchargée.

        convertView : ligne en court
        parent : liste compléte getContext


        getItem(position) : prends le contenu de la liste à la ligne de la liste
        Aff le contenu de l'username : avec les getter getUsername /ex
       c'est la que les getter servent.





     */



}

