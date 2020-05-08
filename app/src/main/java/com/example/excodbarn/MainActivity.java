package com.example.excodbarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btLer;
TextView txCodigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lerCodigo();
    }
    private void lerCodigo(){
        btLer=(Button)findViewById(R.id.btnLerCodigo);
        txCodigo=(TextView)findViewById(R.id.txtCodigo);
        btLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                startActivityForResult(intent,0);
            }
        });
    }
    public void onActivityResult(int requestCode , int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 0) {
                txCodigo.setText(intent.getStringExtra("SCAN_RESULT"));
        }
    }
/*testando 123 testando novamente neste pc */



}
