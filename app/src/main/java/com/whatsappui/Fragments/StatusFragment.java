package com.whatsappui.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.whatsappui.Adapters.StatusAdapter;
import com.whatsappui.Model.StatusUpdates;
import com.whatsappui.R;

import java.util.ArrayList;

public class StatusFragment extends Fragment {
    private final String TAG = "StatusFragment";
    private RecyclerView statusView;
    private RecyclerView.Adapter adapter;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.status_fragment, container, false);
        context = getActivity();
        statusView = view.findViewById(R.id.statusRecyclerView);
        statusView.setHasFixedSize(true);
        statusView.setLayoutManager(new LinearLayoutManager(context));

        ArrayList<StatusUpdates> statusUpdatesList = initStatus();
        adapter = new StatusAdapter(context,statusUpdatesList);
        statusView.setAdapter(adapter);

        return view;
    }

    private ArrayList<StatusUpdates> initStatus(){
        ArrayList<StatusUpdates> list = new ArrayList<>();

        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 19:59"));
        list.add(new StatusUpdates("Dummy Text", "Today 01:50"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        list.add(new StatusUpdates("Dummy Text", "Today 00:00"));
        return list;
    }
}
