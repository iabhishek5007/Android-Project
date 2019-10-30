package com.ontrack.ontrack_faq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QnAAdapter extends RecyclerView.Adapter<QnAAdapter.QnAViewHolder> {

    private static final String TAG = "QnAAdapter";
    List<QnA> qstnList;

    public QnAAdapter(List<QnA> qstnList) {
        this.qstnList = qstnList;
    }

    @NonNull
    @Override
    public QnAViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.qstnandasnswer, parent, false);
        return new QnAViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QnAViewHolder holder, int position) {

        QnA qstnans = qstnList.get(position);
        holder.QuestionTextView.setText(qstnans.getQuestion());
        holder.AnswerTextView.setText(qstnans.getAnswer());

        boolean isExpanded = qstnList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return qstnList.size();
    }

    class QnAViewHolder extends RecyclerView.ViewHolder {

        private static final String TAG = "QnAViewHolder";

        ConstraintLayout expandableLayout;
        TextView QuestionTextView, AnswerTextView;

        public QnAViewHolder(@NonNull final View itemView) {
            super(itemView);

            QuestionTextView = itemView.findViewById(R.id.TextViewQuestions);
            AnswerTextView = itemView.findViewById(R.id.TextViewAnswer);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);


            QuestionTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    QnA qstnans = qstnList.get(getAdapterPosition());
                     qstnans.setExpanded(!qstnans.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }
}
