package phamtanphat.ptp.khoaphamtraining.gameloto04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button mbtnRandom;
    TextView mtxtResult;
    EditText medtMin, medtMax;

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
//        Random random = new Random();

//            5 - 2000
//            (max - min + 1) + min
        // Random khong link vung nho voi nhau
//        int numberint = random.nextInt(2000 - 5 + 1) + 5;
//        int numberint1 = random.nextInt(2000 - 5 + 1) + 5;
//        Log.d("BBB", numberint + " - " + numberint1);

        // Cach lay gia tri trong edittext
        mbtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sTextMin = medtMin.getText().toString();
                Log.d("BBB",sTextMin);
            }
        });



    }

    private void initView() {
        mbtnRandom = findViewById(R.id.buttonRandom);
        mtxtResult = findViewById(R.id.textviewResult);
        medtMin = findViewById(R.id.edittextMin);
        medtMax = findViewById(R.id.edittextMax);
    }
}
