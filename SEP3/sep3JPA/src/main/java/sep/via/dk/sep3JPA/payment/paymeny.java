//package sep.via.dk.sep3JPA.payment;
//
//import java.awt.Desktop;
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Scanner;
//
//import com.paypal.api.payments.Amount;
//import com.paypal.api.payments.Links;
//import com.paypal.api.payments.Payer;
//import com.paypal.api.payments.Payment;
//import com.paypal.api.payments.PaymentExecution;
//import com.paypal.api.payments.RedirectUrls;
//import com.paypal.api.payments.Transaction;
//
//import com.paypal.base.rest.APIContext;
//import com.paypal.base.rest.PayPalRESTException;
//
//public class paymeny {
//	public static final String clientID = "Aco76YrSixRHvke9vvKJ4vwhivkkklcMA6mMT6LAaUeIN76mrpu5XfjD6AnDlkvnKIC-nfH9EWKBh5xW";
//	public static final String clientSecret = "EPnItkPLzQVOK6dmKatRbyCREvhzGcf6VRQHE89nHFN2LSBW4I5QEs7fiXbQKXNNotAI9D469mFG4VwI";
//	public static final String mode = "sandbox";
//
//	public static Payment payment = new Payment();
//
//	public static APIContext apiContext = new APIContext(clientID, clientSecret, "sandbox");
//	public static RedirectUrls redirectUrls = new RedirectUrls();
//	String href = null;
//
//	public String getHref() {
//		return href;
//	}
//
//	public void setHref(String href) {
//		this.href = href;
//	}
//
//	public String setPayment1() {
//
//		Amount amount = new Amount();
//		amount.setCurrency("USD");
//		amount.setTotal("1.00");
//
//		Transaction transaction = new Transaction();
//		transaction.setAmount(amount);
//		List<Transaction> transactions = new ArrayList<Transaction>();
//		transactions.add(transaction);
//
//		Payer payer = new Payer();
//		payer.setPaymentMethod("paypal");
//
//		payment.setIntent("sale");
//		payment.setPayer(payer);
//
//		payment.setTransactions(transactions);
//
//		redirectUrls.setCancelUrl("https://example.com/cancel");
//		// redirectUrls.setReturnUrl("https://example.com/return");
//		redirectUrls.setReturnUrl("http://www.google.com");
//
//		payment.setRedirectUrls(redirectUrls);
//
//		try {
//
//			payment.create(apiContext);
//			// For debug purposes only: System.out.println(createdPayment.toString());
//		} catch (PayPalRESTException e) {
//			// Handle errors
//		} catch (Exception ex) {
//			// Handle errors
//		}
//
//		try {
//
//			// this call should return the payment id and the payer id
//
//			Payment payment1 = payment.create(apiContext);
//
//			;
//			Iterator links = payment1.getLinks().iterator();
//
//			while (links.hasNext()) {
//				Links link = (Links) links.next();
//				System.out.println();
//				System.out.println(link.toString());
//				if (link.getRel().equalsIgnoreCase("approval_url")) {
//					href = link.getHref();
//				}
//			}
//
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Go to " + href + " to complete transaction.\nPress enter when ready");
//			Desktop.getDesktop().browse(new URI(href));
//			scanner.nextLine();
//
//			PaymentExecution paymentExecution = new PaymentExecution();
//
//			paymentExecution.setPayerId("DUSYFH5YB7NC8");
//
//			Payment payment2 = payment1.execute(apiContext, paymentExecution);
//			
//			String str2 = payment2.getState();
//			if(str2 !=null) {
//			System.out.println(" customer has payed ");
//
//			return str2;
//			}
//		} catch (PayPalRESTException e) {
//			System.out.println("not payed first ");
//
//		} catch (IOException e) {
//			System.out.println("not payed second ");
////		e.printStackTrace();
//		} catch (URISyntaxException e) {
//			System.out.println("not payed third ");
////		e.printStackTrace();
//		}
//		return " no payment ";
//
//	}
//}
