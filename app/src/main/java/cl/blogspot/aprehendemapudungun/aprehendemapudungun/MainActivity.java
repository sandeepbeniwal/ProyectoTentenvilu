/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.blogspot.aprehendemapudungun.aprehendemapudungun;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Germán Riveros S.
 */

public class MainActivity extends AppCompatActivity
{

    private Button btn_abc, btn_categorias, btn_informacion;
    private AdministradorBD administradorBD;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        administradorBD = new AdministradorBD(this);

        btn_informacion = (Button) findViewById(R.id.btn_informacion);
        btn_categorias  = (Button) findViewById(R.id.btn_categorias);
        btn_abc         = (Button) findViewById(R.id.btn_abc);

    }

    protected void ejecutarBotonesMain(View view)
    {
        switch (view.getId())
        {

            case R.id.btn_informacion:
                startActivity(new Intent(MainActivity.this, InformacionActivity.class)); break;

            case R.id.btn_categorias:
                startActivity(new Intent(MainActivity.this, CategoriasActivity.class)); break;

            case R.id.btn_abc:
                startActivity(new Intent(MainActivity.this, Abc_Activity.class));break;

        }
    }

}//.
