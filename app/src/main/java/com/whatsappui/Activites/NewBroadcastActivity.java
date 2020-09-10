package com.whatsappui.Activites;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.whatsappui.Adapters.ChatAdapter;
import com.whatsappui.Model.Chats;
import com.whatsappui.R;

import java.util.ArrayList;

public class NewBroadcastActivity extends AppCompatActivity {
    private RecyclerView broadcastView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newbroadcast);

        ImageView backArrow = findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        broadcastView = findViewById(R.id.recyclerView);
        broadcastView.setHasFixedSize(true);
        broadcastView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Chats> broadcastList = initBroadcast();

        adapter = new ChatAdapter(this, broadcastList);
        broadcastView.setAdapter(adapter);


    }

    private ArrayList<Chats> initBroadcast(){
        ArrayList<Chats> list = new ArrayList<>();
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Available"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));
        list.add(new Chats("John Doe", "Calls Only"));

        return list;
    }
}
