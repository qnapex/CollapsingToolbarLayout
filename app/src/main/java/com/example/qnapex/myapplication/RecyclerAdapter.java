package com.example.qnapex.myapplication;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qnapex.myapplication.databinding.ItemListBinding;

/**
 * Created by QNapex on 2016/7/7.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerBindHolder> {

    private Context context;
    private LayoutInflater layoutInflater;

    public RecyclerAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerBindHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemListBinding itemListBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_list, parent, false);
        RecyclerBindHolder recyclerBindHolder = new RecyclerBindHolder(itemListBinding.getRoot());
        recyclerBindHolder.setItemListBinding(itemListBinding);
        return recyclerBindHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerBindHolder holder, int position) {
        Log.e("position", "" + position);
        holder.itemListBinding.setText("" + position);
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public static class RecyclerBindHolder extends RecyclerView.ViewHolder {

        private ItemListBinding itemListBinding;

        public ItemListBinding getItemListBinding() {
            return itemListBinding;
        }

        public void setItemListBinding(ItemListBinding itemListBinding) {
            this.itemListBinding = itemListBinding;
        }

        public RecyclerBindHolder(View itemView) {
            super(itemView);
        }
    }
}
