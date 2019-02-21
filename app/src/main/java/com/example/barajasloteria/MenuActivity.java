package com.example.barajasloteria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnbarajas, btncartas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnbarajas = findViewById(R.id.btnbarajas);
        btncartas = findViewById(R.id.btncartas);

        View.OnClickListener click = new View.OnClickListener()
        {
                @Override
                public void onClick(View v)
                {
                    switch (v.getId())
                    {
                        case R.id.btnbarajas:
                            Intent a = new Intent(MenuActivity.this, MainActivity.class);
                            startActivity(a);
                            break;

                        case R.id.btncartas:
                            Intent b = new Intent(MenuActivity.this, CartasActivity.class);
                            startActivity(b);
                            break;
                    }
                }
        };
        btncartas.setOnClickListener(click);
        btnbarajas.setOnClickListener(click);
    }
}
