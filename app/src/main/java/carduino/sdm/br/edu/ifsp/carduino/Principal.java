package carduino.sdm.br.edu.ifsp.carduino;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends Activity {

    Button btnManual, btnAutomatico, btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void fazerConexoesLayoutListeners(){

        btnManual = (Button) findViewById(R.id.btnManual);
        btnAutomatico = (Button) findViewById(R.id.btnAutomatico);
        btnFechar = (Button) findViewById(R.id.btnFechar);

        btnManual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(this, ManualControl.class));
            }
        });
    }
}
