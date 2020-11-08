package th.ac.su.cp.speedrecords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class add extends AppCompatActivity {
        private EditText edis;
        private EditText etime;
        private Button save = (Button) findViewById(R.id.savebut);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edis = (EditText) findViewById(R.id.edis);
        etime = (EditText) findViewById(R.id.etime);
        double di = Double.parseDouble(edis.getText().toString());
        double ti = Double.parseDouble(etime.getText().toString());
        double sum = di/ti;
        double v = sum/0.277778;
        String str = String.format(Locale.getDefault(),"%.2f",v);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
    }
    public void openMain(){
        Intent intent = new Intent(this,add.class);
        startActivity(intent);
    }
}