package com.technohack.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Menus extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    private TextView contextMenuText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        contextMenuText=findViewById(R.id.context_menuId);
        //regiter the view for context menu
        registerForContextMenu(contextMenuText);
    }

    //Options Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.normal_menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu_settingsId:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_accountId:
                Toast.makeText(this,"Account",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_logoutId:
                Toast.makeText(this,"Logout",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;

        }
    }

    //

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu_saveId:
                Toast.makeText(this,"Save",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_deleteId:
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return true;

        }
    }

    //for popup menu

    public void onPopupMenu(View view){

        PopupMenu popupMenu=new PopupMenu(getApplicationContext(),view);
        popupMenu.setOnMenuItemClickListener(Menus.this);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){

            case R.id.popup1_menuId:
                Toast.makeText(this,"Popup Menu Item 1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popup2_menuId:
                Toast.makeText(this,"Popup Menu Item 2",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;

        }
    }

}
