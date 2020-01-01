package top.ldtianzhe.mylibrary.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;
import top.ldtianzhe.mylibrary.R;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("LIBRARY-关于");
        }


        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logo)//图片
                .setDescription("LIBRARY学生端是基于LIBRARY-WEB端开发的安卓版图书管理系统(学生端),旨在为读者提供更加便捷的查询服务！")//介绍
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("与我联系")
                .addEmail("ldtianzhe@163.com")//邮箱
                .addWebsite("https://ldtianzhe.top")//网站
                .addGitHub("ldtianzhe")//github
                .create();
        setContentView(aboutPage);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
