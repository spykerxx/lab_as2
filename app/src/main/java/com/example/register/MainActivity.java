package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText phone;
    EditText age;
    EditText address;
    EditText gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.text_name);
        email=findViewById(R.id.text_email);
        phone=findViewById(R.id.phone_number);
        age=findViewById(R.id.age);
        address=findViewById(R.id.text_address);
        gender=findViewById(R.id.gender);
            }

    public void onOkClicked(View view) {
        String sName=name.getText().toString();
        String sEmail=email.getText().toString();
        String sPhone=phone.getText().toString();
        String sAge=age.getText().toString();
        String sAddress=address.getText().toString();
        String sGender=gender.getText().toString();
        Intent intent=new Intent(this,Informations.class);
        intent.putExtra("name",sName);
        intent.putExtra("email",sEmail);
        intent.putExtra("phone",sPhone);
        intent.putExtra("age",sAge);
        intent.putExtra("address",sAddress);
        intent.putExtra("gender",sGender);
        startActivity(intent);
    }
}
