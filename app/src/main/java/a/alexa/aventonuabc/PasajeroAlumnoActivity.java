package a.alexa.aventonuabc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class PasajeroAlumnoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasajero_alumno);
        Switch switchOne = (Switch) findViewById(R.id.switch1);

        switchOne.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            Toast.makeText(PasajeroAlumnoActivity.this,
                                    "Switch On", Toast.LENGTH_SHORT).show();
                            changeRol();
                        } else {
                            Toast.makeText(PasajeroAlumnoActivity.this,
                                    "Switch Off", Toast.LENGTH_SHORT).show();
//                        changeRol();
                        }
                    }
                });
    }

    public void changeRol(){
        Intent intent = new Intent(this, ChoferPrincipal.class);
        startActivity(intent);
    }

    public void aventonpasajero(View view) {
        Intent intent = new Intent(this, AventonPasajeroActivity.class);
        startActivity(intent);
    }
}
