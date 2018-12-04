package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class CalificarUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar_usuario);
    }

    public void calEnviada(View view){
        Intent intent = new Intent(CalificarUsuario.this, ChoferPrincipal.class);
        startActivity(intent);
        toastMsg("Se ha enviado tu calificacion, ¡Gracias!");
    }

    public void calEnviadaDenuncia(View view){
        Intent intent = new Intent(CalificarUsuario.this, ChoferPrincipal.class);
        startActivity(intent);
        toastMsg("Se ha enviado tu calificación y denuncia, lamentamos esta situación, será reportada a los acreditadores.");
    }

    public void toastMsg (String msg){
        Toast toast = Toast.makeText(this,msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastExcelente(View v){
        toastMsg("¡Excelente!");
    }

    public void displayToastNeutro(View v){
        toastMsg("Normal...");
    }

    public void displayToastSad(View v){
        toastMsg("¡No me gusto para nada!");
    }

}
