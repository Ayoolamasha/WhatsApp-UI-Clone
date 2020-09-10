package com.whatsappui.Activites;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.whatsappui.Adapters.ChatAdapter;
import com.whatsappui.Model.Chats;
import com.whatsappui.R;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageView backArrow = findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Toolbar toolbar = findViewById(R.id.contactToolbar);
        toolbar.inflateMenu(R.menu.contact_menu);

        RecyclerView contactView = findViewById(R.id.recyclerView);
        contactView.setHasFixedSize(true);
        contactView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Chats> contactList = initContacts();

        RecyclerView.Adapter adapter = new ChatAdapter(this, contactList);
        contactView.setAdapter(adapter);

    }

    private ArrayList<Chats> initContacts(){
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contact_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.invite:
                break;
            case R.id.contact:
                break;
            case R.id.refresh:
                break;
            case R.id.help:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
