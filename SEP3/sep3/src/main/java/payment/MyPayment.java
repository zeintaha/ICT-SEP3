package payment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

public class MyPayment {
	
	public static final String clientID = "Aco76YrSixRHvke9vvKJ4vwhivkkklcMA6mMT6LAaUeIN76mrpu5XfjD6AnDlkvnKIC-nfH9EWKBh5xW";
	public static final String clientSecret = "EPnItkPLzQVOK6dmKatRbyCREvhzGcf6VRQHE89nHFN2LSBW4I5QEs7fiXbQKXNNotAI9D469mFG4VwI";
	public static final String mode = "sandbox";
	
	
	public static Payment payment = new Payment();
	public static APIContext apiContext = new APIContext(clientID, clientSecret, "sandbox");
	public static RedirectUrls redirectUrls = new RedirectUrls();
	
	public static void main(String[] args) {
		
		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount.setTotal("1.00");

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);

		Payer payer = new Payer();
		payer.setPaymentMethod("paypal");
//		String payerId = payer.getPayerInfo().getPayerId();
		

//		Payment payment = new Payment();
		payment.setIntent("sale");
		payment.setPayer(payer);
		payment.setTransactions(transactions);

//		RedirectUrls redirectUrls = new RedirectUrls();
		redirectUrls.setCancelUrl("https://example.com/cancel");
		redirectUrls.setReturnUrl("https://example.com/return");
		payment.setRedirectUrls(redirectUrls);
		
		try {
//		    APIContext apiContext = new APIContext(clientID, clientSecret, "sandbox");
		    payment.create(apiContext);
		    // For debug purposes only: System.out.println(createdPayment.toString());
		} catch (PayPalRESTException e) {
		    // Handle errors
		} catch (Exception ex) {
		    // Handle errors
		}
		
		
		
try {

			// this call should return the paymeny id and the payer id 
		Payment payment1 =	payment.create(apiContext);
		
	
	

			Iterator links = payment1.getLinks().iterator();
			while (links.hasNext()) {
				Links link = (Links) links.next();
				if (link.getRel().equalsIgnoreCase("approval_url")) {
					// Redirect the customer to link.getHref()
				}
			}
		} catch (PayPalRESTException e) {
			System.err.println(e.getDetails());
		}
	}

	public void executePayment(HttpServletRequest req) {
		
		payment.setId(req.getParameter("paymentId"));

		PaymentExecution paymentExecution = new PaymentExecution();
		paymentExecution.setPayerId(req.getParameter("PayerID"));
		try {
			payment.execute(apiContext, paymentExecution);
			System.out.println(payment);
		} catch (PayPalRESTException e) {
			System.err.println(e.getDetails());
		}
	}
		
		
}	
		
		
	


