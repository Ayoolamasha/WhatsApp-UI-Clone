package com.whatsappui.Activites;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.whatsappui.Adapters.SectionPagerAdapter;
import com.whatsappui.Fragments.CallsFragment;
import com.whatsappui.Fragments.CameraFragment;
import com.whatsappui.Fragments.ChatsFragment;
import com.whatsappui.Fragments.StatusFragment;
import com.whatsappui.R;
import com.whatsappui.Utils.Permissions;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final int CAMERA_REQUEST_CODE = 5;
    private static final int CAMERA_FRAGMENT_NUM = 0;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Context context;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: MainActivity Started");

        toolbar = findViewById(R.id.toolBar);
        toolbar.inflateMenu(R.menu.menu);
        setUpViewPager();
//        Log.d(TAG, "onClick: launching camera");
//
//                if (((context)).getCurrentTabNumber() == CAMERA_FRAGMENT_NUM){
//                    if (((ShareActivity)getActivity()).checkPermissions(Permissions.CAMERA_PERMISSIONS[0])){
//
//                        Log.d(TAG, "onClick: starting camera");
//                        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                        startActivityForResult(cameraIntent, CAMERA_REQUEST_CODE);
//
//                    }else{
//                        Intent intent = new Intent(getActivity(), ShareActivity.class);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                        startActivity(intent);
//                    }
//                }
//            }
//        });


//        tabLayout = findViewById(R.id.tabLayout);
//        viewPager = findViewById(R.id.viewPager);
//
//
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        final SectionPagerAdapter adapter = new SectionPagerAdapter(this,getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(adapter);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });


    }


    /**
     * returns the current tab number
     * 0 = CameraFragment
     * 1 = ChatsFragment
     * @return
     */
    public int getCurrentTabNumber(){
        return viewPager.getCurrentItem() ;
    }

    private void setUpViewPager(){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment());
        adapter.addFragment(new ChatsFragment());
        adapter.addFragment(new StatusFragment());
        adapter.addFragment(new CallsFragment());
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        //CONNECT TO TAB LAYOUT
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        // SETTING ICON TO THE TABS
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera_alt_white);
        tabLayout.getTabAt(1).setText(R.string.chats);
        tabLayout.getTabAt(2).setText(R.string.status);
        tabLayout.getTabAt(3).setText(R.string.calls);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d(TAG, "onOptionsItemSelected: onMenuItem Clicked");
        switch (item.getItemId()){
            case R.id.newGroup:
                group(item);
                break;
            case R.id.newBroadcast:
                broadcast(item);
                break;
            case R.id.whatsappWeb:
                break;
            case R.id.starredMessages:
                break;
            case R.id.menuSettings:
                Log.d(TAG, "onOptionsItemSelected: Navigating to settings activity");
                settings(item);
//                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
//                Toast.makeText(getApplicationContext(), "Settings Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void settings(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    public void group(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, NewGroupActivity.class);
        startActivity(intent);
    }

    public void broadcast(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, NewBroadcastActivity.class);
        startActivity(intent);
    }
}