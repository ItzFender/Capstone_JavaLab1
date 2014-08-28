import java.util.Scanner;


public class test {
	@SuppressWarnings("resource")
	public static void main(String[]args){
		String hoursWorked;
		String hourlyrate;
		System.out.println("Enter hours worked: ");
		Scanner scanner = new Scanner(System.in);
		hoursWorked = scanner.nextLine();
		System.out.println("Enter hourly rate: ");
		hourlyrate = scanner.nextLine();
		
		PayRole payRole = new PayRole();
		payRole.setGrossPay(hoursWorked, hourlyrate);
		payRole.setNetPay(payRole.getGrossPay());
		System.out.println("Gross Pay: " +payRole.getGrossPay());
		System.out.println("Net Pay: " +payRole.getNetPay());
	}
}
