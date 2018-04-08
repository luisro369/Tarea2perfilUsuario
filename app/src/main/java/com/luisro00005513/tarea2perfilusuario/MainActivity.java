package com.luisro00005513.tarea2perfilusuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nombre,carrera,face,github,correo,numero;
    ImageView algo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------------------------------
        nombre = findViewById(R.id.text_view_nombreCompleto);
        algo1 = findViewById(R.id.Imagen_id);
        carrera = findViewById(R.id.text_view_carrera);
        face = findViewById(R.id.text_view_facebook);
        github = findViewById(R.id.text_view_github);
        correo = findViewById(R.id.text_view_gmail);
        numero = findViewById(R.id.text_view_telefono);
    }//on create

    public void shareImage(View v){
        Intent share = new Intent();
        //------------------------------
        share.setAction(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_TEXT,"Nombre completo: "+ nombre.getText() + "\nCarrera: "+ carrera.getText() + "\nFacebook: " + face.getText() + "\nGitHub: " + github.getText() + "\nCorreo: " + correo.getText() + "\nTelefono: " + numero.getText());
        if(share.resolveActivity(getPackageManager()) != null){
            startActivity(share);
        }//if

    }//shareImage
}
