import java.math.BigDecimal;
import java.math.MathContext;


public class PayRole {
	private BigDecimal grossPay;
	private BigDecimal netPay;
	private MathContext mc = new MathContext(2); // 2 precision
	
	public String getGrossPay() {
		return grossPay.toPlainString();
	}
	
	public void setGrossPay(String sHoursWorked, String sHourlyRate) {
		
		// Convert hoursWorked and hourlyRate to BigDecimal
		BigDecimal hoursWorked = new BigDecimal(sHoursWorked); 
		BigDecimal hourlyRate = new BigDecimal(sHourlyRate);
		BigDecimal grossPay;
		
		// Calculate Gross pay (hoursWorked*HourlyRate)
		grossPay = hoursWorked.multiply(hourlyRate, mc);
		
		this.grossPay = grossPay;
	}
	
	public String getNetPay() {
		return netPay.toPlainString();
	}
	
	public void setNetPay(String grossPay) {
		//Determine tax rate
		String sTaxRate = taxRate(grossPay);
		//Convert taxRate to Big Decimal
		BigDecimal taxRate = new BigDecimal(sTaxRate);
		//Calculate and assign netPay (grossPay-(grossPay*taxRate))
		this.netPay = this.grossPay.subtract(this.grossPay.multiply(taxRate));
	}
	
	private String taxRate(String aGrossPay){
		//Parse aGrossPay into a double
		double grossPay = Double.valueOf(aGrossPay).doubleValue();
		String taxRate = "-1";
		
		if(grossPay > 0 && grossPay < 100){
			taxRate = "0.1";
		}
		else if(grossPay < 300){
			taxRate = "0.15";
		}
		else if(grossPay < 600){
			taxRate = "0.21";
		}
		else if(grossPay >= 600){
			taxRate = "0.28";
		}
		
		return taxRate;
	}
	
}