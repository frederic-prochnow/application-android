package fr.univ_lille1.iut_info.prochnof.listetablette;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by prochnof on 16/02/17.
 */

public class MyAdapter extends BaseAdapter implements ListAdapter {

    private Modele modele;
    private Context context;
    private LayoutInflater mInflater;

    MyAdapter(Context context, Modele modele){
        super();
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.modele = modele;
        this.context = context;
    }

    public int getCount() {
        return modele.getCount();
    }

    public Object getItem(int position) {
        return modele.getTerminal(position);
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = mInflater.inflate(R.layout.mylayout, parent, false);
        TextView name = (TextView) view.findViewById(R.id.view);
        name.setText(modele.getTerminal(position));


        /*MyAdapterSpinner adspinner = new MyAdapterSpinner(this.getApplicationContext(),modele);
        liste.setAdapter(adspinner);*/
        ArrayAdapter adspinner = new ArrayAdapter(context, android.R.layout.simple_spinner_item, modele.getAllStudents());

        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        spinner.setAdapter(adspinner);

        return view;
    }
}
