package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Motivo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivo);
    }

    public void choferPrincipal(View view) {
        Intent intent = new Intent(Motivo.this, ChoferPrincipal.class);
        startActivity(intent);
        toastMsg("Se ha rechazado la solicitud");
    }

    public void toastMsg (String msg){
        Toast toast = Toast.makeText(this,msg, Toast.LENGTH_LONG);
        toast.show();
    }
}
