package fr.univ_lille1.iut_info.prochnof.listetablette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spTerminal = (Spinner) findViewById(R.id.terminal);
        ArrayAdapter adTerminal = ArrayAdapter.createFromResource(this,R.array.tablets,android.R.layout.simple_spinner_item);
        spTerminal.setAdapter(adTerminal);
        Spinner spStudent = (Spinner) findViewById(R.id.students);
        ArrayAdapter adStudent = ArrayAdapter.createFromResource(this,R.array.students,android.R.layout.simple_spinner_item);
        spStudent.setAdapter(adStudent);
    }
}
