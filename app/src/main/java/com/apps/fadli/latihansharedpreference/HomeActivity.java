package com.apps.fadli.latihansharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.apps.fadli.R;
import com.apps.fadli.latihansharedpreferences.utils.Preferences;
/*
NIM : 10117179
NAMA : Wisuda Nur Fadli
Kelas : IF-5

01-05-2020 (04:00)
Membuat tampilan aplikasi dimulai dari LoginActivity, RegisterActivity dan HomeActivity
01-05-2020 (07:00)
Menyelesaikan semua aktivitas dari mulai set tombol hingga sharepreference
 */
public class HomeActivity extends AppCompatActivity {
    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Preferences.setLogout(getBaseContext());
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }
    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);
        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
