package com.juurivuohi.spring.ordermanagement;

public class Terms {

	private int paymentTerms;
	private String incoterms;

	public Terms(int paymentTerms, String incoterms) {
		this.paymentTerms = paymentTerms;
		this.incoterms = incoterms;
	}

	@Override
	public String toString() {
		return "Terms [paymentTerms=" + paymentTerms + ", incoterms=" + incoterms + "]";
	}

}
