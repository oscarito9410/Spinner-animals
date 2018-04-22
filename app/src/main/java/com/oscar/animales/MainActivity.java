package com.oscar.animales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerAnimal;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerAnimal=(Spinner)findViewById(R.id.spinnerAnimal);
        spinnerAnimal.setOnItemSelectedListener(this);
        tvDescripcion=(TextView)findViewById(R.id.tvDescripcion);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String opt=spinnerAnimal.getSelectedItem().toString();
             if(opt.equals("Perro")){
                 tvDescripcion.setText("Mamífero carnívoro de la familia de los cánidos, " +
                         "doméstico, con cuatro patas, un olfato muy fino y de gran diversidad de tamaños, formas y pelajes, que sirve al ser humano como animal de compañía o para cazar");
                 MediaPlayer mp=MediaPlayer.create(this,R.raw.dog);
                 mp.start();
             }
             else if(opt.equals("Gato"))
             {tvDescripcion.setText("Mamífero carnívoro doméstico, de la familia de los félidos, de patas cortas y uñas retráctiles, cabeza redonda, y pelo espeso y suave; suele tenerse como animal de compañía: el gato es un hábil cazador de ratones.");
                 MediaPlayer mp=MediaPlayer.create(this,R.raw.cat);
                 mp.start();
            }
            else if (opt.equals("Caballo")) {
                 tvDescripcion.setText("Mamífero équido, macho, de cuerpo fuerte, orejas pequeñas, cola cubierta de largo pelo y patas terminadas en casco; es herbívoro, se domestica con facilidad y se suele usar para montar en él.\n" +
                         "\n");
                 MediaPlayer mp = MediaPlayer.create(this, R.raw.horse);
                 mp.start();
             }
             else if (opt.equals("Cerdo")) {
                 tvDescripcion.setText("Es un animal doméstico usado en la alimentación humana por muchos pueblos. Su nombre científico es Sus scrofa ssp. domestica, aunque algunos autores lo denominan Sus domesticus o Sus domestica, reservando");
                 MediaPlayer mp = MediaPlayer.create(this, R.raw.pig);
                 mp.start();
             }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
