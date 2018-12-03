package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AventonPasajeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventon_pasajero);
    }

    public void cancelarAventon(View view) {
        Intent intent = new Intent(this, PasajeroAlumnoActivity.class);
        startActivity(intent);
    }
}
