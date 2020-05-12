package sg.edu.rp.c346.id19036849.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    TextView tvOutput;
    Button btnDisplay;
    ToggleButton tbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.editText);
        tvOutput = findViewById(R.id.textView);
        btnDisplay = findViewById(R.id.button);
        tbtn = findViewById(R.id.btnToggleEnable);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etInput.getText().toString().trim();
                tvOutput.setText(input);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etInput.setEnabled( tbtn.isChecked());
            }
        });


    }
}
