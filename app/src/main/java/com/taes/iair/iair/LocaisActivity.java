package com.taes.iair.iair;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LocaisActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locais);


        final SharedPreferences prefs = this.getSharedPreferences("favorito", Context.MODE_PRIVATE);


        ArrayList<String> cidades = todasCidades();



        String favorito = prefs.getString("favorito",null);
        final ListView listaDeCidades = (ListView) findViewById(R.id.listLocais);

        //chamada da nossa implementação
        final AdapterCidades adapter = new AdapterCidades(this, cidades);
        listaDeCidades.setAdapter(adapter);


        if (cidades.contains(favorito)){
            int a = cidades.indexOf(favorito);
            adapter.setSelectedIndex(a);
            adapter.notifyDataSetChanged();
        }



        listaDeCidades.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

        @Override
        public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

            switch (position) {
                case 0:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Aveiro").apply();

                    break;
                case 1:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Beja").apply();
                    break;
                case 2:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Braga").apply();
                    break;
                case 3:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Bragança").apply();
                    break;
                case 4:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Castelo Branco").apply();
                    break;
                case 5:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Coimbra").apply();
                    break;
                case 6:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Évora").apply();
                    break;
                case 7:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Faro").apply();
                    break;
                case 8:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Guarda").apply();
                    break;
                case 9:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Leiria").apply();
                    break;
                case 10:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Lisboa").apply();
                    break;
                case 11:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Portalegre").apply();
                    break;
                case 12:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Porto").apply();
                    break;
                case 13:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Santarém").apply();
                    break;
                case 14:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Setúbal").apply();
                    break;
                case 15:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Viana do Castelo").apply();
                    break;
                case 16:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Vila Real").apply();
                    break;
                case 17:
                    adapter.setSelectedIndex(position);
                    adapter.notifyDataSetChanged();
                    prefs.edit().putString("favorito", "Viseu").apply();
                    break;

            }
            return true;
        }

        });



        listaDeCidades.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        callInfoLocalActivity();
                        break;
                    case 1: callInfoLocalActivity();
                        break;
                    case 2:callInfoLocalActivity();
                        break;
                    case 3:callInfoLocalActivity();
                        break;
                    case 4:
                        callInfoLocalActivity();
                        break;
                    case 5: callInfoLocalActivity();
                        break;
                    case 6:callInfoLocalActivity();
                        break;
                    case 7:callInfoLocalActivity();
                        break;
                    case 8:
                        callInfoLocalActivity();
                        break;
                    case 9: callInfoLocalActivity();
                        break;
                    case 10:callInfoLocalActivity();
                        break;
                    case 11:callInfoLocalActivity();
                        break;
                    case 12:
                        callInfoLocalActivity();
                        break;
                    case 13: callInfoLocalActivity();
                        break;
                    case 14:callInfoLocalActivity();
                        break;
                    case 15:callInfoLocalActivity();
                        break;
                    case 16:
                        callInfoLocalActivity();
                        break;
                    case 17: callInfoLocalActivity();
                        break;
                }

            }

        });




    }

    private ArrayList<String> todasCidades() {
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Aveiro");
        cidades.add("Beja");
        cidades.add("Braga");
        cidades.add("Bragança");
        cidades.add("Castelo Branco");
        cidades.add("Coimbra");
        cidades.add("Évora");
        cidades.add("Faro");
        cidades.add("Guarda");
        cidades.add("Leiria");
        cidades.add("Lisboa");
        cidades.add("Portalegre");
        cidades.add("Porto");
        cidades.add("Santarém");
        cidades.add("Setúbal");
        cidades.add("Viana do Castelo");
        cidades.add("Vila Real");
        cidades.add("Viseu");

        return cidades;
    }

    private void callInfoLocalActivity() {
        Intent it = new Intent(this, InfoLocalActivity.class);
        startActivity(it);
    }


}


