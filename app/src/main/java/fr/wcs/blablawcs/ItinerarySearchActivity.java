package fr.wcs.blablawcs;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;

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

        final Calendar myCalendar = getInstance();
        final EditText datepicker = findViewById(R.id.editText_date);
        datepicker.setFocusable(false);


        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {



            private void updateLabel() {

                {
                    String myFormat = "MM/dd/yy";
                    SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                    datepicker.setText(sdf.format(myCalendar.getTime()));

                }
            }


            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                {
                    myCalendar.set(YEAR, year);
                    myCalendar.set(MONTH, monthOfYear);
                    myCalendar.set(DAY_OF_MONTH, dayOfMonth);
                    updateLabel();
                    // EditText datepicker, Calendar myCalendar

                }

        };

            datepicker.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new DatePickerDialog(ItinerarySearchActivity.this, date, myCalendar.get(Calendar.YEAR),myCalendar
                            .get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();

                }
            });






}
}



