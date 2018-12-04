package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SolicitarAventon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_aventon);
    }

    public void principalpasajero(View view){
        Intent intent = new Intent(SolicitarAventon.this, PasajeroPrincipal.class);
        startActivity(intent);
        toastMsg("Se ha pedido un aventón, revisa en \"Aventón en curso\" si te han aceptado tu solicitud.");

    }

    public void toastMsg (String msg){
        Toast toast = Toast.makeText(this,msg, Toast.LENGTH_LONG);
        toast.show();
    }

   /* public void displayToastMsg(View v){
        toastMsg("Tu status es: activo");
    }*/

    /**Señal de panico**/
    public void motivoPanico(View view){
        Intent intent = new Intent(SolicitarAventon.this, MotivoPanico.class);
        startActivity(intent);
    }
}
