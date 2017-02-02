package fr.univ_lille1.iut_info.prochnof.democycle;

import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.provider.ContactsContract.Contacts;

public class MainActivity extends AppCompatActivity {

    private int valeur = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStart(){
        super.onStart();
    }

    public void onStop(){
        super.onStop();
    }

    public void onDestroy(){
        super.onDestroy();
    }

    public void onPause(){
        super.onPause();
    }

    public void onResume(){
        super.onResume();
    }

    public void onSaveInstanceState(Bundle outState){
        TextView tvCumul = (TextView) findViewById(R.id.cumul);
        TextView tvInverse = (TextView) findViewById(R.id.inverse);
        outState.putString("cumul",tvCumul.getText().toString());
        outState.putString("inverse",tvInverse.getText().toString());

        super.onSaveInstanceState(outState);
    }

    public void onRestoreInstanceState(Bundle saveInstanceState){
            super.onRestoreInstanceState(saveInstanceState);
        TextView tvCumul = (TextView) findViewById(R.id.cumul);
        TextView tvInverse = (TextView) findViewById(R.id.inverse);
        tvCumul.setText(saveInstanceState.getString("cumul"));
        tvInverse.setText(saveInstanceState.getString("inverse"));
    }

    public void onRestart(){
        super.onRestart();
    }

    public void doGo(View view){
        TextView tvCumul = (TextView) findViewById(R.id.cumul);
        TextView tvInverse = (TextView) findViewById(R.id.inverse);
        TextView tvIncrement  = (TextView) findViewById(R.id.increment);
        valeur += Integer.parseInt(""+tvIncrement.getText());;
        double inv = 1.0/valeur;
        tvCumul.setText(""+valeur);
        tvInverse.setText(""+inv);
        tvIncrement.setText("");
        tvIncrement.setHint(""+0);
    }

    public void doContact(View view){
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,Contacts.CONTENT_URI);
        startActivityForResult(contactPickerIntent, 1001);
    }
}
