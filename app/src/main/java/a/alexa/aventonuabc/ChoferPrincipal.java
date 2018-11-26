package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class ChoferPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chofer_principal);

        Switch switchOne = (Switch) findViewById(R.id.switch1);

        switchOne.setOnCheckedChangeListener(
            new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(ChoferPrincipal.this,
                            "Switch On", Toast.LENGTH_SHORT).show();
                    changeRol();
                } else {
                    Toast.makeText(ChoferPrincipal.this,
                            "Switch Off", Toast.LENGTH_SHORT).show();
//                        changeRol();
                }
                }
            });
    }

    public void changeRol(){
        Intent intent = new Intent(this, PasajeroPrincipal.class);
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
}
