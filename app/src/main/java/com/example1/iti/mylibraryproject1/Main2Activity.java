package com.example1.iti.mylibraryproject1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example1.iti.libraryadd.LibraryView;
import com.example1.iti.libraryadd.MylibraryActivity;
import com.example1.iti.libraryadd.RssFeedProvider;

public class Main2Activity extends AppCompatActivity implements LibraryView.MyClick,LibraryView.MyClickText{
    private BottomNavigationView defaultBottomNavigationView, expandBottomNavigationView, moreMenuNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn = (Button) findViewById(R.id.btntest);
        defaultBottomNavigationView = (BottomNavigationView) findViewById(R.id.default_bottom_navigation);
        expandBottomNavigationView = (BottomNavigationView) findViewById(R.id.expand_bottom_navigation);
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setVisibility(View.GONE);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(Main2Activity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
        Log.v("Result","abl al btn");

        LibraryView libraryView = (LibraryView) findViewById(R.id.mylibtest);
        Context context = libraryView.getCtx();
       //Button btn2= (Button)findViewById(R.id.mylibrarybtn);
       View myview=libraryView.getView();
        Button btn2= (Button)myview.findViewById(R.id.mylibrarybtn);
        myview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
Toast.makeText(getApplicationContext(),"fel view",Toast.LENGTH_LONG).show();
            }
        });
        defaultBottomNavigationView.setVisibility(View.VISIBLE);
        defaultBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            item.setChecked(false);
            switch (item.getItemId()) {
                case R.id.action_home:
                    //Check the Item
                    item.setChecked(true);
                    replaceDummyFragment(item);
                    break;
                case R.id.action_message:
                    //Check the Item
                    item.setChecked(true);
                    replaceDummyFragment(item);
                    break;
                case R.id.action_notification:
                    //Check the Item
                    item.setChecked(true);
                    defaultBottomNavigationView.setVisibility(View.GONE);
                    expandBottomNavigationView.setVisibility(View.VISIBLE);
                    gridview.setVisibility(View.VISIBLE);
                    replaceDummyFragment(item);
                    break;
            }
            return false;
        }
    });
        expandBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(false);
                switch (item.getItemId()) {
                    case R.id.action_home:
                        //Check the Item
                        item.setChecked(true);
                        replaceDummyFragment(item);
                        break;
                    case R.id.action_message:
                        //Check the Item
                        item.setChecked(true);
                        replaceDummyFragment(item);
                        break;
                    case R.id.action_notification:
                        //Check the Item
                        item.setChecked(true);
                        defaultBottomNavigationView.setVisibility(View.VISIBLE);
                        expandBottomNavigationView.setVisibility(View.GONE);
                        gridview.setVisibility(View.GONE);

                        replaceDummyFragment(item);
                        break;
                }
                return false;
            }
        });

        //        libraryView.setOnEventListener(new LibraryView.OnEventListener() {
//            @Override
//            public void onEvent() {
//                Toast.makeText(getApplicationContext(),"fel view event listener ",Toast.LENGTH_LONG).show();
//
//            }
//        });
//
//        libraryView.doEvent();


        //libraryView.onclick12(btn2);
       // Log.v("Result","abl khales library");

       // libraryView.librarybtn();
        //libraryView.onclick12();
        //libraryView.


//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.v("Result","fell al btn 2 ");
//
//            }
//        });
//       btn2.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               Log.v("Result","Clicked");
//           }
//       });
//    libraryView.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(getApplicationContext(),"library view clked",Toast.LENGTH_LONG).show();
//        }
//    });
        //LibraryView libraryView1 = new LibraryView(this.getApplication());
        // inflate (create) another copy of our custom layout
      //  LinearLayout mainLayout = (LinearLayout) findViewById(R.id.ac);

//        LayoutInflater inflater = getLayoutInflater();
//        View myLayout = inflater.inflate(R.layout.mylibraryview, mainLayout, false);
//
//        // make changes to our custom layout and its subviews
//        myLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
//        TextView textView = (TextView) myLayout.findViewById(R.id.textView);
//        textView.setText("New Layout");

        // add our custom layout to the main layout
     //   mainLayout.addView(myLayout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(com.example1.iti.libraryadd.R.layout.myimagetest);

            }
        });
    }

    private void replaceDummyFragment(MenuItem item) {
        Toast.makeText(getApplicationContext(),"Text Clicked"+item.toString(),Toast.LENGTH_LONG).show();

    }


    @Override
    public void onclick12(View view) {
        Toast.makeText(getApplicationContext(),"BTN Clicked",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onclicktext(View view) {
        Toast.makeText(getApplicationContext(),"Text Clicked",Toast.LENGTH_LONG).show();
    }
}
