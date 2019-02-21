package com.example.barajasloteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btngenerar, btnreiniciar;
    ImageView imagen;
    ArrayList<Integer> numeros=new ArrayList<Integer>();
    Random r = new Random();
    int posicion;
    int numero;
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btngenerar = findViewById(R.id.btngenerar);
        btnreiniciar = findViewById(R.id.btnreiniciar);
        imagen = findViewById(R.id.imagen);
        generarNumeros();

        btnreiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngenerar.setEnabled(true);
                generarNumeros();
                imagen.setImageResource(R.mipmap.portada);
            }
        });

        btngenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                posicion = r.nextInt(numeros.size());
                numero = numeros.get(posicion);
                Log.d("Numero" , numero + " " + numeros);
                if (contador == 54)
                {
                    Toast.makeText(MainActivity.this,"Se terminó el juego",Toast.LENGTH_SHORT).show();
                    btngenerar.setEnabled(false);
                }
                switch (numero)
                {
                    case 1:
                        imagen.setImageResource(R.mipmap.gallo);
                        contador++;
                        break;
                    case 2:
                        imagen.setImageResource(R.mipmap.diablito);
                        contador++;
                        break;
                    case 3:
                        imagen.setImageResource(R.mipmap.dama);
                        contador++;
                        break;
                    case 4:
                        imagen.setImageResource(R.mipmap.catrin);
                        contador++;
                        break;
                    case 5:
                        imagen.setImageResource(R.mipmap.paragauas);
                        contador++;
                        break;
                    case 6:
                        imagen.setImageResource(R.mipmap.sirena);
                        contador++;
                        break;
                    case 7:
                        imagen.setImageResource(R.mipmap.escalera);
                        contador++;
                        break;
                    case 8:
                        imagen.setImageResource(R.mipmap.botella);
                        contador++;
                        break;
                    case 9:
                        imagen.setImageResource(R.mipmap.barril);
                        contador++;
                        break;
                    case 10:
                        imagen.setImageResource(R.mipmap.arbol);
                        contador++;
                        break;
                    case 11:
                        imagen.setImageResource(R.mipmap.melon);
                        contador++;
                        break;
                    case 12:
                        imagen.setImageResource(R.mipmap.valiente);
                        contador++;
                        break;
                    case 13:
                        imagen.setImageResource(R.mipmap.gorrito);
                        contador++;
                        break;
                    case 14:
                        imagen.setImageResource(R.mipmap.muerte);
                        contador++;
                        break;
                    case 15:
                        imagen.setImageResource(R.mipmap.pera);
                        contador++;
                        break;
                    case 16:
                        imagen.setImageResource(R.mipmap.bandera);
                        contador++;
                        break;
                    case 17:
                        imagen.setImageResource(R.mipmap.sandolon);
                        contador++;
                        break;
                    case 18:
                        imagen.setImageResource(R.mipmap.violoncelo);
                        contador++;
                        break;
                    case 19:
                        imagen.setImageResource(R.mipmap.garza);
                        contador++;
                        break;
                    case 20:
                        imagen.setImageResource(R.mipmap.pajaro);
                        contador++;
                        break;
                    case 21:
                        imagen.setImageResource(R.mipmap.mano);
                        break;
                    case 22:
                        imagen.setImageResource(R.mipmap.bota);
                        contador++;
                        break;
                    case 23:
                        imagen.setImageResource(R.mipmap.luna);
                        contador++;
                        break;
                    case 24:
                        imagen.setImageResource(R.mipmap.cotorro);
                        contador++;
                        break;
                    case 25:
                        imagen.setImageResource(R.mipmap.borracho);
                        contador++;
                        break;
                    case 26:
                        imagen.setImageResource(R.mipmap.negro);
                        contador++;
                        break;
                    case 27:
                        imagen.setImageResource(R.mipmap.corazon);
                        contador++;
                        break;
                    case 28:
                        imagen.setImageResource(R.mipmap.sandria);
                        contador++;
                        break;
                    case 29:
                        imagen.setImageResource(R.mipmap.tambor);
                        contador++;
                        break;
                    case 30:
                        imagen.setImageResource(R.mipmap.camaron);
                        contador++;
                        break;
                    case 31:
                        imagen.setImageResource(R.mipmap.jaras);
                        break;
                    case 32:
                        imagen.setImageResource(R.mipmap.musico);
                        contador++;
                        break;
                    case 33:
                        imagen.setImageResource(R.mipmap.arana);
                        contador++;
                        break;
                    case 34:
                        imagen.setImageResource(R.mipmap.soldado);
                        contador++;
                        break;
                    case 35:
                        imagen.setImageResource(R.mipmap.estrella);
                        contador++;
                        break;
                    case 36:
                        imagen.setImageResource(R.mipmap.cazo);
                        contador++;
                        break;
                    case 37:
                        imagen.setImageResource(R.mipmap.mundo);
                        contador++;
                        break;
                    case 38:
                        imagen.setImageResource(R.mipmap.apache);
                        contador++;
                        break;
                    case 39:
                        imagen.setImageResource(R.mipmap.nopal);
                        contador++;
                        break;
                    case 40:
                        imagen.setImageResource(R.mipmap.alacran);
                        contador++;
                        break;
                    case 41:
                        imagen.setImageResource(R.mipmap.rosa);
                        contador++;
                        break;
                    case 42:
                        imagen.setImageResource(R.mipmap.calavera);
                        contador++;
                        break;
                    case 43:
                        imagen.setImageResource(R.mipmap.campana);
                        contador++;
                        break;
                    case 44:
                        imagen.setImageResource(R.mipmap.cantaro);
                        contador++;
                        break;
                    case 45:
                        imagen.setImageResource(R.mipmap.venado);
                        contador++;
                        break;
                    case 46:
                        imagen.setImageResource(R.mipmap.sol);
                        contador++;
                        break;
                    case 47:
                        imagen.setImageResource(R.mipmap.corona);
                        contador++;
                        break;
                    case 48:
                        imagen.setImageResource(R.mipmap.chalupa);
                        contador++;
                        break;
                    case 49:
                        imagen.setImageResource(R.mipmap.pino);
                        contador++;
                        break;
                    case 50:
                        imagen.setImageResource(R.mipmap.pescado);
                        contador++;
                        break;
                    case 51:
                        imagen.setImageResource(R.mipmap.palma);
                        contador++;
                        break;
                    case 52:
                        imagen.setImageResource(R.mipmap.maceta);
                        contador++;
                        break;
                    case 53:
                        imagen.setImageResource(R.mipmap.arpa);
                        contador++;
                        break;
                    case 54:
                        imagen.setImageResource(R.mipmap.rana);
                        contador++;
                    break;

                }
                numeros.remove(posicion);

            }
        });

    }

    public void generarNumeros()
    {
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);
        numeros.add(15);
        numeros.add(16);
        numeros.add(17);
        numeros.add(18);
        numeros.add(19);
        numeros.add(20);
        numeros.add(21);
        numeros.add(22);
        numeros.add(23);
        numeros.add(24);
        numeros.add(25);
        numeros.add(26);
        numeros.add(27);
        numeros.add(28);
        numeros.add(29);
        numeros.add(30);
        numeros.add(31);
        numeros.add(32);
        numeros.add(33);
        numeros.add(34);
        numeros.add(35);
        numeros.add(36);
        numeros.add(37);
        numeros.add(38);
        numeros.add(39);
        numeros.add(40);
        numeros.add(41);
        numeros.add(42);
        numeros.add(43);
        numeros.add(44);
        numeros.add(45);
        numeros.add(46);
        numeros.add(47);
        numeros.add(48);
        numeros.add(49);
        numeros.add(50);
        numeros.add(51);
        numeros.add(52);
        numeros.add(53);
        numeros.add(54);
    }


}

