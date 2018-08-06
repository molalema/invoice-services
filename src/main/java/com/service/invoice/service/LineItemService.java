package com.service.invoice.service;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.service.invoice.model.Invoice;
import com.service.invoice.model.LineItem;

@Component
public class LineItemService {

	private static List<LineItem> lineItems = new ArrayList<>();

	static {
		//Initialize Data
		Invoice invoice1 = new Invoice("Invoice1", "R250", "I011", 11, "Unlimited AirTime billing", "30 July 2018");

		Invoice invoice2 = new Invoice("Invoice2", "R150","I012", 12,"5Gig DataBundle billing", "30 June 2018");

		Invoice invoice3 = new Invoice("Invoice3","R500", "I013", 13,"Unlimited AirTime and 10Gig DataBundle billing", "30 June 2018");

		Invoice invoice4 = new Invoice("Invoice4", "R1000", "I014", 14,"Unlimited AirTime and Unlimited DataBundle billing", "30 April 2018");

		LineItem airTime = new LineItem("LineItem1", "R250",
				"Monthly billed AirTime", new ArrayList<>(Arrays
						.asList(invoice1, invoice2, invoice3, invoice4)));

		LineItem dataBundles = new LineItem("LineItem2", "R500",
				"Monthly billed DataBundles", new ArrayList<>(Arrays
						.asList(invoice1, invoice2, invoice3, invoice4)));

		lineItems.add(airTime);
		lineItems.add(dataBundles);
	}

	public List<LineItem> retrieveAllLineItems() {
		return lineItems;
	}

	public LineItem retrievelineItem(String lineItemId) {
		for (LineItem lineItem : lineItems) {
			if (lineItem.getId().equals(lineItemId)) {
				return lineItem;
			}
		}
		return null;
	}

	public List<Invoice> retrieveInvoices(String lineItemId) {
		LineItem lineItem = retrievelineItem(lineItemId);

		if (lineItem == null) {
			return null;
		}

		return lineItem.getInvoices();
	}

	public Invoice retrieveInvoice(String lineItemId, String invoiceId) {
		LineItem lineItem = retrievelineItem(lineItemId);

		if (lineItem == null) {
			return null;
		}

		for (Invoice invoice : lineItem.getInvoices()) {
			if (invoice.getId().equals(invoiceId)) {
				return invoice;
			}
		}

		return null;
	}

	private SecureRandom random = new SecureRandom();

	public Invoice addInvoice(String lineItemId, Invoice invoice) {
		LineItem lineItem = retrievelineItem(lineItemId);

		if (lineItem == null) {
			return null;
		}

		String randomId = new BigInteger(130, random).toString(32);
		invoice.setId(randomId);

		lineItem.getInvoices().add(invoice);

		return invoice;
	}
}
