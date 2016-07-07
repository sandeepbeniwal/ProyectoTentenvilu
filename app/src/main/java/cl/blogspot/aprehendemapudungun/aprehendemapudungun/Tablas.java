/**
 *
 * Esta obra está sujeta a la licencia Reconocimiento-NoComercial-CompartirIgual
 * 4.0 Internacional de Creative Commons. Para ver una copia de esta licencia,
 * visite http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 */

package cl.blogspot.aprehendemapudungun.aprehendemapudungun;

import android.content.Context;

/**
 * Created by germanriveros on 07-07-16.
 */
public class Tablas extends AdministradorBD
{
    public Tablas(Context context){
        super(context);
    }



    public static final String INSERTAR_LETRA_A ="INSERT INTO " + TABLE_LETRA_A + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES "+
            "('A (prep)','Meu')," +
            "('A un lado','Kiñepele')," +
            "('Abarca (zapato de madera)','Trañu, tranu')," +
            "('Abajo','Minutu, naqueltu, naqtu' )," +
            "('Abajo (mirar)','Naqkin-tun' )," +
            "('Abdomen','Pue' )," +
            "('Abertura (boca u orificio)','Nülapeyüm' )," +
            "('Ablandarse','Nguëfadn, nguëfashn')," +
            "('Abogado','Dënguñmachefe' )," +
            "('a veces, tal vez ', 'katrü')" +
            ";";



    public static final String INSERTAR_LETRA_B="INSERT INTO " + TABLE_LETRA_B + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES "+
            "('babas','ülwi' )," +
            "('babear, perder las babas ','ülwin')," +
            "('bailar alrededor de algo ','peruñman')," +
            "('bailarín ','perunfe')," +
            "('bajar','nakmen')" +
            ";";



    public static final String INSERTAR_LETRA_C="INSERT INTO " + TABLE_LETRA_C + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('caballo','kawell' )," +
            "('cabecear','mülchongn' )," +
            "('cabeza','lonco' )," +
            "('cabeza; 2. jefe; 3. pelo, cabello; 4. espiga ','lonko' )," +
            "('cacarear (ruido de las aves)','chachakün' )" +
            ";";


    public static final String INSERTAR_LETRA_D="INSERT INTO " + TABLE_LETRA_D + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('danza','perun' )," +
            "('dar comienzo a alguna cosa ','tuweln' )," +
            "('dar vida','mongeln' )," +
            "('darse vuelta ','waychefuwun' )," +
            "('deber','defelen' )" +

            ";";


    public static final String INSERTAR_LETRA_E="INSERT INTO " + TABLE_LETRA_E + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('eco','awkinko' )," +
            "('embarrarse','peletun' )," +
            "('empujar','retren' )," +
            "('escoba','lepüwe' )," +
            "('espalda','furi' )" +

            ";";

    public static final String INSERTAR_LETRA_F="INSERT INTO " + TABLE_LETRA_F + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('fauces','ngiñngo' )," +
            "('fiebre','aling' )," +
            "('finalizar','acun' )," +
            "('flauta','pifelka' )," +
            "('flecha','pelki' )" +

            ";";


    public static final String INSERTAR_LETRA_G="INSERT INTO " + TABLE_LETRA_G + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('gallina - gallo ',' achaw - achawa' )," +
            "('galopar;','wirafün' )," +
            "('ganancia','wew' )," +
            "('gato','narki' )," +
            "('gaviota','cahuil' )" +

            ";";

    public static final String INSERTAR_LETRA_H="INSERT INTO " + TABLE_LETRA_H + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('hablar','dungun' )," +
            "('hambre','ngeñü' )," +
            "('harina','rengo' )," +
            "('helada','piliñ' )," +
            "('hermano','peñi' )" +

            ";";

    public static final String INSERTAR_LETRA_I="INSERT INTO " + TABLE_LETRA_I + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('idioma','mapudungu' )," +
            "('imitar','inawentu' )," +
            "('injuriar','trewalkan' )," +
            "('inundación','tripakon' )," +
            "('invierno','pukem' )" +

            ";";

    public static final String INSERTAR_LETRA_J="INSERT INTO " + TABLE_LETRA_J + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('jactarse,','malmakawn' )," +
            "('joroba','ngetrufuri' )," +
            "('jote','kanin' )," +
            "('joven','weche' )," +
            "('jugar','awkantun' )" +

            ";";

    public static final String INSERTAR_LETRA_L="INSERT INTO " + TABLE_LETRA_L + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('labios','mellfü' )," +
            "('labrado','kaf' )," +
            "('ladrar','wankün' )," +
            "('ladrón','chukinfe' )," +
            "('lagartija','fillkun' )" +

            ";";

    public static final String INSERTAR_LETRA_LL="INSERT INTO " + TABLE_LETRA_LL + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('Llaga','allfen' )," +
            "('Llamado','metrën' )," +
            "('Llama de fuego','weiwiñkütral' )" +

            ";";


    public static final String INSERTAR_LETRA_M="INSERT INTO " + TABLE_LETRA_M + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('mamita','papay' )," +
            "('mañana','ule' )," +
            "('mano','kuk' )," +
            "('manso','ñom' )," +
            "('más','yom' )" +

            ";";

    public static final String INSERTAR_LETRA_N="INSERT INTO " + TABLE_LETRA_N + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('niña,','malen' )," +
            "('niño,','weñi' )," +
            "('noche','pun' )," +
            "('norte','piku' )," +
            "('nube','tromü' )" +

            ";";

    public static final String INSERTAR_LETRA_O="INSERT INTO " + TABLE_LETRA_O + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('obedecer','yedengun' )," +
            "('ocho','pura' )," +
            "('ofender','yafkan' )," +
            "('ojo','kuralnge' )," +
            "('olla','challa' )" +

            ";";

    public static final String INSERTAR_LETRA_P="INSERT INTO " + TABLE_LETRA_P + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('paloma','kono' )," +
            "('pan','kofke' )," +
            "('panadero','kofkefe' )," +
            "('papa','poñi' )," +
            "('pasear','pasia' )" +

            ";";

    public static final String INSERTAR_LETRA_Q="INSERT INTO " + TABLE_LETRA_Q + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('quebrar','trayayün' )," +
            "('quedar ciego ','trawman' )," +
            "('quemar,','kulan' )," +
            "('querer','dwamen' )," +
            "('quinoa','zawe' )" +

            ";";

    public static final String INSERTAR_LETRA_R="INSERT INTO " + TABLE_LETRA_R + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('raíz','folil' )," +
            "('rama,','row' )," +
            "('rápido','pürüm' )," +
            "('rayos','omilen' )," +
            "('rebelde','awka' )" +

            ";";

    public static final String INSERTAR_LETRA_S="INSERT INTO " + TABLE_LETRA_S + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('saber','kimen' )," +
            "('sacudir','mütrün' )," +
            "('sal','chadi' )," +
            "('saludar','chalin' )," +
            "('sano','tremo' )" +

            ";";

    public static final String INSERTAR_LETRA_T="INSERT INTO " + TABLE_LETRA_T + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('tabaco','petrem' )," +
            "('tabla','trafla' )," +
            "('tambor','kultrung' )" +

            ";";

    public static final String INSERTAR_LETRA_U="INSERT INTO " + TABLE_LETRA_U + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('ultimo día ','afantü' )," +
            "('una vez ',' kiñe rupachi' )," +
            "('uno ','kiñe' )" +

            ";";

    public static final String INSERTAR_LETRA_V="INSERT INTO " + TABLE_LETRA_V + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('vaca','waka' )," +
            "('vaciarse','wellin' )," +
            "('valle','waw' )" +

            ";";

    public static final String INSERTAR_LETRA_Y="INSERT INTO " + TABLE_LETRA_Y + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('y a quién más?',' ka iney am' )," +
            "('yapa','yompeñ' )," +
            "('yo','iñche' )" +

            ";";

    public static final String INSERTAR_LETRA_Z="INSERT INTO " + TABLE_LETRA_Z + " (" + CN_ESP + "," + CN_MAPU +")"
            + " VALUES"+
            "('zambullirse','remun' )," +
            "('zancudo','rofi' )," +
            "('zorro','nguru' )" +

            ";";


}
