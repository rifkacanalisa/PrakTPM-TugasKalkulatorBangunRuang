package com.example.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnHasil;
    private TextView tvLuasBalok, tvLuasPrisma, tvLuasKerucut, tvLuasBola, tvLuasTabung;
    private TextView tvVolumeBalok, tvVolumePrisma, tvVolumeKerucut, tvVolumeBola, tvVolumeTabung;
    private EditText etPanjangBalok, etLebarBalok, etTinggiBalok, etAlasSPrisma, etTinggiSPrisma, etTinggiPrisma;
    private EditText etJari, etTinggiKerucut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHasil = findViewById(R.id.btn_hasil);
        tvLuasBalok = findViewById(R.id.tv_luasBalok);
        tvLuasPrisma = findViewById(R.id.tv_luasPrisma);
        tvLuasBola = findViewById(R.id.tv_luasBola);
        tvLuasKerucut = findViewById(R.id.tv_luasKerucut);
        tvLuasTabung = findViewById(R.id.tv_luasTabung);

        tvVolumeBalok = findViewById(R.id.tv_volumeBalok);
        tvVolumePrisma = findViewById(R.id.tv_volumePrisma);
        tvVolumeBola = findViewById(R.id.tv_volumeBola);
        tvVolumeKerucut = findViewById(R.id.tv_volumeKerucut);
        tvVolumeTabung = findViewById(R.id.tv_volumeTabung);

        etPanjangBalok = findViewById(R.id.et_panjangBalok);
        etLebarBalok = findViewById(R.id.et_lebarBalok);
        etTinggiBalok = findViewById(R.id.et_tinggiBalok);

        etAlasSPrisma = findViewById(R.id.et_alasSPrisma);
        etTinggiSPrisma = findViewById(R.id.et_tinggiSPrisma);
        etTinggiPrisma = findViewById(R.id.et_tinggiPrisma);

        etJari = findViewById(R.id.et_jarijari);
        etTinggiKerucut = findViewById(R.id.et_tinggiKerucut);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                     String sPanjangBalok, sLebarBalok, sTinggiBalok, sAlasSPrisma, sTinggiSPrisma, sTinggiPrisma;
                     String sJari, sTinggiKerucut;
                     sPanjangBalok = etPanjangBalok.getText().toString();
                     sLebarBalok = etLebarBalok.getText().toString();
                     sTinggiBalok = etTinggiBalok.getText().toString();

                     sAlasSPrisma = etAlasSPrisma.getText().toString();
                     sTinggiSPrisma = etTinggiSPrisma.getText().toString();
                     sTinggiPrisma = etTinggiPrisma.getText().toString();

                     sJari = etJari.getText().toString();
                     sTinggiKerucut = etTinggiKerucut.getText().toString();

                     double PanjangBalok, LebarBalok, TinggiBalok, AlasSPrisma, TinggiSPrisma, TinggiPrisma;
                     double Jari, TinggiKerucut;
                     PanjangBalok = Double.parseDouble(sPanjangBalok);
                     LebarBalok = Double.parseDouble(sLebarBalok);
                     TinggiBalok = Double.parseDouble(sTinggiBalok);

                     AlasSPrisma = Double.parseDouble(sAlasSPrisma);
                     TinggiSPrisma = Double.parseDouble(sTinggiSPrisma);
                     TinggiPrisma = Double.parseDouble(sTinggiPrisma);

                     Jari = Double.parseDouble(sJari);
                     TinggiKerucut = Double.parseDouble(sTinggiKerucut);

                     double luasBalok, luasPrisma, luasBola, luasKerucut, luasTabung;
                     double volumeBalok, volumePrisma, volumeBola, volumeKerucut, volumeTabung;
                     luasBalok = hitungBalok(PanjangBalok, LebarBalok, TinggiBalok, "luas");
                     volumeBalok = hitungBalok(PanjangBalok, LebarBalok, TinggiBalok, "volume");

                     luasPrisma = hitungPrisma(AlasSPrisma, TinggiSPrisma, TinggiPrisma, "luas");
                     volumePrisma = hitungPrisma(AlasSPrisma, TinggiSPrisma, TinggiPrisma, "volume");

                     luasBola = hitungBola(Jari, "luas");
                     volumeBola = hitungBola(Jari, "volume");

                    luasKerucut = hitungKerucut(Jari, TinggiKerucut, "luas");
                    volumeKerucut = hitungKerucut(Jari, TinggiKerucut, "volume");

                    luasTabung = hitungTabung(Jari, TinggiKerucut, "luas");
                    volumeTabung = hitungTabung(Jari, TinggiKerucut, "volume");

                    String sLuasBalok, sLuasPrisma, sLuasBola, sLuasKerucut, sLuasTabung;
                    String sVolumeBalok, sVolumePrisma, sVolumeBola, sVolumeKerucut, sVolumeTabung;

                    sLuasBalok = String.valueOf(luasBalok);
                    sLuasPrisma = String.valueOf(luasPrisma);
                    sLuasBola = String.valueOf(luasBola);
                    sLuasKerucut = String.valueOf(luasKerucut);
                    sLuasTabung = String.valueOf(luasTabung);

                    sVolumeBalok = String.valueOf(volumeBalok);
                    sVolumePrisma = String.valueOf(volumePrisma);
                    sVolumeBola = String.valueOf(volumeBola);
                    sVolumeKerucut = String.valueOf(volumeKerucut);
                    sVolumeTabung = String.valueOf(volumeTabung);

                    tvLuasBalok.setText(sLuasBalok);
                    tvLuasPrisma.setText(sLuasPrisma);
                    tvLuasBola.setText(sLuasBola);
                    tvLuasKerucut.setText(sLuasKerucut);
                    tvLuasTabung.setText(sLuasTabung);

                    tvVolumeBalok.setText(sVolumeBalok);
                    tvVolumePrisma.setText(sVolumePrisma);
                    tvVolumeBola.setText(sVolumeBola);
                    tvVolumeKerucut.setText(sVolumeKerucut);
                    tvVolumeTabung.setText(sVolumeTabung);

                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private double hitungBalok(double p, double l, double t, String jenis){
        double hasil;
        if (jenis.equals("luas")){
            hasil = 2*(p*l+p*t+l*t);
        }
        else{
            hasil = p*l*t;
        }
        return hasil;
    }

    private double hitungPrisma(double a, double tSegitiga, double t, String jenis){
        double hasil;
        double luasAlas;
        luasAlas = a*tSegitiga/2;
        if (jenis.equals("luas")){
            double kelilingAlas;
            double sisiMiring;
            sisiMiring = Math.sqrt(Math.pow(a, 2) + Math.pow(t, 2));
            kelilingAlas = sisiMiring+a+tSegitiga;
            hasil = 2*luasAlas+kelilingAlas*t;
        }
        else{
            hasil = luasAlas*t;
        }
        return hasil;
    }

    private double hitungBola(double r, String jenis){
        double hasil;
        if (jenis.equals("luas")){
            hasil = 4*Math.PI*r*r;
        }
        else{
            hasil = 4.0/3*Math.PI*r*r*r;
        }
        return hasil;
    }

    private double hitungKerucut(double r, double t, String jenis){
        double hasil;
        if (jenis.equals("luas")){
            double sisiMiring;
            sisiMiring = Math.sqrt(Math.pow(r, 2) + Math.pow(t, 2));
            hasil = Math.PI*r*(r+sisiMiring);
        }
        else{
            hasil = 1/3.0*Math.PI*r*r*t;
        }
        return hasil;
    }

    private double hitungTabung(double r, double t , String jenis){
        double hasil;
        if (jenis.equals("luas")){
            hasil = 2*Math.PI*r*(t+r);
        }
        else{
            hasil = Math.PI*r*r*t;
        }
        return hasil;
    }

}
