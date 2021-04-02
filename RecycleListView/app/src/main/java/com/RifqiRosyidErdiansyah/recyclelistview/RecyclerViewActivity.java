package com.RifqiRosyidErdiansyah.recyclelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adapterMahasiswa;
    private ArrayList<Mahasiswa> mDataMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        adapterMahasiswa = new MahasiswaAdapter(mDataMahasiswa);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adapterMahasiswa);
    }

    private void addData() {
        mDataMahasiswa = new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa("Bagas","E21738121", "842567419825"));
        mDataMahasiswa.add(new Mahasiswa("Bayu","E54445656", "567825446321"));
        mDataMahasiswa.add(new Mahasiswa("Rama","E87456453", "657894123867"));
        mDataMahasiswa.add(new Mahasiswa("Jaka","E21738749", "982364897265"));
        mDataMahasiswa.add(new Mahasiswa("Brian","E21744788", "654237891235"));
        mDataMahasiswa.add(new Mahasiswa("Wahyu","E21738781", "569712365789"));

    }

}