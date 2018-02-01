package com.example.lieberson.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private SeekBar seekBar;
        private TextView textoExibicao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarId);
        textoExibicao = findViewById(R.id.textoExibicaoId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //mostra o valor do seekBar
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textoExibicao.setText("Progresso: " + i);

            }

            //mostra quando o seekBar é pressionado
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this, "SeekBar pressionado", Toast.LENGTH_SHORT).show();

            }

            //mostra quando solta o seekBar
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this, "SeeBar solto", Toast.LENGTH_LONG).show();

            }
        });


    }
}
