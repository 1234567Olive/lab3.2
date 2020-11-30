package com.example.a32;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.DialogInterface;

import android.view.View;
import android.widget.Button;

import java.text.BreakIterator;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bn=(Button) findViewById(R.id.button);
        //为按钮绑定事件监听器
        bn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                simple(v);
            }
        });
    }

    public void simple(View source)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("简单对话框")
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("对话框的测试内容\n第二行内容");
        setPositiveButton(builder);
        setNegativeButton(builder)
                .create()
                .show();
    }

    private AlertDialog.Builder setPositiveButton(
            AlertDialog.Builder builder) {

        //调用setPositiveButton方法添加“确定”按钮
        return builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
    }
    private AlertDialog.Builder setNegativeButton(
            AlertDialog.Builder builder) {

        return builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            private BreakIterator show;

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
    }



}




