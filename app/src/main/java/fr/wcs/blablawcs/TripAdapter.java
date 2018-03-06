import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import fr.wcs.blablawcs.R;

/**
 * Created by wilder on 05/03/18.
 */



public class TripAdapter extends ArrayAdapter<TripAdapter> {;

    public TripAdapter(Context context, ArrayAdapter<TripModel> trips, View convertView){
        super(context, 0, (List<TripAdapter>) trips);


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
            // Lookup view for data population

            // Populate the data into the template view using the data object
            textFirstname.setText(trip.firstname);
            textLastname.setText(trip.lastname);
            textDate.setText((CharSequence) trip.date);

            return convertView;
        }


    }


    ;



}

