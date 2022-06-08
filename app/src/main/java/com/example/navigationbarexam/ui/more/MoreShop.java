package com.example.navigationbarexam.ui.more;

public class MoreShop {
    private String shopQ; //가맹점 질문

    public MoreShop(String shopQ) {
        this.shopQ = shopQ;
    }

    public String getShopQ() {
        return shopQ;
    }

    public void setShopQ(String shopQ) {
        this.shopQ = shopQ;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MoreShop{");
        sb.append("shopQ='").append(shopQ).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
