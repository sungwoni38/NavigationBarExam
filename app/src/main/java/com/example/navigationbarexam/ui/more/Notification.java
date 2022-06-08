package com.example.navigationbarexam.ui.more;

public class Notification {
    private String title; //제목
    private String contents; //내용
    private String date; //날짜

    public Notification(String title, String contents, String date) {
        this.title = title;
        this.contents = contents;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notification{");
        sb.append("title='").append(title).append('\'');
        sb.append(", contents='").append(contents).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append('}');
        return sb.toString();

    }
}
