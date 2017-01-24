package com.example.marcelo.exemplotoastcustomizado.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.marcelo.exemplotoastcustomizado.R;

/**
 * Created by Marcelo on 24/01/2017.
 */

public class Alerta {
    // Metoto que cria o Toast Customizado.
    public static final void showAlertaToast(Context context, String mensagem, int duracao, int gravity, int xOffSet, int yOffSet){
        // Infla a view que será setada no toast.
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        // Cria um objeto View que recebera a view inflada.
        View view = layoutInflater.inflate(R.layout.activity_toast, null);
        // Recupera o TextView da activity toast.
        TextView tvNome = (TextView) view.findViewById(R.id.tv_nome);
        tvNome.setText(mensagem);
        // Cria um Toast.
        Toast toast = Toast.makeText(context, null, duracao);
        // Seta onde sera mostrado o Toast.
        toast.setGravity(gravity, xOffSet, yOffSet);
        // Seta a view que sera mostrada no toast
        toast.setView(view);
        // Mostra o Toast
        toast.show();
    }
}
