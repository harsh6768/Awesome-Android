package com.technohack.fregmentdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {



    FragmentB fragmentB;

    TextView dataText;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment2, container, false);

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button sendTextBtn=view.findViewById(R.id.frag2_btnId);
        dataText=view.findViewById(R.id.frag2_dataId);
        final EditText editText=view.findViewById(R.id.frag2_textId);

        sendTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentB.onBSendText(editText.getText().toString().trim());

            }
        });

    }

    public void onBSetTextUpdate(String inputData){
        dataText.setText(inputData);

    }

    interface FragmentB{
        void onBSendText(String data);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            fragmentB= (FragmentB) getActivity();
        }catch (RuntimeException r){
            throw  new RuntimeException("Exception");
        }
    }



}
