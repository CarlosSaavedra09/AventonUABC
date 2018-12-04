package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChoferPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chofer_principal);
    }

    /*------ ACCIONES DE LOS BOTONES -------*/

    public void solicitudes(View view){
        Intent intent = new Intent(ChoferPrincipal.this, SolicitudesAventones.class);
        startActivity(intent);
    }

    public void viajeCurso(View view){
        Intent intent = new Intent(ChoferPrincipal.this, ViajeCurso.class);
        startActivity(intent);
    }

    public void cambiorol(View view){
        Intent intent = new Intent(ChoferPrincipal.this, PasajeroPrincipal.class);
        startActivity(intent);
    }

    public void loginpage(View view){
        Intent intent = new Intent(ChoferPrincipal.this, LoginActivity.class);
        startActivity(intent);
    }

    public void toastMsg (String msg){
        Toast toast = Toast.makeText(this,msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View v){
        toastMsg("Tu status es: activo");
    }

    public void displayToastSolicitud(View v){
        toastMsg("No tienes solicitudes de aventones por el momento");
    }

    public void displayToastPanico(View v){
        toastMsg("Por el momento, ningun pasajero ha presionado la señal de pánico, ¡Gracias!");
    }


    public void displayToastSwitch(View v){
        toastMsg("Espere un momento....");
    }
}
