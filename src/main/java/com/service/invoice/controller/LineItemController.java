package com.service.invoice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.invoice.model.Invoice;
import com.service.invoice.service.LineItemService;


@RestController
public class LineItemController {

	@Autowired
	private LineItemService lineItemService;

	@GetMapping("/lineItems/{lineItemId}/invoices")
	public List<Invoice> retrieveInvoicesForLineItem(@PathVariable String lineItemId) {
		return lineItemService.retrieveInvoices(lineItemId);
	}
	
	@GetMapping("/lineItems/{lineItemId}/invoices/{invoiceId}")
	public Invoice retrieveDetailsForInvoice(@PathVariable String lineItemId,
			@PathVariable String invoiceId) {
		return lineItemService.retrieveInvoice(lineItemId, invoiceId);
	}

}