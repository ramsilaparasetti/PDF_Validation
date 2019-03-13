package PaymentMethods;

import java.math.BigDecimal;

public class paymentMethods {
	public static BigDecimal finalPayment;
	public static BigDecimal minPayment;
	public static BigDecimal arrears;
	public static BigDecimal overLimit;
	
	public static BigDecimal paymentNow(BigDecimal minPayment, BigDecimal arrears){
		int decisionFlag = arrears.compareTo(minPayment);
		if(decisionFlag == 1){
			finalPayment = arrears.subtract(minPayment);
		}
		else if(decisionFlag == -1){
			finalPayment = minPayment.subtract(arrears);
		}
		else finalPayment = minPayment;
		return finalPayment.setScale(0);
	}

	public static BigDecimal paymentLater(BigDecimal minPayment, BigDecimal overLimit){
		System.out.println("minPayment :" +minPayment);
		System.out.println("overLimit :" +overLimit);
		int decisionFlag = overLimit.compareTo(minPayment);
		if(decisionFlag == 1){
			finalPayment = overLimit.subtract(minPayment);
		}
		else if(decisionFlag == -1){
			finalPayment = minPayment.subtract(overLimit);
		}
		else finalPayment = minPayment;
		System.out.println("finalPayment :" +finalPayment);
		return finalPayment.setScale(0);
	}

}
