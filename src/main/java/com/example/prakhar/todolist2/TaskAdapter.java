package com.example.prakhar.todolist2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder>{
    private ArrayList<String> myTasks = new ArrayList<String>();

    public TaskAdapter(ArrayList<String> tasks){
        this.myTasks=tasks;
    }

    public TaskAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_card,parent,false);

        return new ViewHolder(view);
    }

    public int getItemCount() {
        return myTasks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout llTaskCard;
        TextView tvTask;

        public ViewHolder(View itemView){
            super(itemView);

            tvTask = (TextView) itemView.findViewById(R.id.tvTask);
            llTaskCard = (LinearLayout) itemView.findViewById(R.id.llTaskCard);
        }
    }

    public void onBindViewHolder(TaskAdapter.ViewHolder holder, int position){
        String currentTask = myTasks.get(position);
        holder.tvTask.setText(currentTask);
    }
}
