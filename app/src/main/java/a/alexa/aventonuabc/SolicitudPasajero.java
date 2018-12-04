package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SolicitudPasajero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud_pasajero);
    }

    public void choferPrincipal(View view){
        Intent intent = new Intent (SolicitudPasajero.this, ChoferPrincipal.class);
        startActivity(intent);
        toastMsg("Se ha aceptado la solicitud, ¡Gracias!");

    }

    public void motivo(View view){
        Intent intent = new Intent (SolicitudPasajero.this, Motivo.class);
        startActivity(intent);
    }


    public void toastMsg (String msg){
        Toast toast = Toast.makeText(this,msg, Toast.LENGTH_LONG);
        toast.show();
    }

}
