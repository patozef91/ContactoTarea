package app.maldonadopato91.com.contactotarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SiguienteActividad(View v){
        //Nombre
        EditText etNombre = (EditText) findViewById(R.id.etNombre);

        //Fecha de NAcimiento
        DatePicker dpFechaNacimietno = (DatePicker) findViewById(R.id.dpFechaNacimiento);
        int day = dpFechaNacimietno.getDayOfMonth();
        int month = dpFechaNacimietno.getMonth() + 1;
        int year = dpFechaNacimietno.getYear();
        String fechaNac = +day +"/" +month+"/" +year;

        //Telefono
        EditText etTelefono = (EditText) findViewById(R.id.etTelefono);

        //email
        EditText etEmail = (EditText) findViewById(R.id.etEmail);

        //descripcion
        EditText etDescripContacto = (EditText) findViewById(R.id.etDescripContacto);
        //envio de parámetros con Intent
        Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
        intent.putExtra(getResources().getString(R.string.nombre_completo),etNombre.getText().toString());
        intent.putExtra("fecha",fechaNac);
        intent.putExtra(getResources().getString(R.string.telefono),etTelefono.getText().toString());
        intent.putExtra(getResources().getString(R.string.email),etEmail.getText().toString());
        intent.putExtra(getResources().getString(R.string.descripContacto),etDescripContacto.getText().toString());
        startActivity(intent);
    }
}
