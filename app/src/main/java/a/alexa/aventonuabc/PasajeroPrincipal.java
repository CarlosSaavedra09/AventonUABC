package a.alexa.aventonuabc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.Toast;

public class PasajeroPrincipal extends Activity {

    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasajero_principal);

        Switch switchOne = (Switch) findViewById(R.id.switch1);

        switchOne.setOnCheckedChangeListener(
            new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(PasajeroPrincipal.this,
                            "Switch On", Toast.LENGTH_SHORT).show();
                        changeRol();
                } else {
                    Toast.makeText(PasajeroPrincipal.this,
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

}
