package vn.edu.ntu.nguyenvanphung_59131908_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen,edtNgaysinh,edtSothich;
    RadioGroup rdgGioitinh;
    RadioButton rdbNam,rdbNu;
    CheckBox cbxemphim,cbnghenhac,cbOnha,cbcafe,cbvaobep;
    Button btnXacnhan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    private void addView()
    {
       edtTen = findViewById(R.id.editTen);
       edtNgaysinh = findViewById(R.id.editNgaysinh);
       edtSothich = findViewById(R.id.editSothich);
       rdgGioitinh = findViewById(R.id.rdgGioitinh);
       rdbNam = findViewById(R.id.rdbNam);
       rdbNu = findViewById(R.id.rdbNu);
       cbxemphim = findViewById(R.id.cbxemphim);
       cbcafe = findViewById(R.id.cbcafe);
       cbnghenhac = findViewById(R.id.cbnghenhac);
       cbOnha = findViewById(R.id.cbOnha);
       cbvaobep = findViewById(R.id.cbvaobep);
       btnXacnhan =findViewById(R.id.btnXacnhan);
    }
    private  void addEvent()
    {
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Hienthi();
            }
        });
    }
    private void Hienthi()
    {
        String t1 = edtTen.getText().toString()+"\n"+"Ngày sinh: "+edtNgaysinh.getText().toString()+"\n";
        String t2 ="Giới tính:";
         switch (rdgGioitinh.getCheckedRadioButtonId())
         {
             case R.id.rdbNam:
                 t1 +=t2 + rdbNam.getText().toString(); break;
             case R.id.rdbNu:
                 t1 +=t2 + rdbNu.getText().toString();break;
         }
        String t3 = "\nSở thích:";
         t1 += t3;
        if (cbxemphim.isChecked())
        {
            t1+=cbxemphim.getText().toString()+";";
        }

        if (cbnghenhac.isChecked())
        {
            t1 +=cbnghenhac.getText().toString()+";";
        }
        if (cbcafe.isChecked())
        {
            t1 +=cbcafe.getText().toString()+";";
        }

        if (cbOnha.isChecked())
        {
            t1 +=cbOnha.getText().toString()+";";
        }
        if (cbvaobep.isChecked())
        {
            t1 +=cbvaobep.getText().toString()+";";
        }
        t1 +=edtSothich.getText().toString();
        Toast.makeText(getApplicationContext(),t1,Toast.LENGTH_LONG).show();
    }
}
