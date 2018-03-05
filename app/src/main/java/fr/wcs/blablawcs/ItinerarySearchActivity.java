package fr.wcs.blablawcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ItinerarySearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_search);


        Button itinerary = findViewById(R.id.button_itinerary);
        itinerary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText departureValue = findViewById(R.id.editText_departure);
                String departure = departureValue.getText().toString();
                EditText destinationValue = findViewById(R.id.editText_destination);
                String destination = destinationValue.getText().toString();
                    if (departure.matches("") | (destination.matches(""))) {
                        Toast.makeText(ItinerarySearchActivity.this, "Error", Toast.LENGTH_SHORT).show(); }
                    else {
                        Intent intent = new Intent(ItinerarySearchActivity.this, ItineraryListActivity.class);
                        intent.putExtra("departure", departureValue.getText().toString());
                        intent.putExtra("destination", destination);
                        startActivity(intent); }



            }
        });
    }
}

//

//

//Intent i = new Intent(FirstScreen.this, SecondScreen.class);

//String strName = null;

//i.putExtra("STRING_I_NEED", strName);

//

