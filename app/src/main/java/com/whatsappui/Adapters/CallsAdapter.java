package com.whatsappui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.whatsappui.Model.Calls;
import com.whatsappui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CallsAdapter extends RecyclerView.Adapter<CallsAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Calls> calls;

    public CallsAdapter(Context context, ArrayList<Calls> calls) {
        this.context = context;
        this.calls = calls;
    }

    @NonNull
    @Override
    public CallsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calls_list_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallsAdapter.ViewHolder holder, int position) {
        Calls call = calls.get(position);

        holder.callersName.setText(call.getContactCallNames());
        holder.callTime.setText(call.getCallsTimeStamp());

        holder.callersName1.setText(call.getContactCallNames());
        holder.callTime1.setText(call.getCallsTimeStamp());

        holder.callersName2.setText(call.getContactCallNames());
        holder.callTime2.setText(call.getCallsTimeStamp());

    }

    @Override
    public int getItemCount() {
        if (calls != null){
            return calls.size();
        }else{
            return 0;
        }

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView callersName;
        private TextView callTime;
        private CircleImageView circleImageView;
        private TextView callersName1;
        private TextView callTime1;
        private CircleImageView circleImageView1;
        private TextView callersName2;
        private TextView callTime2;
        private CircleImageView circleImageView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            callersName = itemView.findViewById(R.id.contactName);
            callTime = itemView.findViewById(R.id.contactTimeStamp);
            circleImageView = itemView.findViewById(R.id.contactImage);
            callersName1 = itemView.findViewById(R.id.contactName1);
            callTime1 = itemView.findViewById(R.id.contactTimeStamp1);
            circleImageView1 = itemView.findViewById(R.id.contactImage1);
            callersName2 = itemView.findViewById(R.id.contactName2);
            callTime2 = itemView.findViewById(R.id.contactTimeStamp2);
            circleImageView2 = itemView.findViewById(R.id.contactImage2);
        }
    }
}
