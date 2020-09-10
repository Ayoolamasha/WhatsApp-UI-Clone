package com.whatsappui.Fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.whatsappui.Activites.ContactActivity;
import com.whatsappui.Adapters.ChatAdapter;
import com.whatsappui.Model.Chats;
import com.whatsappui.R;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {
    private final String TAG = "ChatsFragment";
    private Context context;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat_fragment, container, false);

        FloatingActionButton floatingActionButton = view.findViewById(R.id.contactFab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContactActivity.class);
                startActivity(intent);
            }
        });

        context = getActivity();

        RecyclerView chats = view.findViewById(R.id.recyclerView);
        chats.setHasFixedSize(true);
        chats.setLayoutManager(new LinearLayoutManager(context));

        ArrayList<Chats> chatsList = initChats();
        RecyclerView.Adapter adapter = new ChatAdapter(context, chatsList);
        chats.setAdapter(adapter);


        return view;
    }

    private ArrayList<Chats> initChats(){
        ArrayList<Chats> list = new ArrayList<>();
       Drawable image = getResources().getDrawable(R.drawable.ic_phone_android);

        list.add(new Chats("John Doe", "Hello"));
        list.add(new Chats("Ibro", "How Far"));
        list.add(new Chats("400 Level Computer Sci", "Any news on the exam?"));
        list.add(new Chats("Girls don\t chat", "E done be ooo"));
        list.add(new Chats("No name", "Who is this please"));
        list.add(new Chats("Babe", "I love you"));
        list.add(new Chats("Maga", "Thanks for the money baby"));
        list.add(new Chats("Unknown", "Unread message"));
        list.add(new Chats("Maga2", "Thanks for the money baby"));



        list.add(new Chats("John Doe", "Hello"));
        list.add(new Chats("Ibro", "How Far"));
        list.add(new Chats("400 Level Computer Sci", "Any news on the exam?"));
        list.add(new Chats("Girls don\t chat", "E done be ooo"));
        list.add(new Chats("No name", "Who is this please"));
        list.add(new Chats("Babe", "I love you"));
        list.add(new Chats("Maga", "Thanks for the money baby"));
        list.add(new Chats("Unknown", "Unread message"));
        list.add(new Chats("Maga2", "Thanks for the money baby"));
        return list;
    }
}
