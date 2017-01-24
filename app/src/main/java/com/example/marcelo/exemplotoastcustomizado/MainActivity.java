package com.example.marcelo.exemplotoastcustomizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.marcelo.exemplotoastcustomizado.util.Alerta;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recupera o view(Componente) de Botão.
        Button btnMostrarToast = (Button) findViewById(R.id.btn_mostrar_toast);
        // Recupera o view(Componente) de EditText.
        edtNome = (EditText) findViewById(R.id.edt_nome);

        // Seta o click do botão Mostrar.
        btnMostrarToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chama o Toast.
                Alerta.showAlertaToast(getApplication(), "Olá  " + edtNome.getText().toString(), Toast.LENGTH_LONG, Gravity.CENTER, 0, 0);
            }
        });
    }
}
