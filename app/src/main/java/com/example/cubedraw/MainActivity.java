package com.example.cubedraw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.AttributeSet;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ConstraintLayout constraintLayout;
    View mView;
    SeekBar seekBar;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = (findViewById(R.id.main_layout));
        mView = (findViewById(R.id.drawing_area));
        seekBar = (SeekBar)findViewById(R.id.seekBar);

        final FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mView = new DrawView(getApplicationContext());
                setContentView(mView);
            }
        });

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mView = new DrawView(getApplicationContext());
                setContentView(mView);
                AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
                builder1.setMessage("Coordinates:" + "x100," +"y100," + "x600," + "y600" + "\n" + "x200," +"y200," + "x800," + "y800" + "\n" + "x400," +"y400," + "x700," + "y700");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }
}
