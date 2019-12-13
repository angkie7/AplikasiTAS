package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasiuts.R;

public class CreateMahasiswaActivity extends AppCompatActivity {
    EditText editNama, editNim, editAlamat, editEmail;
    String nama, nim, alamat, email;

    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_mahasiswa);
        this.setTitle("SI KRS - Hai Admin");

        Button btnSimpanKrs = (Button)findViewById(R.id.btnSimpanMhs);
        btnSimpanKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateMahasiswaActivity.this, AdminHome.class);
                validasiData();
                startActivity(intent);
            }
        });

        editNama = findViewById( R.id.editText );
        editNim = findViewById( R.id.editText2 );
        editAlamat = findViewById( R.id.editText6 );
        editEmail = findViewById( R.id.editText5 );
    }

    public void validasiData(){
        nama = editNama.getText().toString();
        nim = editNim.getText().toString();
        alamat = editAlamat.getText().toString();
        email = editEmail.getText().toString();

        if (TextUtils.isEmpty(nama)){
            editNama.setError ("Nama ngga boleh kosong");
        }else if (TextUtils.isEmpty(nim)) {
            editNim.setError( "NIM ngga boleh kosong" );
        }
        if (TextUtils.isEmpty(alamat)) {
            editAlamat.setError( "Alamat ngga boleh kosong" );
        }
        if (TextUtils.isEmpty(email)) {
            editEmail.setError( "e-mail ngga boleh kosong" );
        }
    }
}