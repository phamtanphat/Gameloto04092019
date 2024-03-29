package phamtanphat.ptp.khoaphamtraining.gameloto04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button mbtnRandom , mbtnAddnumber;
    TextView mtxtResult;
    EditText medtMin, medtMax;
    ArrayList<Integer> mMangNumber = new ArrayList<>();
    Random mRandom = new Random();
    String mStringvalueRandom = "";
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
        // 3 : So min la < 100 va max <= 100

        //Task handle random:
        // Cac so random khong duoc lap lai
        //Task show toast
        // loi hay thanh cong thong bao cho nguoi dung biet
//        Random random = new Random();

//            5 - 2000
//            (max - min + 1) + min
    //    Random khong link vung nho voi nhau
//        int numberint = random.nextInt(2000 - 5 + 1) + 5;
//        int numberint1 = random.nextInt(2000 - 5 + 1) + 5;
//        Log.d("BBB", numberint + " - " + numberint1);

        // Cach lay gia tri trong edittext
        mbtnAddnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lay gia tri trong 2 edittext
                String sTextMin = medtMin.getText().toString();
                String sTextMax = medtMax.getText().toString();
                //Kiem tra gia tri
                if (sTextMin.isEmpty() && sTextMax.isEmpty()) return;
                int sMin = Integer.parseInt(sTextMin);
                int sMax = Integer.parseInt(sTextMax);
                if (sMin < 100 && sMax <= 100) {
                    if (sMin >= sMax) {
                        sMax = sMin + 1;
                    }
                } else {
                    sMax = 100;
                    sMin = 99;
                }
                medtMin.setText(sMin +"");
                medtMax.setText(sMax +"");

                if (mMangNumber != null){
                    if (mMangNumber.size() > 0){
                        mMangNumber.clear();
                    }
                    for (int i = sMin ; i <= sMax ; i++){
                        mMangNumber.add(i);
                    }
                    Toast.makeText(MainActivity.this, mMangNumber.size()+ "", Toast.LENGTH_SHORT).show();
                }

            }
        });
        mbtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mMangNumber.size() > 0){
                    int index = mRandom.nextInt(mMangNumber.size());
                    int value = mMangNumber.get(index);
                    if (mMangNumber.size() == 1){
                        mStringvalueRandom += value ;
                    }else{
                        mStringvalueRandom += value + " - ";
                    }

                    mtxtResult.setText(mStringvalueRandom);
                    mMangNumber.remove(index);
                }else{
                    Toast.makeText(MainActivity.this, "Het so random", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

    private void initView() {
        mbtnRandom = findViewById(R.id.buttonRandom);
        mbtnAddnumber = findViewById(R.id.buttonAddValue);
        mtxtResult = findViewById(R.id.textviewResult);
        medtMin = findViewById(R.id.edittextMin);
        medtMax = findViewById(R.id.edittextMax);

    }
}
