/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.blogspot.aprehendemapudungun.aprehendemapudungun;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.app.AlertDialog;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Germán Riveros S.
 */


public class PrincipalActivity extends AppCompatActivity
{

    private FloatingActionButton btn_flotante;
    private AlertDialog.Builder builder;
    private LayoutInflater inflater;

    private AdministradorBD administradorBD;
    private Button btn_diccionario,
            btn_categorias;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn_flotante    = (FloatingActionButton) findViewById(R.id.btn_flotante);
        btn_diccionario = (Button) findViewById(R.id.btn_diccionario);
        btn_categorias  = (Button) findViewById(R.id.btn_categorias);
        administradorBD = new AdministradorBD(this);

    }

    public void ejecutarBotonesMain(View view)
    {

        switch (view.getId())
        {

            case R.id.btn_categorias:
                startActivity(new Intent(PrincipalActivity.this, CategoriasActivity.class)); break;

            case R.id.btn_diccionario:
                startActivity(new Intent(PrincipalActivity.this, Abc_Activity.class));break;
        }

    }

    public void eventoBotonFlotante(View view)
    {

        builder = new AlertDialog.Builder(this);
        inflater = getLayoutInflater();
        AlertDialog alert;

        builder.setView(inflater.inflate(R.layout.informacion_layout, null))

                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                        dialog.cancel();

                    }
                });
        alert = builder.create();
        alert.show();

    }

}//.
