package br.com.anascoding.qualsuacomidapreferida;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup = null;
    private RadioButton radioButton = null;
    private Button btnEscolher = null;
    private TextView txtEscolha = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        btnEscolher = (Button) findViewById(R.id.btnEscolher);
        txtEscolha = (TextView) findViewById(R.id.txtEscolha);

        btnEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                if (idRadioButtonEscolhido > 0) {
                    radioButton = (RadioButton) findViewById(idRadioButtonEscolhido);
                    txtEscolha.setText(radioButton.getText());
                }
            }
        });
    }
}
