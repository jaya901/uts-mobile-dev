package com.hikmah.wijayanti.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.hikmah.wijayanti.MainActivity;
import com.hikmah.wijayanti.R;
import com.hikmah.wijayanti.model.DataModel;
import java.util.List;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.MyHolder> { List<DataModel> mList ;

    Context ctx;
    public RecylerAdapter(Context ctx, List<DataModel> mList) {
        this.mList = mList;
        this.ctx = ctx;
    }


    @Override
    public RecylerAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutlist, parent, false);
        MyHolder holder = new MyHolder(layout);
        return holder;
    }


    @Override
    public void onBindViewHolder(RecylerAdapter.MyHolder holder, final int position) {
        holder.nama.setText(mList.get(position).getmNama());
        holder.jenis.setText(mList.get(position).getmJenis());
        holder.stok.setText(mList.get(position).getmStok());
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(ctx,MainActivity.class);
                try {
                    goInput.putExtra("id", mList.get(position).getmId());
                    goInput.putExtra("nama", mList.get(position).getmNama());
                    goInput.putExtra("jenis", mList.get(position).getmJenis());
                    goInput.putExtra("stok", mList.get(position).getmStok());
                    ctx.startActivity(goInput);
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(ctx, "Error data " +e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public int getItemCount()
    {
        return mList.size();
    }


    public class MyHolder extends RecyclerView.ViewHolder {
        TextView nama, jenis, stok;
        public MyHolder(View v)
        {
            super(v);
            nama = (TextView) v.findViewById(R.id.tvNama);
            jenis = (TextView) v.findViewById(R.id.tvJenis);
            stok = (TextView) v.findViewById(R.id.tvStok);
        }
    }
}