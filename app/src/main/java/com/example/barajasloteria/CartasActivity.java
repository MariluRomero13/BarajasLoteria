package com.example.barajasloteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CartasActivity extends AppCompatActivity {

    ImageView bandolon,violoncello,garza,pajaro,mano,bota,luna,cotorro,borracho,negrito,corazon,sandia,tambor,camaron,jaras,musico;
    Button btnreiniciar;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartas);

        btnreiniciar = findViewById(R.id.btnreiniciar);
        bandolon = findViewById(R.id.cartaBandolon);
        violoncello = findViewById(R.id.cartaVioloncello);
        garza = findViewById(R.id.cartaGarza);
        pajaro = findViewById(R.id.cartaPajaro);
        mano  = findViewById(R.id.cartaMano);
        bota = findViewById(R.id.cartaBota);
        luna = findViewById(R.id.cartaLuna);
        cotorro = findViewById(R.id.cartaCotorro);
        borracho = findViewById(R.id.cartaBorracho);
        negrito = findViewById(R.id.cartaNegrito);
        corazon = findViewById(R.id.cartaCorazon);
        sandia = findViewById(R.id.cartaSandia);
        tambor  = findViewById(R.id.cartaTambor);
        camaron = findViewById(R.id.cartaCamaron);
        jaras = findViewById(R.id.cartaJaras);
        musico = findViewById(R.id.cartaMusico);

        View.OnClickListener click = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (v.getId())
                {
                    case R.id.btnreiniciar:
                        contador = 0;
                        bandolon.setImageResource(R.mipmap.sandolon);
                        violoncello.setImageResource(R.mipmap.violoncelo);
                        garza.setImageResource(R.mipmap.garza);
                        pajaro.setImageResource(R.mipmap.pajaro);
                        mano.setImageResource(R.mipmap.mano);
                        bota.setImageResource(R.mipmap.bota);
                        luna.setImageResource(R.mipmap.luna);
                        cotorro.setImageResource(R.mipmap.cotorro);
                        borracho.setImageResource(R.mipmap.borracho);
                        negrito.setImageResource(R.mipmap.negro);
                        corazon.setImageResource(R.mipmap.corazon);
                        sandia.setImageResource(R.mipmap.sandria);
                        tambor.setImageResource(R.mipmap.tambor);
                        camaron.setImageResource(R.mipmap.camaron);
                        jaras.setImageResource(R.mipmap.jaras);
                        musico.setImageResource(R.mipmap.musico);

                        bandolon.setEnabled(true);
                        violoncello.setEnabled(true);
                        garza.setEnabled(true);
                        pajaro.setEnabled(true);
                        mano.setEnabled(true);
                        bota.setEnabled(true);
                        luna.setEnabled(true);
                        cotorro.setEnabled(true);
                        borracho.setEnabled(true);
                        negrito.setEnabled(true);
                        corazon.setEnabled(true);
                        sandia.setEnabled(true);
                        tambor.setEnabled(true);
                        camaron.setEnabled(true);
                        jaras.setEnabled(true);
                        musico.setEnabled(true);
                        break;

                    case R.id.cartaBandolon:
                        bandolon.setImageResource(R.mipmap.bandolon2);
                        bandolon.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaVioloncello:
                        violoncello.setImageResource(R.mipmap.viloncello2);
                        violoncello.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaGarza:
                        garza.setImageResource(R.mipmap.garza2);
                        garza.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaPajaro:
                        pajaro.setImageResource(R.mipmap.pajaro2);
                        pajaro.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaMano:
                        mano.setImageResource(R.mipmap.mano2);
                        mano.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaBota:
                        bota.setImageResource(R.mipmap.bota2);
                        bota.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaLuna:
                        luna.setImageResource(R.mipmap.luna2);
                        luna.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaCotorro:
                        cotorro.setImageResource(R.mipmap.cotorro2);
                        cotorro.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaBorracho:
                        borracho.setImageResource(R.mipmap.borracho2);
                        borracho.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaNegrito:
                        negrito.setImageResource(R.mipmap.negro2);
                        negrito.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaCorazon:
                        corazon.setImageResource(R.mipmap.corazon2);
                        corazon.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaSandia:
                        sandia.setImageResource(R.mipmap.sandia2);
                        sandia.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaTambor:
                        tambor.setImageResource(R.mipmap.tambor2);
                        tambor.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaCamaron:
                        camaron.setImageResource(R.mipmap.camaron2);
                        camaron.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaJaras:
                        jaras.setImageResource(R.mipmap.jaras2);
                        jaras.setEnabled(false);
                        contador++;
                        break;

                    case R.id.cartaMusico:
                        musico.setImageResource(R.mipmap.musico2);
                        musico.setEnabled(false);
                        contador++;
                        break;
                }

                if (contador == 16)
                {
                    Toast.makeText(CartasActivity.this, "!BUENAS¡", Toast.LENGTH_SHORT).show();
                }
            }
        };

        bandolon.setOnClickListener(click);
        violoncello.setOnClickListener(click);
        garza.setOnClickListener(click);
        pajaro.setOnClickListener(click);
        mano.setOnClickListener(click);
        bota.setOnClickListener(click);
        luna.setOnClickListener(click);
        cotorro.setOnClickListener(click);
        borracho.setOnClickListener(click);
        negrito.setOnClickListener(click);
        corazon.setOnClickListener(click);
        sandia.setOnClickListener(click);
        tambor.setOnClickListener(click);
        camaron.setOnClickListener(click);
        jaras.setOnClickListener(click);
        musico.setOnClickListener(click);
        btnreiniciar.setOnClickListener(click);
    }
}
