package com.jihadaziezi_202102256.recyclerbb;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.abrianus201103648.recyclerbparta.R;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder
{
    public ImageView _jkImageView;
    public TextView _jkTextView;
    public TextView _jpTextView;
    public TextView _namaTextView;
    public TextView _nimTextView;

    public MahasiswaViewHolder (View itemView)
    {
        super(itemView);
        _jkImageView = (ImageView) itemView.findViewById(R.id.jkImageView);
        _jkTextView = (TextView) itemView.findViewById(R.id.jkTextView);
        _jpTextView = (TextView) itemView.findViewById(R.id.jpTextView);
        _namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        _nimTextView = (TextView) itemView.findViewById(R.id.nimTextView);
    }
}