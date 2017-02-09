package fr.univ_lille1.iut_info.prochnof.listetablette;

import android.app.ListActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by frederic prochnow on 02/02/17.
 */

public class Modele extends ListActivity{

    HashMap<Integer,String> map;
    String[] listeTablette;
    String[] listeEtudiant;

    Modele(){
        map = new HashMap<>();
        listeTablette = getResources().getStringArray(R.array.tablets);
        listeEtudiant = getResources().getStringArray(R.array.students);
        for(int i= 0; i<listeTablette.length; i++){
            map.put(listeTablette[i],listeEtudiant[0]);
        }
    }

    Modele(Bundle bundle){
        listeTablette = bundle.getStringArray("listeTablette");
        listeEtudiant = bundle.getStringArray("listeEtudiant");
        map = new HashMap<>();
        for(int i= 0; i<listeTablette.length; i++){
            map.put(listeTablette[i],listeEtudiant[0]);
        }
    }

    public int getCount(){
        return map.size();
    }

    public String getStudent(int tab){
        return map.get(tab);
    }

    public String getTerminal(int i){
        return listeTablette[i];
    }

    public boolean setStudent(int tab,String etu){
        if(map.containsKey(tab)&&map.containsValue(etu))
            return false;
        else {
            map.put(tab, etu);
            return true;
        }
    }

    public void save(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putStringArray("listeTablette",listeTablette);
        outState.putStringArray("listeEtudiant",listeEtudiant);
        outState.putInt("tailleMap",map.size());
        for(int i=0; i< map.size(); i++){
            outState.putString(""+i,map.get(i));
        }
    }
}
