package com.example.manevra.Adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.manevra.Model.Kullanıcı;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class KullaniciAdapter  extends RecyclerView.Adapter<KullaniciAdapter.ViewHolder>
{


    public Context context;
    public List<Kullanıcı> mKullanici;
    private FirebaseUser firebaseUser;

    public KullaniciAdapter(Context context, List<Kullanıcı> mKullanici) {
        this.context = context;
        this.mKullanici = mKullanici;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}