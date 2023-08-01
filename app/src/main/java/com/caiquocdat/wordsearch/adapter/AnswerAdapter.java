package com.caiquocdat.wordsearch.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.caiquocdat.wordsearch.databinding.ItemAnswerBinding;
import com.caiquocdat.wordsearch.databinding.ItemWordBinding;

import java.util.ArrayList;
import java.util.List;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.ViewHolder> {

    private List<String> answerList;
    private List<String> selectList;
    private Context context;

    public AnswerAdapter(List<String> answerList, List<String> selectList, Context context) {
        this.answerList = answerList;
        this.selectList = selectList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemAnswerBinding itemWordBinding = ItemAnswerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(itemWordBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("Test_3", "size: " + selectList);
        holder.itemAnswerBinding.wordTv.setBackgroundColor(Color.parseColor("#025EE8"));
        if (selectList != null) {
            int size = selectList.size();
            for (int i = 0; i < size; i++) {
                String answer = selectList.get(i);
                if (position == i) {
                    holder.itemAnswerBinding.wordTv.setText(answer);
                    holder.itemAnswerBinding.wordTv.setBackgroundColor(Color.parseColor("#FF88FA"));
                }
            }
            if (selectList.size()==answerList.size()){
                new CountDownTimer(500, 1000) {

                    public void onTick(long millisUntilFinished) {
                        // Các hành động cần thực hiện sau mỗi "tick", trong trường hợp này là 1000 mili giây (1 giây)
                    }

                    public void onFinish() {
                        // Các hành động cần thực hiện khi hết thời gian đếm ngược
                        holder.itemAnswerBinding.wordTv.setText("");
                        holder.itemAnswerBinding.wordTv.setBackgroundColor(Color.parseColor("#025EE8"));
                    }
                }.start();
            }
        }
//        selectList= new ArrayList<>();
//        selectList.add("1");
//        Log.d("Test_3", "size: "+selectList.size());
    }

    @Override
    public int getItemCount() {
        return answerList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemAnswerBinding itemAnswerBinding;

        public ViewHolder(@NonNull ItemAnswerBinding itemAnswerBinding) {
            super(itemAnswerBinding.getRoot());
            this.itemAnswerBinding = itemAnswerBinding;

        }
    }
}

