package com.example.gasnugasfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class TambahTugas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_tugas);

        EditText KNama = findViewById(R.id.K_Name);
        EditText KTanggal = findViewById(R.id.K_Tanggal);
        EditText KDeadline = findViewById(R.id.K_Deadline);
        EditText KCatatan= findViewById(R.id.K_Catatan);
    }
}