package com.example1.iti.libraryadd;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Ahmed on 2/20/2018.
 */

public class LibraryView extends LinearLayout {
    private LinearLayout header;
    static Button btnPrev;
//    private ImageView btnNext;
    private TextView txtDate;
//    private GridView grid;

    public LibraryView(Context context) {
        super(context);
        initControl(context);

    }

    private void initControl(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.mylibraryview, this);
        header = (LinearLayout)findViewById(R.id.linearlayoutid);
        btnPrev = (Button) findViewById(R.id.mylibrarybtn);
        txtDate =(TextView) findViewById(R.id.mylibtextid);
    }

    public LibraryView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initControl(context);
        setView();
    }

    public LibraryView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setView();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LibraryView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setView();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    private void setView() {
        // has the format hour.minuits am/pm
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String time = dateFormat.format(Calendar.getInstance().getTime());

        if(this.txtDate != null )
            txtDate.setText("TEST "+" "+time);
        else
            this.txtDate.setText("TEST BAS");
    }

    @Override
    public void setLongClickable(boolean longClickable) {
        super.setLongClickable(longClickable);
    }


    public interface MytestListener
    {
        void onbtnclickedlistener(Button btn);
    }
}
