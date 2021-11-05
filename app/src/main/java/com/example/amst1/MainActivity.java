package com.example.amst1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton maps = (FloatingActionButton) findViewById(R.id.mapsM);
        FloatingActionButton video = (FloatingActionButton) findViewById(R.id.videoM);
        FloatingActionButton calendario = (FloatingActionButton) findViewById(R.id.calendarioM);

        //accion para ir a la actividad Maps
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Grafico_Activity.class);
                startActivity(intent);
            }
        });
        //accion para ir a la actividad Video
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Video_Activity.class);
                startActivity(intent);
            }
        });
        //accion para ir a la actividad Calendario
        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Calendario_Activity.class);
                startActivity(intent);
            }
        });
    }
}