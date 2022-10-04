package com.example.tabletlayoutvirna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;

private Button btn_submit;

private TextView textView_respuesta;

private EditText editTextTextnombre;
private EditText editTextTextapellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar =(RatingBar)findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               Toast.makeText(MainActivity.this,"seleccionó : "+rating,Toast.LENGTH_LONG).show();
            }
        });

       btn_submit=findViewById(R.id.button_submit) ;
       btn_submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               btn_submit.setText(editTextTextnombre.getText().toString()+" "+editTextTextapellido.getText().toString());
           }
       });

       textView_respuesta = findViewById(R.id.textView_respuesta);
       editTextTextnombre = findViewById(R.id.editTextTextnombre);
       editTextTextapellido=findViewById(R.id.editTextTextapellido);
    }
}