package com.andi;

public abstract class PurchasePower {

    protected static final double BASE = 1000;
    protected PurchasePower successor;

    abstract protected double getAllowable();
    abstract protected String getRole();

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < this.getAllowable())
            System.out.println((this.getRole() + " will approve $ " + purchaseRequest.getAmount()));
        else if (this.successor != null)
            successor.processRequest(purchaseRequest);

    }
}
