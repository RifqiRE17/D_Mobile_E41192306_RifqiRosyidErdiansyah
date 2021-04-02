package com.RifqiRosyidErdiansyah.recyclelistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// Adapter Penghubung Antara List item dan List Data
public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent , false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.txNama.setText(dataList.get(position).getNama());
        holder.txNim.setText(dataList.get(position).getNim());
        holder.txNoHp.setText(dataList.get(position).getNoHp());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txNama, txNim, txNoHp;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            txNama = itemView.findViewById(R.id.txt_nama_mahasiswa);
            txNim = itemView.findViewById(R.id.txt_nim_mahasiswa);
            txNoHp = itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
