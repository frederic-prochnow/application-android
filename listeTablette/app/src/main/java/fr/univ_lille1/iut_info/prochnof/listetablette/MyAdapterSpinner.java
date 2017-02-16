package fr.univ_lille1.iut_info.prochnof.listetablette;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/**
 * Created by prochnof on 16/02/17.
 */

public class MyAdapterSpinner extends BaseAdapter implements SpinnerAdapter {

    private Modele modele;
    private Context context;
    private LayoutInflater mInflater;

    MyAdapterSpinner(Context context, Modele modele){
        super();
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.modele = modele;
        this.context = context;
    }

    public int getCount() {
        return modele.getCount();
    }

    public Object getItem(int position) {
        return modele.getStudent(position);
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = mInflater.inflate(R.layout.mylayout, parent, false);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        spinner.setAdapter(this);
        return view;
    }
}
