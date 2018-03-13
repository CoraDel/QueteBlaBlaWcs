package fr.wcs.blablawcs;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wilder on 12/03/18.
 */



public class VehiculeActivity extends AppCompatActivity {
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicule);


        final Spinner spinner;

        final Spinner auto = findViewById(R.id.spinner_auto);


        List<String> categories = new ArrayList<String>();
        categories.add("Please select");
        categories.add("Car");
        categories.add("Boat");
        categories.add("Plane");

        ArrayAdapter adapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, categories);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        auto.setAdapter(adapter);
        auto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Object selection = auto.getItemAtPosition(i);

                final EditText model = findViewById(R.id.editText_model);
                final EditText hours = findViewById(R.id.editText_hours);
                final EditText kilometres = findViewById(R.id.editText_kilometres);
                final EditText brand = findViewById(R.id.editText_brand);
                final EditText speed = findViewById(R.id.editText_speed);
                final Button send = findViewById(R.id.button_send);


                String hourboat = hours.getText().toString();

                /*brand.setText("");
                model.setText("");
                kilometres.setText("");
                speed.setText("");
                */

                if (selection.equals("Please select")) {
                    kilometres.setVisibility(View.GONE);
                    hours.setVisibility(View.GONE);
                    speed.setEnabled(false);
                }

                if (selection.equals("Car"))
                {send.setEnabled(true);
                    kilometres.setVisibility(View.VISIBLE);
                    hours.setVisibility(View.GONE);
                    String kmCar = kilometres.getText().toString();
                    speed.setVisibility(View.GONE);
                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String modelValue =  model.getText().toString();
                            String brandValue = brand.getText().toString();
                            String kiloCar = kilometres.getText().toString();

                            int kmC = 0;
                            if (!kiloCar.isEmpty())
                            {
                                kmC = Integer.valueOf(kiloCar);
                            }
                            VehicleCar car = new VehicleCar(brandValue, modelValue, kmC);
                            Toast.makeText(VehiculeActivity.this, car.getDescription(), Toast.LENGTH_SHORT).show();
                        }
                    });

                    }

                    if (selection.equals("Boat"))
                        hours.setVisibility(View.VISIBLE);
                        kilometres.setVisibility(View.GONE);
                        speed.setVisibility(View.GONE);
                        send.setEnabled(true);
                        final String hoursCar = hours.getText().toString();
                        send.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String modelValue =  model.getText().toString();
                                String brandValue = brand.getText().toString();
                                String hoursBoat = hours.getText().toString();

                                int hoursInt = 0;
                                if (!hoursBoat.isEmpty())
                                {
                                    hoursInt=Integer.valueOf(hoursBoat);
                                }
                                VehiculeBoat boat = new VehiculeBoat(modelValue, brandValue, hoursInt);
                                Toast.makeText(VehiculeActivity.this,boat.getDescription(), Toast.LENGTH_SHORT).show();
                            }
                        });


                        if(selection.equals("Plane"))
                        {
                            hours.setVisibility(View.GONE);
                            kilometres.setVisibility(View.GONE);
                            speed.setVisibility(View.VISIBLE);
                            speed.setEnabled(true);
                            send.setEnabled(true);
                            String speedValue = speed.getText().toString();
                            send.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    String modelValue = model.getText().toString();
                                    String brandValue = brand.getText().toString();
                                    String speedValue = speed.getText().toString();

                                    int speendInt = 0;
                                    if(!speedValue.isEmpty())
                                    {
                                        speendInt = Integer.valueOf(speedValue);
                                    }
                                    VehiculePlane plane = new VehiculePlane(modelValue,brandValue, speendInt);
                                    Toast.makeText(VehiculeActivity.this,plane.getDescription(), Toast.LENGTH_SHORT).show();
                                }
                            });
                        }

                    {

                    }


                }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

}







