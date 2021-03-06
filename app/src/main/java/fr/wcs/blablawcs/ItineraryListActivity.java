package fr.wcs.blablawcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class ItineraryListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);


        SearchModel mod2 = getIntent().getExtras().getParcelable("mode");
        setTitle(mod2.getDeparture()+">>"+ mod2.getDestination());
        Toast.makeText(this, mod2.getDate(), Toast.LENGTH_SHORT).show();


        /*
        Intent intent = getIntent();
        String departurey = intent.getStringExtra("departure");
        String destinationXXX = intent.getStringExtra("destination");
        setTitle(departurey + " >> " + destinationXXX);
        */



        ListView listTrip = findViewById(R.id.list_trip);
        ArrayList<TripModel> results = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm");

        try {
            results.add(new TripModel("Eric", "Cartman", sdf.parse("21/02/2017-15:30"), 15));
            results.add(new TripModel("Stan", "Marsh", sdf.parse("21/02/2017-16:00"), 20));
            results.add(new TripModel("Kenny", "Broflovski", sdf.parse("21/02/2017-16:30"), 16));
            results.add(new TripModel("Kyle", "McCormick", sdf.parse("21/02/2017-17:00"), 40));
            results.add(new TripModel("Wendy", "Testaburger", sdf.parse("21/02/2017-17:30"), 20));
        } catch (ParseException e) {
        }
        TripAdapter adapter;
        adapter = new TripAdapter(this, results);
        listTrip.setAdapter(adapter);

    }
}


            /*
        Dire à la listV qu'on utilise l'adapter -> la liste utilise l'adapter .setAdapter(adapter)


        Le model ets l'objet qui va contenir l'information, les infos de la liste avec les getters et setters.

        L'adapter permet de relier le tout.


             */




