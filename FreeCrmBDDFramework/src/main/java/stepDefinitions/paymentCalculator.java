package stepDefinitions;

//import PaymentMethods;
import java.math.BigDecimal;
import java.util.Map;

import PaymentMethods.paymentMethods;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class paymentCalculator {
	private BigDecimal minPayment;
	private BigDecimal arrears;
	public BigDecimal finalPayment;
	public BigDecimal expPayment;
	public BigDecimal overLimit;
	//paymentMethods payM;// = new paymentMethods(); 

	@Given ("^customer has a minimum payment \"([^\"]*)\" to make$")
	public void customer_has_minimum_payment(String minPayment){
		
		this.minPayment = new BigDecimal(minPayment.substring(1));
	}

	@When ("^customer has arrears \"([^\"]*)\"$")
	public void customer_has_arrears(String arrears){
		this.arrears = new BigDecimal(arrears.substring(1));
	}

	@Then ("^make the payment \"([^\"]*)\" now$")
	public void make_the_payment_now(BigDecimal expPayment){
		finalPayment = paymentMethods.paymentNow(minPayment, arrears);
		Assert.assertEquals(expPayment.setScale(0), finalPayment);
	}

	@Then ("^make the payment later$")
	public void make_the_payment_later(DataTable payData){
		for (Map<String, BigDecimal> data : payData.asMaps(String.class, BigDecimal.class)) {
		finalPayment = paymentMethods.paymentNow(minPayment, arrears);
		overLimit = data.get("balance").add(finalPayment);
		
		expPayment = data.get("expResult").setScale(0);
		Assert.assertEquals(expPayment, paymentMethods.paymentLater(minPayment, overLimit));
		}
	}

	
}
