package com.example.cajafuerte;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity3God extends AppCompatActivity {

    /*TextView text_hrs, text_min, text_seg, counterBtnTemporizer;
    NumberPicker numPickHrs, numPickMin, numPickSeg;
    AppCompatButton btn_start;

    private long durHour, durMinute, durSecond, durTotal;
    private int counter;
    private final long milisegundos = 1000;
    private boolean timerRunning = false;

    // Function
    public void ConteoHaciaAtras(long MilisegundosTotal) {
        String tiempo = String.format(Locale.getDefault(), "%02d:%02d:%02d",
                TimeUnit.MILLISECONDS.toHours(MilisegundosTotal),
                TimeUnit.MILLISECONDS.toMinutes(MilisegundosTotal) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(MilisegundosTotal)),
                TimeUnit.MILLISECONDS.toSeconds(MilisegundosTotal) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(MilisegundosTotal))
        );
        final String[] hourMinSec = tiempo.split(":");
        text_hrs.setText(hourMinSec[0]);
        text_min.setText(hourMinSec[1]);
        text_seg.setText(hourMinSec[2]);
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        counterBtnTemporizer = findViewById(R.id.counterBtnTemporizer);

        // **** 00:00:00
        text_hrs = findViewById(R.id.text_hrs);
        text_min = findViewById(R.id.text_min);
        text_seg = findViewById(R.id.text_seg);

        // **** Temporizer
        numPickHrs = findViewById(R.id.numPickHrs);
        numPickMin = findViewById(R.id.numPickMin);
        numPickSeg = findViewById(R.id.numPickSeg);

        // Hours
        numPickHrs.setMinValue(0);
        numPickHrs.setMaxValue(23);

        // Hours
        numPickMin.setMinValue(0);
        numPickMin.setMaxValue(59);

        // Hours
        numPickSeg.setMinValue(0);
        numPickSeg.setMaxValue(59);

        // **** Button start Vista Temporizador
        btn_start = findViewById(R.id.btn_start);

        counter = 0;

        btn_start.setOnClickListener(view -> {
            // ERROR, Por si alguna razon puede presionar el boton, saltará este mensaje.
            if (timerRunning) Toast.makeText(MainActivity3God.this, "El temporizador ya esta en uso.", Toast.LENGTH_SHORT).show();

            // Cambio de valores en variables.
            timerRunning = true;

            // Calculo de hora, minutos, segundos a milisegundos
            durHour = TimeUnit.MILLISECONDS.convert(numPickHrs.getValue(), TimeUnit.HOURS);
            durMinute = TimeUnit.MILLISECONDS.convert(numPickMin.getValue(), TimeUnit.MINUTES);
            durSecond = TimeUnit.MILLISECONDS.convert(numPickSeg.getValue(), TimeUnit.SECONDS);
            durTotal = durHour + durMinute + durSecond;

            // Contador
            counter += 1;
            counterBtnTemporizer.setText(String.format(Locale.getDefault(), "%d", counter));

            // SetEnabled
            btn_start.setEnabled(false);
            numPickHrs.setEnabled(false);
            numPickMin.setEnabled(false);
            numPickSeg.setEnabled(false);

            // Contador.
            new CountDownTimer( durTotal, milisegundos) {
                @Override
                public void onTick(long millisUntilFinished) {
                    runOnUiThread(() -> ConteoHaciaAtras(millisUntilFinished));
                }

                @Override
                public void onFinish() {
                    // Reinicio de los valores de las variables.
                    durTotal = 0;
                    timerRunning = false;
                    ConteoHaciaAtras(0);
                    Toast.makeText(MainActivity3God.this, "El temporizador ha terminado.", Toast.LENGTH_SHORT).show();

                    // SetEnabled
                    btn_start.setEnabled(true);
                    numPickHrs.setEnabled(true);
                    numPickMin.setEnabled(true);
                    numPickSeg.setEnabled(true);
                }
            }.start();
        });*/
    }
}