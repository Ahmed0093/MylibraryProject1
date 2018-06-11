package com.example1.iti.libraryadd;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Ahmed on 2/20/2018.
 */

public class LibraryView extends LinearLayout{
    private LinearLayout header;
    protected Button btnPrev;
//    private LibraryView.OnMyClickListener j;
//    private OnEventListener mOnEventListener;
onAddTextViewCustomListener onAddTextViewCustomListener; //listener custom

    public interface onAddTextViewCustomListener  {
        //
    }

    //    private ImageView btnNext;
    private TextView txtDate;
//    private GridView grid;
    private OnClickListener l;
    private  Context ctx;
 private View view;

    public Context getCtx() {
        return ctx;
    }

    public LibraryView(Context context) {
        super(context);
        initControl(context);
    }


    //    public void setOnEventListener(OnEventListener listener) {
//        mOnEventListener = listener;
//    }
//    public void doEvent() {
//        /*
//         * code code code
//         */
//  //      btnPrev.setOnClickListener(l.onClick(););
//        btnPrev.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        }});
//
//        // and in the end
//
//        if (mOnEventListener != null)
//            mOnEventListener(); // event result object :)
//    }
    private void initControl(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

      view=  inflater.inflate(R.layout.mylibraryview,this);
        header = (LinearLayout)findViewById(R.id.linearlayoutid);
        btnPrev = (Button) findViewById(R.id.mylibrarybtn);
        txtDate =(TextView) findViewById(R.id.mylibtextid);
        this.ctx=context;
    }
        public View getView()
    {
        return view;
    }
    public void librarybtn()
    {
        Toast.makeText(ctx,"fel view",Toast.LENGTH_LONG).show();
        Log.v("Result","fe btn al library");
    }
    public void onclick12212()
    {
        Toast.makeText(ctx,"fel view",Toast.LENGTH_LONG).show();
        Log.v("Result","fe btn al library");
    }

    private void c() {
        this.btnPrev.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("Result","fe btn al library al gdeed");
            }
        });
    }



    public Button getbtnview(Context context)
    {
        return (Button) findViewById(R.id.mylibrarybtn);

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

    @Override
    public View getRootView() {
        LayoutInflater inflater = (LayoutInflater)
                ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view= inflater.inflate(R.layout.mylibraryview, this);
        return view;
    }

    private void setView() {
        // has the format hour.minuits am/pm
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String time = dateFormat.format(Calendar.getInstance().getTime());
 //           OnMyClickListener onMyClickListener = null;
//            onMyClickListener.onMyviewClick(this.txtDate);
        if(this.txtDate != null )
            txtDate.setText("TEST "+" "+time);
        else
            this.txtDate.setText("TEST BAS");
    }


    @Override
    public void setLongClickable(boolean longClickable) {
        super.setLongClickable(longClickable);
        btnPrev.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public interface MyClick
    {
        public void onclick12(View view);

    }
    public interface MyClickText
    {
        public void onclicktext(View view);

    }
    public interface Mylistener
    {
        //public void onclicklistener(View view);

    }





//    //...................
//    private void b() {
//        this.c();
//
//                this.d.setImageResource(this.m);
//                this.d.setOnClickListener(new OnClickListener() {
//                    public void onClick(View var1) {
//                        if(VfgClickCell.this.j != null) {
//                            VfgClickCell.this.j.onClick();
//                        }
//
//                    }
//                });
//
//
//        }
//
//    }
    //................
//    public void onclick12(View var)
//    {
//        Toast.makeText(ctx,"fel viewbtn12",Toast.LENGTH_LONG).show();
//        Log.v("Result","fe btn al library122");
//
//    }




}


