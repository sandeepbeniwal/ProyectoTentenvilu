/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.blogspot.aprehendemapudungun.aprehendemapudungun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriasActivity extends AppCompatActivity
{

    private Button btn_pronunciacion, btn_actividades,btn_animales,
            btn_numeros, btn_saludos, btn_colores, btn_cosas;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);


        btn_pronunciacion   = (Button) findViewById(R.id.btn_pronunciacion);
        btn_actividades     = (Button) findViewById(R.id.btn_actividades);
        btn_animales        = (Button) findViewById(R.id.btn_animales);
        btn_numeros         = (Button) findViewById(R.id.btn_numeros);
        btn_saludos         = (Button) findViewById(R.id.btn_saludos);
        btn_colores         = (Button) findViewById(R.id.btn_colores);
        btn_cosas           = (Button) findViewById(R.id.btn_cosas);


    }

    protected void ejecutarBotonesCategorias(View view)
    {

        switch (view.getId())
        {
            case R.id.btn_numeros:
                setContentView(R.layout.layout_numeros);
                break;

        }
    }



}
