package ua.lviv.lgs.salary;

public class ApplicationSalary {

	public static void main(String[] args) {

		Hourly employee1 = new Hourly();
		employee1.payment("Smitt");
		Month employee2 = new Month();
		employee2.payment("John");

	}

}
