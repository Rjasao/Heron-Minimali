package com.example.heron;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText comp01EditText, comp02EditText, comp03EditText, comp04EditText, comp05EditText, comp06EditText,
            comp07EditText, comp08EditText, comp09EditText, comp10EditText, comp11EditText, comp12EditText,
            comp13EditText, comp14EditText, comp15EditText;
    private TextView txtResultado;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        comp01EditText = findViewById(R.id.comp_01);
        comp02EditText = findViewById(R.id.comp_02);
        comp03EditText = findViewById(R.id.comp_03);
        comp04EditText = findViewById(R.id.comp_04);
        comp05EditText = findViewById(R.id.comp_05);
        comp06EditText = findViewById(R.id.comp_06);
        comp07EditText = findViewById(R.id.comp_07);
        comp08EditText = findViewById(R.id.comp_08);
        comp09EditText = findViewById(R.id.comp_09);
        comp10EditText = findViewById(R.id.comp_10);
        comp11EditText = findViewById(R.id.comp_11);
        comp12EditText = findViewById(R.id.comp_12);
        comp13EditText = findViewById(R.id.comp_13);
        comp14EditText = findViewById(R.id.comp_14);
        comp15EditText = findViewById(R.id.comp_15);

        Button btnCalculator = findViewById(R.id.btnCalcular);
        Button btnErase = findViewById(R.id.btnApagar);

        txtResultado = findViewById(R.id.txtResultado);
        textView1  = findViewById(R.id.textView1);
        textView2  = findViewById(R.id.textView2);
        textView3  = findViewById(R.id.textView3);
        textView4  = findViewById(R.id.textView4);
        textView5  = findViewById(R.id.textView5);

        btnCalculator.setOnClickListener(v -> calcularAreaTriangulo());

        btnErase.setOnClickListener(v -> apagarAreaTriangulo());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})

    private void calcularAreaTriangulo() {

        double area1 = 0.0;
        double area2 = 0.0;
        double area3 = 0.0;
        double area4 = 0.0;
        double area5 = 0.0;

        try {
            double a1 = Double.parseDouble(comp01EditText.getText().toString());
            double b1 = Double.parseDouble(comp02EditText.getText().toString());
            double c1 = Double.parseDouble(comp03EditText.getText().toString());

            if (comp01EditText.getText().toString().isEmpty() || comp02EditText.getText().toString().isEmpty() || comp03EditText.getText().toString().isEmpty()) {
                // Um ou mais campos estão vazios
                // Faça algo aqui, como exibir uma mensagem de erro
                textView1.setText("Por favor, preencha todos os campos.");
            } else {
                // Todos os campos estão preenchidos, continue com os cálculos
                if (a1 + b1 > c1 && a1 + c1 > b1 && b1 + c1 > a1) {
                    double s = (a1 + b1 + c1) / 2.0;
                    area1 = Math.sqrt(s * (s - a1) * (s - b1) * (s - c1));
                    textView1.setText("Área é: " + String.format("%.2f", area1) + " u²");
                } else {
                    textView1.setText("Triângulo não aceito");
                }
            }

            // Repita o mesmo padrão para os outros conjuntos de variáveis...
        } catch (NumberFormatException e) {
            // Tratamento de exceção caso a conversão para double falhe (por exemplo, se o campo contiver texto não numérico)
            textView1.setText("Valores inválidos. Insira números nos campos.");
        }


        try {
            double a2 = Double.parseDouble(comp04EditText.getText().toString());
            double b2 = Double.parseDouble(comp05EditText.getText().toString());
            double c2 = Double.parseDouble(comp06EditText.getText().toString());

            if (comp04EditText.getText().toString().isEmpty() || comp05EditText.getText().toString().isEmpty() || comp06EditText.getText().toString().isEmpty()) {
                textView2.setText("Por favor, preencha todos os campos.");
            } else {
                if (a2 + b2 > c2 && a2 + c2 > b2 && b2 + c2 > a2) {
                    double s = (a2 + b2 + c2) / 2.0;
                    area2 = Math.sqrt(s * (s - a2) * (s - b2) * (s - c2));
                    textView2.setText("Área é: " + String.format("%.2f", area2) + " u²");
                } else {
                    textView2.setText("Triângulo não aceito");
                }
            }
        } catch (NumberFormatException e) {
            textView2.setText("Valores inválidos. Insira números nos campos.");
        }

        try {
            double a3 = Double.parseDouble(comp07EditText.getText().toString());
            double b3 = Double.parseDouble(comp08EditText.getText().toString());
            double c3 = Double.parseDouble(comp09EditText.getText().toString());

            if (comp07EditText.getText().toString().isEmpty() || comp08EditText.getText().toString().isEmpty() || comp09EditText.getText().toString().isEmpty()) {
                textView3.setText("Por favor, preencha todos os campos.");
            } else {
                if (a3 + b3 > c3 && a3 + c3 > b3 && b3 + c3 > a3) {
                    double s = (a3 + b3 + c3) / 2.0;
                    area3 = Math.sqrt(s * (s - a3) * (s - b3) * (s - c3));
                    textView3.setText("Área é: " + String.format("%.2f", area3) + " u²");
                } else {
                    textView3.setText("Triângulo não aceito");
                }
            }
        } catch (NumberFormatException e) {
            textView3.setText("Valores inválidos. Insira números nos campos.");
        }

        try {
            double a4 = Double.parseDouble(comp10EditText.getText().toString());
            double b4 = Double.parseDouble(comp11EditText.getText().toString());
            double c4 = Double.parseDouble(comp12EditText.getText().toString());

            if (comp10EditText.getText().toString().isEmpty() || comp11EditText.getText().toString().isEmpty() || comp12EditText.getText().toString().isEmpty()) {
                textView2.setText("Por favor, preencha todos os campos.");
            } else {
                if (a4 + b4 > c4 && a4 + c4 > b4 && b4 + c4 > a4) {
                    double s = (a4 + b4 + c4) / 2.0;
                    area4 = Math.sqrt(s * (s - a4) * (s - b4) * (s - c4));
                    textView4.setText("Área é: " + String.format("%.2f", area4) + " u²");
                } else {
                    textView4.setText("Triângulo não aceito");
                }
            }
        } catch (NumberFormatException e) {
            textView4.setText("Valores inválidos. Insira números nos campos.");
        }

        try {
            double a5 = Double.parseDouble(comp13EditText.getText().toString());
            double b5 = Double.parseDouble(comp14EditText.getText().toString());
            double c5 = Double.parseDouble(comp15EditText.getText().toString());

            if (comp13EditText.getText().toString().isEmpty() || comp14EditText.getText().toString().isEmpty() || comp15EditText.getText().toString().isEmpty()) {
                textView5.setText("Por favor, preencha todos os campos.");
            } else {
                if (a5 + b5 > c5 && a5 + c5 > b5 && b5 + c5 > a5) {
                    double s = (a5 + b5 + c5) / 2.0;
                    area5 = Math.sqrt(s * (s - a5) * (s - b5) * (s - c5));
                    textView5.setText("Área é: " + String.format("%.2f", area5) + " u²");
                } else {
                    textView5.setText("Triângulo não aceito");
                }
            }
        } catch (NumberFormatException e) {
            textView5.setText("Valores inválidos. Insira números nos campos.");
        }

        double area_t = area1 + area2 + area3 + area4 + area5;
        if (area_t == 0.0) {
            txtResultado.setText(" u²");
        } else {
            txtResultado.setText("Área total é: " + String.format("%.2f", area_t) + " u²");
        }

    }

    private void apagarAreaTriangulo(){

        // Limpe os campos comp_01, comp_02 e comp_03
        comp01EditText.setText("");
        comp02EditText.setText("");
        comp03EditText.setText("");
        comp04EditText.setText("");
        comp05EditText.setText("");
        comp06EditText.setText("");
        comp07EditText.setText("");
        comp08EditText.setText("");
        comp09EditText.setText("");
        comp10EditText.setText("");
        comp11EditText.setText("");
        comp12EditText.setText("");
        comp13EditText.setText("");
        comp14EditText.setText("");
        comp15EditText.setText("");
        textView1.setText("Área :");
        textView2.setText("Área :");
        textView3.setText("Área :");
        textView4.setText("Área :");
        textView5.setText("Área :");
        txtResultado.setText("Resultado:");
    }



}
