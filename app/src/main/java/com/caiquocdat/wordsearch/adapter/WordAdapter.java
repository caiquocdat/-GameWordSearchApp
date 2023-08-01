package com.caiquocdat.wordsearch.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.caiquocdat.wordsearch.R;
import com.caiquocdat.wordsearch.databinding.ItemWordBinding;
import com.caiquocdat.wordsearch.model.OnClickAnswer;
import com.caiquocdat.wordsearch.model.QuestionModel;
import com.caiquocdat.wordsearch.model.WordModel;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private List<WordModel> words;
    private List<String> listChoise= new ArrayList<>();
    private QuestionModel questionModel;
    private Context context;
    private OnClickAnswer onClickAnswer;

    public WordAdapter(Context context, List<WordModel> words,QuestionModel questionModel) {
        this.context=context;
        this.words = words;
        this.questionModel=questionModel;
    }

    public void setOnClickAnswer(OnClickAnswer onClickAnswer) {
        this.onClickAnswer = onClickAnswer;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemWordBinding itemWordBinding= ItemWordBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new WordViewHolder(itemWordBinding, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        WordModel current = words.get(position);
        holder.itemWordBinding.wordTv.setText(current.getWordText());
        holder.itemWordBinding.wordTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listChoise.add(current.getWordText());
                for (int i=0;i<listChoise.size();i++){
                    Log.d("Test_1", "value_choise: "+listChoise.get(i));
                }
                for (int i=0;i<questionModel.getAnswer().size();i++){
                    Log.d("Test_1", "value_correct: "+questionModel.getAnswer().get(i));
                }
                if (listChoise.size()>questionModel.getAnswer().size()){
                    listChoise.clear();
                    listChoise.add(current.getWordText());
                }
                if (onClickAnswer!=null){
                    onClickAnswer.onClick(listChoise);
                }
//                if (listChoise.equals(questionModel.getAnswer())){
//                    if (onClickAnswer!=null){
//                        onClickAnswer.onClick("true");
//                    }
//                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder {
//        public final TextView wordItemView;
        final WordAdapter mAdapter;
        ItemWordBinding itemWordBinding;

        public WordViewHolder(@NonNull ItemWordBinding itemWordBinding,WordAdapter adapter) {
            super(itemWordBinding.getRoot());
            this.itemWordBinding = itemWordBinding;
            this.mAdapter=adapter;
        }

//        public WordViewHolder(View itemView, WordAdapter adapter) {
//            super(itemView);
//            wordItemView = itemView.findViewById(R.id.wordTv);
//            this.mAdapter = adapter;
//        }
    }
}
