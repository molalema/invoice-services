package com.service.invoice.model;

import java.util.ArrayList;
import java.util.List;


public class LineItem {
	private String id;
	private String quantity;
	private String description;
	private List<Invoice> invoices;;

	public LineItem(String id, String quantity, String description,
			List<Invoice> invoices) {
		super();
		this.id =  id;
		this.quantity = quantity;
		this.description = description;
		this.invoices = invoices;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [id=%s, quantity=%s, description=%s]", id, quantity, description);
	}
}