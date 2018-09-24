package com.andi;

public class CEPPurchasePower extends PurchasePower {

    @Override
    protected double getAllowable() {
        return BASE * 10000;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
}
