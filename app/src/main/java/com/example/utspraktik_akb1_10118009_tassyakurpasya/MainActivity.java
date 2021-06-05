package com.example.utspraktik_akb1_10118009_tassyakurpasya;
//05/06/2021, membuat mainactivity, 10118009, Tassyakur Pasya, IF01
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Calendar myCalendar;
    DatePickerDialog.OnDateSetListener date;

    TextView datedeparture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datedeparture = findViewById(R.id.edittanggal);

        myCalendar = Calendar.getInstance();
        date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                TextView tanggal = findViewById(R.id.edittanggal);
                String myFormat = "dd-MMMM-yyyy";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                tanggal.setText(sdf.format(myCalendar.getTime()));
            }
        };

        datedeparture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, date,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }
    public void Tampilan2(View view) {
        Intent intent = new Intent(this, Tampilan2.class);
        startActivity(intent);
    }
//    public void Tampilan2(View view) {
//        Intent intent = new Intent(this, Tampilan2.class);
//        EditText editText = findViewById(R.id.editnik);
//        EditText editText2 = findViewById(R.id.editnama);
//        TextView editText3 = findViewById(R.id.edittanggal);
//        String pesan1,pesan2 = editText.getText().toString();
//        int pesan3 = TextView.getText().toString();
//
//        intent.putExtra("nik", pesan1);
//        intent.putExtra("nama", pesan2);
//        intent.putExtra("tanggal", pesan3);
//        startActivity(intent);
//
//    }
}