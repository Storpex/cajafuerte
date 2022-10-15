package com.example.cajafuerte;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity2 extends AppCompatActivity {

    TextView text_hrs, text_min, text_seg, counterBtnTemporizer;
    NumberPicker numPickHrs, numPickMin, numPickSeg;
    AppCompatButton btn_start;

    private int counter;
    private int duration = 0;
    private boolean timerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*counterBtnTemporizer = findViewById(R.id.counterBtnTemporizer);

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

        btn_start = findViewById(R.id.btn_start);*/

        /*counter = 0;*/

        /*btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!timerRunning) {
                    timerRunning = true;

                    duration = (numPickHrs.getValue() * 60 * 60) + (numPickMin.getValue() * 60) + (numPickSeg.getValue()) + 2;
                    // duration = (numPickHrs.getValue() * 3600) + (numPickMin.getValue() * 60) + (numPickSeg.getValue()) +2;
                    // duration = (numPickHrs.getValue() * 60 * 60) + (numPickMin.getValue() * 60) + (numPickSeg.getValue());
                    // duration = ((numPickHrs.getValue() % 86400) / 3600) + ((numPickMin.getValue() % 3600) / 60) + (((numPickSeg.getValue() % 86400) % 3600) % 60);
                    counter += 1;
                    btn_start.setEnabled(duration == 0);

                    new CountDownTimer(duration * 1000, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    String time = String.format(Locale.getDefault(), "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)-
                                                    TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished)-
                                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)) -1);

                                    final String[] hourMinSec = time.split(":");

                                    text_hrs.setText(hourMinSec[0]);
                                    text_min.setText(hourMinSec[1]);
                                    text_seg.setText(hourMinSec[2]);
                                    counterBtnTemporizer.setText(Integer.toString(counter));
                                }
                            });
                        }

                        @Override
                        public void onFinish() {
                            Toast.makeText(MainActivity2.this, "El temporizador ha terminado.", Toast.LENGTH_SHORT).show();
                            duration = 0;
                            timerRunning = false;
                            btn_start.setEnabled(duration == 0);
                        }
                    }.start();
                }
                else {
                    // Por si alguna razon puede presionar el boton, saltará este mensaje.
                    Toast.makeText(MainActivity2.this, "El temporizador ya esta en uso.", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
}