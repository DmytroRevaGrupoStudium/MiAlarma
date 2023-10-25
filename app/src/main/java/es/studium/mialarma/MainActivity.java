package es.studium.mialarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.button)
        {
            crearAlarma(v);
        }

    }

    private void crearAlarma(View v) {
        Intent intent = new Intent (AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Mensaje")
                .putExtra(AlarmClock.EXTRA_HOUR, 10)
                .putExtra(AlarmClock.EXTRA_MINUTES, 48);

        if (intent.resolveActivity(getPackageManager()) != null)
                {
                startActivity(intent);
        };
    }
}