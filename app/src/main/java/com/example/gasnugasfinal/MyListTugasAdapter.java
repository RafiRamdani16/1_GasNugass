package com.example.gasnugasfinal;


import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyListTugasAdapter extends RecyclerView.Adapter<MyListTugasAdapter.ViewHolder> {
    Context context ;
    private com.example.gasnugasfinal.MyListTugas[] listdata;

    // RecyclerView recyclerView;
    public MyListTugasAdapter(Context ct ,com.example.gasnugasfinal.MyListTugas[] listdata) {
        this.listdata = listdata;
        context = ct;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item_tugas, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final com.example.gasnugasfinal.MyListTugas myListTugas = listdata[position];
        holder.textView.setText(listdata[position].getDescription());
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("NamaTugas",listdata[position].getDescription());
                bundle.putString("Tanggal",listdata[position].getTanggal());
                bundle.putString("Deadline",listdata[position].getDeadline());
                bundle.putString("Catatan",listdata[position].getCatatan());
                Intent  intent = new Intent(context,Detail.class);
                intent.putExtras(bundle);
                context.startActivity(intent);
                Toast.makeText(view.getContext(),"click on item: "+myListTugas.getDescription(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public TextView tanggal;
        public TextView deadline;
        public TextView catatan;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.deadline = (TextView) itemView.findViewById(R.id.deadline);
            this.tanggal = (TextView) itemView.findViewById(R.id.tanggal);
            this.catatan = (TextView) itemView.findViewById(R.id.catatan);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}
