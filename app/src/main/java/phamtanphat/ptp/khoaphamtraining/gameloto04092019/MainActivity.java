package phamtanphat.ptp.khoaphamtraining.gameloto04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRandom;
    TextView txtResult;
    EditText edtMin,edtMax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1 : Su dung alt + enter goi y code
        initView();

        // rule , graph
        //Task check valid number:
        // 1 : Phai nhap gia tri cho 2 edittext
        // 2 : Neu so min ma lon max : max = min + 1
        // 3 : So min khong duoc < 0
        //Task handle random:
        // Cac so random khong duoc lap lai
        //Task show toast
        // loi hay thanh cong thong bao cho nguoi dung biet
        Random random = new Random();
        int numberint = random.nextInt();
        Log.d("BBB",numberint + "");

    }

    private void initView() {
        btnRandom = findViewById(R.id.buttonRandom);
        txtResult = findViewById(R.id.textviewResult);
        edtMin = findViewById(R.id.edittextMin);
        edtMax = findViewById(R.id.edittextMax);
    }
}
