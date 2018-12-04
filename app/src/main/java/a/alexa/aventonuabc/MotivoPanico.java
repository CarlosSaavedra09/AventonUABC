package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MotivoPanico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivo_panico);
    }

    public void pasajeroPrincipal(View view){
        Intent intent = new Intent(MotivoPanico.this, PasajeroPrincipal.class);
        startActivity(intent);
        toastMsg("Se ha emitido la señal de pánico, revisa en \"Aventón en curso\" si te han aceptado tu solicitud.");

    }

    public void toastMsg (String msg){
        Toast toast = Toast.makeText(this,msg, Toast.LENGTH_LONG);
        toast.show();
    }
}
