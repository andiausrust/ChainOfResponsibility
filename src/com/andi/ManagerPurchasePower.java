package com.andi;

public class ManagerPurchasePower extends PurchasePower{
    @Override
    protected double getAllowable() {
        return BASE * 10;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }
}
