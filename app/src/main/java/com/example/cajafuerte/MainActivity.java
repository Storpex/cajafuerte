package com.example.cajafuerte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    // **************************

    private DatePickerDialog datePickerDialog;
    private Button dateButton;

    private void initDatePicker(){
        DatePickerDialog.OnDateSetListener dateSetListener = (datePicker, anio, mes, dia) -> {
            mes = mes + 1;
            String date = makeDateString(dia, mes, anio);
            dateButton.setText(date);
        };

        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.BUTTON_POSITIVE;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, anio, mes, dia);

    }

    private String makeDateString(int dia, int mes, int anio){
        return getMothFormat(mes) + " " + dia + " " + anio;
    }

    private String getMothFormat(int mes) {
        if (mes == 1 )
            return "ENE";
        if (mes == 2 )
            return "FEB";
        if (mes == 3 )
            return "MAR";
        if (mes == 4 )
            return "ABR";
        if (mes == 5 )
            return "MAY";
        if (mes == 6 )
            return "JUN";
        if (mes == 7 )
            return "JUL";
        if (mes == 8 )
            return "AGO";
        if (mes == 9 )
            return "SEP";
        if (mes == 10 )
            return "OCT";
        if (mes == 11 )
            return "NOV";
        if (mes == 12 )
            return "DIC";

        // Default
        return "ENE";
    }

    public void openDatePicker(View view){
    }

    private String getTodaysDate(){
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        mes = mes + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(dia, mes , anio);
    }

    // **************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatePicker();
        dateButton = findViewById(R.id.datePickerButton);
        dateButton.setOnClickListener(view -> {
            datePickerDialog.show();
        });
        dateButton.setText(getTodaysDate());

    }
}