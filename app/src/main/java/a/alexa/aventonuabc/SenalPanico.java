package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SenalPanico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senal_panico);
    }

    public void choferPrincipal(View view){
        Intent intent = new Intent(SenalPanico.this, ChoferPrincipal.class);
        startActivity(intent);
    }

    public void motivo(View view){
        Intent intent = new Intent(SenalPanico.this, Motivo.class);
        startActivity(intent);

    }
}
