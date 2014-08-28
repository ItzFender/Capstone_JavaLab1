import java.math.BigDecimal;


public class PayRole {
	private double hoursWorked;
	private double hourlyRate;
	private BigDecimal grossPay;
	private BigDecimal netPay;
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public BigDecimal getGrossPay() {
		return grossPay;
	}
	public void setGrossPay() {
		BigDecimal aGrossPay = new BigDecimal(hoursWorked * hourlyRate);
		aGrossPay.setScale(2, BigDecimal.ROUND_CEILING);
		this.grossPay = aGrossPay;
	}
	public BigDecimal getNetPay() {
		return netPay;
	}
	public void setNetPay(BigDecimal netPay) {
		this.netPay = netPay;
	}
	
	private 
	
	
}
