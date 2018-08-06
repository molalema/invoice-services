package com.service.invoice.model;
import java.util.Date;

public class Invoice{
	private String id;
	private String client;
	private String quantity;
	private Long vatRate;
	private String description;
	private String invoiceDate;

	public Invoice(String id, String client, String quantity, int vatRate, String description, String invoiceDate) {
		super();
		this.id = id;
		this.client = client;
		this.quantity = quantity;
		this.vatRate = (long) vatRate;
		this.description = description;
		this.invoiceDate = invoiceDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getVatRate() {
		return vatRate;
	}
	
	public String getQuantity() {
		return quantity;
	}

	public String getClient() {
		return client;
	}
	
	public String getDescription() {
		return description;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}
	
	public String setInvoiceDate(String invoiceDate) {
		return invoiceDate;
	}

	@Override
	public String toString() {
		return String.format(
				"Invoice [id=%s, quantity=%s, client=%s, description=%s, invoiceDate=%s]", id, quantity, client, description, invoiceDate);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}