package com.example.navigationbarexam.ui.more;

public class MoreCard {
    private String cardQ; //카드질문

    public MoreCard(String cardQ) {
        this.cardQ = cardQ;
    }

    public String getCardQ() {
        return cardQ;
    }

    public void setCardQ(String cardQ) {
        this.cardQ = cardQ;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MoreCard{");
        sb.append("cardQ='").append(cardQ).append('\'');
        sb.append('}');
        return sb.toString();

    }
}
