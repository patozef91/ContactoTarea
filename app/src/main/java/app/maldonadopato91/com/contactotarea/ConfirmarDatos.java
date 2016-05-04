package app.maldonadopato91.com.contactotarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {
    private TextView tvNombre, tvFechaNacimiento, tvTelefono, tvEmail, tvDescripContacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.nombre_completo));
        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvNombre.setText(nombre);

        String fechanac = parametros.getString("fecha");
        tvFechaNacimiento = (TextView) findViewById(R.id.tvFechaNacimiento);
        tvFechaNacimiento.setText(getString(R.string.fecha_nacimiento) +"  " +fechanac);

        String telefono = parametros.getString(getResources().getString(R.string.telefono));
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvTelefono.setText(getString(R.string.tel) +"  " +telefono);

        String email = parametros.getString(getResources().getString(R.string.email));
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvEmail.setText(getString(R.string.email_confdatos) +"  " +email);

        String descrip = parametros.getString(getResources().getString(R.string.descripContacto));
        tvDescripContacto = (TextView) findViewById(R.id.tvDescripContacto);
        tvDescripContacto.setText(getString(R.string.descrip_confdatos) +"  " +descrip);
    }

    public void RegresarActividad(View v){
        Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);
        startActivity(intent);
    }
}
