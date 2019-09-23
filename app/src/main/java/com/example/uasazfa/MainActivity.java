package com.example.uasazfa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EditText edtJudul,edtDeskripsi;
    Button btnSubmit;
    RecyclerView.LayoutManager layoutManager;
    Context context;
    List<PersonBean> listPersonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment= new MainFragment();
        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framecontainer,fragment);
        fragmentTransaction.commit();
    }
}
