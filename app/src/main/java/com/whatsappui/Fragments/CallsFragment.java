package com.whatsappui.Fragments;

import android.content.Context;
import android.content.Intent;
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
import com.whatsappui.Adapters.CallsAdapter;
import com.whatsappui.Model.Calls;
import com.whatsappui.R;

import java.util.ArrayList;

public class CallsFragment extends Fragment {
    private final String TAG = "CallsFragment";
    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calls_fragment, container, false);
        context = getActivity();

        FloatingActionButton floatingActionButton = view.findViewById(R.id.callContactFab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContactActivity.class);
                startActivity(intent);
            }
        });
        RecyclerView callsView = view.findViewById(R.id.callsRecyclerView);
        callsView.setHasFixedSize(true);
        callsView.setLayoutManager(new LinearLayoutManager(context));
        ArrayList<Calls> callList = initCallList();
        RecyclerView.Adapter adapter = new CallsAdapter(context, callList);
        callsView.setAdapter(adapter);

        return view;
    }

    private ArrayList<Calls> initCallList(){
        ArrayList<Calls> list = new ArrayList<>();
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));
        list.add(new Calls("Bro Lekan", "15 June, 18:00"));

        return list;


    }
}
