package com.example.testprojectvirtusa;

/* In this project, we have two fragments in the main activity. Upper fragment receives input from the
 * user and sends it to lower fragment with recyclerview and updates them. Collections.sort is used to
 * sort the input given by the user and updates them to lower fragment in recyclerview.
 *
 * Here the upper fragment has to communicate with lower fragment, since a class cannot communicate with
 * another class directly, we have to create an interface such that upper fragment can communicate with lower
 * fragment through this interface using mainactivity.
 *
 * First fragment (upper) is the sender so the interface needs to be created here.
 * Step 1: create an interface
 * Step 2: create an instance of interface
 * Step 3: send the interface to its destination location
 *
 * Step 4: The mainactivity should implement the interface and must have the definition of the functions inside the
 * interface.
 * */

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstFragmentInterface {

    FragmentTransaction fragmentTransaction;
    FragmentManager fragmentManager;
    FirstFragment firstFragment;
    SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.frameLayout1, firstFragment);
        fragmentTransaction.add(R.id.frameLayout2, secondFragment);
        fragmentTransaction.commit();
    }


    @Override
    public void sendText(String text) {
        Log.e("print", "in sendText method mainactivity");
        secondFragment.updateRecyclerView(text);
    }
}
