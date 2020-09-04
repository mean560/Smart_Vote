package com.example.smartvote;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);

        Button checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText enterIDTextView = findViewById(R.id.enterID_editText);
                String numidText = enterIDTextView.getText().toString();
                int  numid = numidText.length();

                if(numid<13){
                    Toast t = Toast.makeText(IdActivity.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG);
                    t.show();
                } else {

                    AlertDialog.Builder dialog = new AlertDialog.Builder(IdActivity.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");

                    if (numidText.equals("1111111111111")||numidText.equals("2222222222222")){
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                    } else {
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    }
                    dialog.setPositiveButton("OK", null);
                    dialog.show();
                }
            }
        });


    }
}