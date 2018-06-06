package com.juurivuohi.spring.ordermanagement;

public class PurchaseOrder {

	private int purchaseId;
	private String product;
	private double sum;

	public PurchaseOrder(int purchaseId, String product, double sum) {
		this.purchaseId = purchaseId;
		this.product = product;
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "\nPurchase order:\n [purchaseId=" + purchaseId + ", product=" + product + ", sum=" + sum + "€]\n";
	}

}
