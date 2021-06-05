package com.example.utspraktik_akb1_10118009_tassyakurpasya;
//05/06/2021, membuat tampilan2, 10118009, Tassyakur Pasya, IF01
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tampilan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan2);
    }
    public void Tampilan3(View view) {
        Intent intent = new Intent(this, Tampilan3.class);
        startActivity(intent);
    }
}