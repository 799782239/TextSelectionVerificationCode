package com.example.yanqijs.viewdemo;

/**
 * Created by yanqijs on 2016/8/16.
 */

public class TextModel {
    private String text_content;
    private boolean isClick;

    public String getText_content() {
        return text_content;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    public boolean isClick() {
        return isClick;
    }

    public void setClick(boolean click) {
        isClick = click;
    }
}
