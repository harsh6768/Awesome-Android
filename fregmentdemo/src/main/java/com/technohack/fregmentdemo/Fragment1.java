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


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    TextView  data;

    public  FragmentA fragementA;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment1, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Button sendTextBtn=view.findViewById(R.id.frag1_btnId);
         TextView  data=view.findViewById(R.id.frag1_dataId);
        final EditText editText=view.findViewById(R.id.frag1_textId);

        sendTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragementA.onASendText(editText.getText().toString().trim());
            }
        });

    }

    protected  void onASetTextUpdate(String inputText){
        data.setText(inputText);
    }

    interface FragmentA{
        void onASendText(String data);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            fragementA=(FragmentA)getActivity();
        }catch (RuntimeException e){
            throw  new RuntimeException(e);
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        fragementA=null;
    }

}
