/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.blogspot.aprehendemapudungun.aprehendemapudungun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriasActivity extends AppCompatActivity
{

    private Button btn_pronunciacion, btn_actividades,btn_pronombres,
            btn_numeros, btn_saludos, btn_colores, btn_cosas;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);


        btn_pronunciacion   = (Button) findViewById(R.id.btn_pronunciacion);
        btn_actividades     = (Button) findViewById(R.id.btn_actividades);
        btn_pronombres      = (Button) findViewById(R.id.btn_pronombres);
        btn_numeros         = (Button) findViewById(R.id.btn_numeros);
        btn_saludos         = (Button) findViewById(R.id.btn_saludos);
        btn_colores         = (Button) findViewById(R.id.btn_colores);
        btn_cosas           = (Button) findViewById(R.id.btn_cosas);


    }

    protected void ejecutarBotonesCategorias(View view)
    {

        switch (view.getId())
        {

            case R.id.btn_pronunciacion:
                traspasarTexto(btn_pronunciacion.getText().toString()); break;

            case R.id.btn_numeros:
                traspasarTexto(btn_numeros.getText().toString()); break;

            case R.id.btn_pronombres:
                traspasarTexto(btn_pronombres.getText().toString()); break;

            case R.id.btn_saludos:
                traspasarTexto(btn_saludos.getText().toString()); break;
        }
    }


    protected void traspasarTexto(String textoBtn)
    {
        intent = new Intent(CategoriasActivity.this, SubCategoriasActivity.class);
        intent.putExtra("categoria", textoBtn);
        startActivity(intent);
    }

}//.
