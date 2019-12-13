package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasiuts.R;

public class CreateDosenActivity extends AppCompatActivity {
    EditText editNama, editNidn, editAlamat, editEmail, editGelar;
    String nama, nidn, alamat, email, gelar;

    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dosen);
        this.setTitle("SI KRS - Hai Admin");

        Button btnDaftarKrs = (Button)findViewById(R.id.btnSimpanDsn);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validasiData();
                Intent intent = new Intent(CreateDosenActivity.this, AdminHome.class);
                startActivity(intent);
            }
        });

        editNama = findViewById( R.id.editText );
        editNidn = findViewById( R.id.editText2 );
        editAlamat = findViewById( R.id.editText6 );
        editEmail = findViewById( R.id.editText5 );
        editGelar = findViewById( R.id.editText7 );
    }

    public void validasiData(){
        nama = editNama.getText().toString();
        nidn = editNidn.getText().toString();
        alamat = editAlamat.getText().toString();
        email = editEmail.getText().toString();
        gelar = editGelar.getText().toString();

        if (TextUtils.isEmpty(nama)){
            editNama.setError ("Nama ngga boleh kosong");
        }else if (TextUtils.isEmpty(nidn)) {
            editNidn.setError( "NIDN ngga boleh kosong" );
        }
        if (TextUtils.isEmpty(alamat)) {
            editAlamat.setError( "Alamat ngga boleh kosong" );
        }
        if (TextUtils.isEmpty(email)) {
            editEmail.setError( "e-mail ngga boleh kosong" );
        }
        if (TextUtils.isEmpty(gelar)) {
            editGelar.setError( "Gelar ngga boleh kosong" );
        }
    }
}
