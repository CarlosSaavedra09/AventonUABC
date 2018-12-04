package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SolicitudesAventones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitudes_aventones);
    }

    public void solicitudCarlos(View view){
        Intent intent = new Intent(SolicitudesAventones.this, SolicitudPasajero.class);
        startActivity(intent);
    }

    public void senalPanico(View view){
        Intent intent = new Intent(SolicitudesAventones.this, SenalPanico.class);
        startActivity(intent);
    }

}
