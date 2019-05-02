package com.technohack.storagedemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class InternalStorage extends AppCompatActivity {

    private EditText fileName,dataText,getFileNameText;
    private Button saveDataBtn,getDataBtn;
    private TextView getData;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_storage);

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Internal Storage");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fileName=findViewById(R.id.internal_file_nameId);
        dataText=findViewById(R.id.internal_dataId);
        saveDataBtn=findViewById(R.id.internal_save_data_btnId);
        getFileNameText=findViewById(R.id.internal_get_file_nameId);
        getData=findViewById(R.id.get_dataId);
        getDataBtn=findViewById(R.id.internal_get_dataId);

        //For saving the data
        saveDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String mFileName=fileName.getText().toString().trim();
                final String mDataText=dataText.getText().toString().trim();

                if(mFileName.isEmpty()){
                    fileName.setError("Please Provide File Name");
                }else if(mDataText.isEmpty()){
                    dataText.setError("Please Provide Data to Store");
                }else{
                    onSaveDataIntoInternalStorage(mFileName,mDataText);
                }
            }
        });


        getDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String mFileName=getFileNameText.getText().toString().trim();
                if(mFileName.isEmpty()){
                    getFileNameText.setError("Please Provide File Name to get the Data");
                }else{

                   String data=getDataFromInternalStorage(mFileName);

                   getData.setText(data);
                }

            }
        });

    }

    private String getDataFromInternalStorage(String mFileName) {
        //to store the data
        StringBuilder stringBuilder=new StringBuilder();

        FileInputStream fileInputStream=null;
        InputStreamReader inputStreamReader=null;
        BufferedReader bufferedReader=null;

        try {
            fileInputStream=openFileInput(mFileName);

            inputStreamReader=new InputStreamReader(fileInputStream);

            bufferedReader=new BufferedReader(inputStreamReader);

            String singleLine=null;
            //to read the data from the file
            while((singleLine=bufferedReader.readLine())!=null){

                stringBuilder.append(singleLine).append('\n');

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();

    }

    //to save the data into the internal storage
    private void onSaveDataIntoInternalStorage(String mFileName, String mDataText) {

        FileOutputStream fileOutputStream=null;

        try {
            //Open file to write the data
            // mFileName : File Name in which we will be storing the data
            fileOutputStream=openFileOutput(mFileName,Context.MODE_PRIVATE );
            /*
             * Context.MODE_PRIVATE : Is Default value
             * Context.MODE_APPEND :
             */
            fileOutputStream.write(mDataText.getBytes());
            fileOutputStream.close();
            Toast.makeText(InternalStorage.this, "Data Stored Successfully", Toast.LENGTH_SHORT).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

