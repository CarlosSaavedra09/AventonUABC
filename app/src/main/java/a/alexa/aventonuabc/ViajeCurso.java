package a.alexa.aventonuabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ViajeCurso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viaje_curso);
    }

    public void calificar (View view){
        Intent intent = new Intent (ViajeCurso.this, CalificarUsuario.class);
        startActivity(intent);
    }

    public void toastMsg (String msg){
        Toast toast = Toast.makeText(this,msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastEmergencia(View v){
        toastMsg("Se ha llamado a la ambulancia, ¡En un momento llegarán!");
    }

}
