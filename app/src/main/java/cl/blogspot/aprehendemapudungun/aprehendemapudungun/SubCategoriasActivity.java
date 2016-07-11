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
import android.widget.TextView;

public class SubCategoriasActivity extends AppCompatActivity {


    private TextView tv_TituloSubCat, tv_TextoSubCat;

    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_categorias);

        tv_TituloSubCat = (TextView) findViewById(R.id.tv_TituloSubCat);
        tv_TextoSubCat  = (TextView) findViewById(R.id.tv_textoSubCat);

        bundle = getIntent().getExtras();
        String recibeTextoBtn = bundle.getString("categoria");

        if(recibeTextoBtn.equals("Pronunciación"))
        {
            tv_TituloSubCat.setText(getText(R.string.TitCatPron));
            tv_TextoSubCat.setText(getText(R.string.TextoPronunciacion));
        }
        if(recibeTextoBtn.equals("Números"))
        {
            tv_TituloSubCat.setText(getText(R.string.TitCatNum));
            tv_TextoSubCat.setText(getText(R.string.TextoNumeros));
        }

        if(recibeTextoBtn.equals("Pronombres"))
        {
            tv_TituloSubCat.setText(getText(R.string.TitCatPronombre));
            tv_TextoSubCat.setText(getText(R.string.TextoPronombres));
        }

        if(recibeTextoBtn.equals("Saludo y despedida"))
        {
            tv_TituloSubCat.setText(getText(R.string.TitCatSaludoDespedida));
            tv_TextoSubCat.setText(getText(R.string.TextoSaludoDespedida));
        }
        if(recibeTextoBtn.equals("Conectores gram."))
        {
            tv_TituloSubCat.setText(getText(R.string.TitCatConectores));
            tv_TextoSubCat.setText(getText(R.string.TextoConectores));
        }

        if(recibeTextoBtn.equals("Interrogativos"))
        {
            tv_TituloSubCat.setText(getText(R.string.TitCatInterrogativos));
            tv_TextoSubCat.setText(getText(R.string.TextoInterrogativos));
        }

        if(recibeTextoBtn.equals("Calendario"))
        {
            tv_TituloSubCat.setText(getText(R.string.TitCatCalendario));
            tv_TextoSubCat.setText(getText(R.string.TextoCalendario));
        }

    }

}//.
