package com.example.navigationbarexam.ui.like;

public class LikeCardItem {
    private String name;
    private String call;
    private String add;

    public LikeCardItem(String name, String call, String add) {
        this.name = name;
        this.call = call;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
