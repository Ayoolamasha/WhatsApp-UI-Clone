package com.whatsappui.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.whatsappui.Model.Chats;
import com.whatsappui.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Chats> chats;

    public ChatAdapter(Context context, ArrayList<Chats> chats) {
        this.context = context;
        this.chats = chats;
    }

    @NonNull
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_list_row, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder holder, int position) {
        Chats chat = chats.get(position);

        holder.users.setText(chat.getUsers());
        holder.lastMessage.setText(chat.getLastMessage());
        Picasso.get().load(chat.getImageUri()).into(holder.imageUri);


    }

    @Override
    public int getItemCount() {
        if(chats != null){
            return chats.size();
        }else {
            return 0;
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView users;
        private TextView lastMessage;
        private CircleImageView imageUri;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            users = itemView.findViewById(R.id.user);
            lastMessage = itemView.findViewById(R.id.lastMessages);
            imageUri = itemView.findViewById(R.id.iv_avatar);
        }
    }
}
