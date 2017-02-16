package fr.univ_lille1.iut_info.prochnof.listetablette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Modele modele = new Modele(getApplicationContext().getResources().getStringArray(R.array.tablets),
                                   getApplicationContext().getResources().getStringArray(R.array.students));
        setContentView(R.layout.activity_main);

        MyAdapter adliste = new MyAdapter(this.getApplicationContext(),modele);
        ListView liste = (ListView) findViewById(R.id.liste);
        liste.setAdapter(adliste);
   }
}
