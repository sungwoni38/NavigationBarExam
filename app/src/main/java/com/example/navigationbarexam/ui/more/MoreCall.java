package com.example.navigationbarexam.ui.more;

public class MoreCall {
    private String local; //지역
    private String call; //전화번호

    public MoreCall(String local, String call) {
        this.local = local;
        this.call = call;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MoreCall{");
        sb.append("local='").append(local).append('\'');
        sb.append(", call='").append(call).append('\'');
        sb.append('}');
        return sb.toString();

    }
}
