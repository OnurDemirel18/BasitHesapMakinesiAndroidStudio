package com.example.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi;

    TextView sonuc;

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnVirgul, esittir, toplama, cikarma, carpma, bolme, faktoriyel, silme, sifirlama, modal;

    Float sayi1 , sayi2;

    boolean topla, cikar, carp, bol, mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi = (EditText) findViewById(R.id.sayi);
        sonuc = (TextView) findViewById(R.id.sonuc);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnVirgul = (Button) findViewById(R.id.btnVirgul);

        modal = (Button) findViewById(R.id.modal);
        esittir = (Button) findViewById(R.id.esittir);
        toplama = (Button) findViewById(R.id.toplama);
        cikarma = (Button) findViewById(R.id.cikarma);
        carpma = (Button) findViewById(R.id.carpma);
        bolme = (Button) findViewById(R.id.bolme);
        faktoriyel = (Button) findViewById(R.id.faktoriyel);
        silme = (Button) findViewById(R.id.silme);
        sifirlama = (Button) findViewById(R.id.sifirla);


        btn0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              sayi.setText(sayi.getText() + "0");
           }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + "9");
            }
        });

        btnVirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText(sayi.getText() + ",");
            }
        });

        silme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText("");
            }
        });

        sifirlama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi.setText("");
                sonuc.setText("");
            }
        });

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sayi == null){
                    sonuc.setText("");
                }
                else{
                    sayi1 = Float.parseFloat(sayi.getText() + "");
                    topla = true;
                    sayi.setText(null);
                }
            }
        });
        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sayi == null){
                    sonuc.setText("");
                }
                else{
                    sayi1 = Float.parseFloat(sayi.getText() + "");
                    cikar = true;
                    sayi.setText(null);
                }
            }
        });
        carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sayi == null){
                    sonuc.setText("");
                }
                else{
                    sayi1 = Float.parseFloat(sayi.getText() + "");
                    carp = true;
                    sayi.setText(null);
                }
            }
        });
        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sayi == null){
                    sonuc.setText("");
                }
                else{
                    sayi1 = Float.parseFloat(sayi.getText() + "");
                    bol = true;
                    sayi.setText(null);
                }
            }
        });

        modal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sayi == null){
                    sonuc.setText("");
                }
                else{
                    sayi1 = Float.parseFloat(sayi.getText() + "");
                    mod = true;
                    sayi.setText(null);
                }
            }
        });

        esittir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               sayi2 = Float.parseFloat(sayi.getText() + "");
               if(topla == true){
                   sonuc.setText(sayi1 + sayi2 + "");
                   topla = false;
               }
               if(cikar == true){
                   sonuc.setText(sayi1 - sayi2 + "");
                   cikar = false;
               }
               if(carp == true){
                   sonuc.setText(sayi1 * sayi2 + "");
                   carp = false;
               }
               if(bol == true){
                   sonuc.setText(sayi1 / sayi2 + "");
                   bol = false;
               }
               if(mod == true){
                   sonuc.setText(sayi1 % sayi2 + "");
                   mod = false;
               }
           }
        });

        faktoriyel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi1 = Float.parseFloat(sayi.getText() + "");
                int i;
                float fsonuc =1;
                for (i=1; i <= sayi1; i++) {
                    fsonuc = fsonuc * i;
                }
                sonuc.setText(fsonuc + "");
            }
        });

    }
}