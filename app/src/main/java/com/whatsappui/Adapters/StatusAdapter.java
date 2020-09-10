package com.whatsappui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.whatsappui.Model.StatusUpdates;
import com.whatsappui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {
    private Context context;
    private ArrayList<StatusUpdates> updates;

    public StatusAdapter(Context context, ArrayList<StatusUpdates> updates) {
        this.context = context;
        this.updates = updates;
    }

    @NonNull
    @Override
    public StatusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.status_list_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapter.ViewHolder holder, int position) {
        StatusUpdates statusUpdates = updates.get(position);

        holder.contactName.setText(statusUpdates.getContactNames());
        holder.contactTimeStamp.setText(statusUpdates.getTimeStamp());

    }

    @Override
    public int getItemCount() {
        if (updates != null){
            return updates.size();
        }else{
            return 0; }

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView contactName;
        private TextView contactTimeStamp;
        private CircleImageView circleImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contactName = itemView.findViewById(R.id.contactName);
            contactTimeStamp = itemView.findViewById(R.id.contactTimeStamp);
            circleImageView = itemView.findViewById(R.id.contactImage);

        }
    }
}
