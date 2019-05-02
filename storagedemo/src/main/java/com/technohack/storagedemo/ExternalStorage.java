package com.technohack.storagedemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Objects;

public class ExternalStorage extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText saveFileNameText,saveDataText,getFileNameText;
    private TextView getDataText;
    private Button saveDataBtn,getDataBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_storage);

        toolbar=findViewById(R.id.common_toolbarId);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("External Storage");
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        saveFileNameText=findViewById(R.id.external_file_nameId);
        saveDataText=findViewById(R.id.external_save_dataId);
        getFileNameText=findViewById(R.id.external_get_file_nameId);
        getDataText=findViewById(R.id.external_get_dataTextId);
        saveDataBtn=findViewById(R.id.external_save_data_btnId);
        getDataBtn=findViewById(R.id.external_get_dataBtnId);

        saveDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSaveData();
            }
        });

       getDataBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getData();
           }
       });

    }

    private void getData() {


    }

    //to save the data
    private void onSaveData() {

        final String mFileName=saveFileNameText.getText().toString().trim();
        final String mData=saveDataText.getText().toString().trim();

        if(mFileName.isEmpty()){
            saveFileNameText.setError("Please provide file name");
        }else if(mData.isEmpty()){
            saveDataText.getText().toString().trim();
        }else{

            //call the method
            onSaveDataIntoExternalStorage(mFileName,mData);
        }
    }

    private void onSaveDataIntoExternalStorage(String mFileName, String mData) {

        //to reach the directory
        //File fileName=new File("/sdcard/"+mFileName);
        File fileName=new File(Environment.getExternalStorageDirectory().getPath()+mFileName);
        FileOutputStream fileOutputStream=null;
        OutputStreamWriter outputStreamWriter=null;

        try {

            //create new File with provided FileName
            boolean isFileCreated=fileName.createNewFile();

            fileOutputStream=new FileOutputStream(fileName);
            outputStreamWriter=new OutputStreamWriter(fileOutputStream);
            //to store the data
            outputStreamWriter.write(mData);

            outputStreamWriter.close();
            fileOutputStream.close();

            Toast.makeText(this, "Data Successfully Added", Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
