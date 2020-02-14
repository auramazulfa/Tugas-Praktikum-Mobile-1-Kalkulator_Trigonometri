package com.aurama.aplikasiandroid.minikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etInputNumber;
    private TextView tvHasil;
    private Button btnSin,btnCos,btnTan,btnCsc,btnSec,btnCot,btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInputNumber = findViewById(R.id.et_input);
        tvHasil = findViewById(R.id.tv_hasil);
        btnSin = findViewById(R.id.btn_sin);
        btnCos = findViewById(R.id.btn_cos);
        btnTan = findViewById(R.id.btn_tan);
        btnCsc = findViewById(R.id.btn_csc);
        btnSec = findViewById(R.id.btn_sec);
        btnCot = findViewById(R.id.btn_cot);
        btnLog = findViewById(R.id.btn_log);

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputNumber = etInputNumber.getText().toString();
                    double dInputNumber = Double.parseDouble(sInputNumber);

                    double hasil = Math.sin(dInputNumber);
                    String hitung = String.valueOf(hasil);

                    tvHasil.setText(hitung);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputNumber = etInputNumber.getText().toString();
                    double dInputNumber = Double.parseDouble(sInputNumber);

                    double hasil = Math.cos(dInputNumber);
                    String hitung = String.valueOf(hasil);

                    tvHasil.setText(hitung);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputNumber = etInputNumber.getText().toString();
                    double dInputNumber = Double.parseDouble(sInputNumber);

                    double hasil = Math.tan(dInputNumber);
                    String hitung = String.valueOf(hasil);

                    tvHasil.setText(hitung);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputNumber = etInputNumber.getText().toString();
                    double dInputNumber = Double.parseDouble(sInputNumber);

                    double hasil = 1/Math.sin(dInputNumber);
                    String hitung = String.valueOf(hasil);

                    tvHasil.setText(hitung);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputNumber = etInputNumber.getText().toString();
                    double dInputNumber = Double.parseDouble(sInputNumber);

                    double hasil = 1/Math.cos(dInputNumber);
                    String hitung = String.valueOf(hasil);

                    tvHasil.setText(hitung);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputNumber = etInputNumber.getText().toString();
                    double dInputNumber = Double.parseDouble(sInputNumber);

                    double hasil = 1/Math.tan(dInputNumber);
                    String hitung = String.valueOf(hasil);

                    tvHasil.setText(hitung);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInputNumber = etInputNumber.getText().toString();
                    double dInputNumber = Double.parseDouble(sInputNumber);

                    double hasil = Math.log10(dInputNumber);
                    String hitung = String.valueOf(hasil);

                    tvHasil.setText(hitung);
                }catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
