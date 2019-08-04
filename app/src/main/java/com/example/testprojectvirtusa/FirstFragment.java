package com.example.testprojectvirtusa;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    EditText editText;
    Button button;

    // step 2: instantiate that interface
     FirstFragmentInterface firstFragmentInterface;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        editText = (EditText)view.findViewById(R.id.editText);

        button = (Button)view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("print", "inside button click");
                // step 3: send the message
                firstFragmentInterface.sendText(editText.getText().toString());
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        firstFragmentInterface = (FirstFragmentInterface)context;
    }

    // Step 1: for creating interfae
    // interface is added here to communicate to a fragment or part of main activity that is not present in
    // this fragment
    public interface FirstFragmentInterface{

        // method in interface that needs to be defined in the mainactivity
        public void sendText(String text);
    }
}
