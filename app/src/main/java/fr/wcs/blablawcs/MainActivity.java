package fr.wcs.blablawcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button search =findViewById(R.id.button_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ItinerarySearchActivity.class);
                startActivity(intent);
            }
        });
    }

/**
 *   public void Go(View v) {
 //on creer une nouvelle intent on definit la class de depart ici this et la class d'arrivé ici SecondActivite
 Intent intent=new Intent(this,SecondActivite.class);
 //on lance l'intent, cela a pour effet de stoper l'activité courante et lancer une autre activite ici SecondActivite
 startActivity(intent);

 *
 **/







}
