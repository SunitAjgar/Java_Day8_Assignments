
import java.util.Scanner;
import java.util.Random;

public class EmpWageComputation {

  public static void main(String[] args) {
    System.out.println("--Welcome to Employee Wage Computation Program--");
    Scanner sc = new Scanner(System.in);
    Employee emp = new Employee();
    emp.checkEmpWage();
  }
}

 class Employee {
	private static int monthlyWage;
	private static int monthlyHrs;
	private static int monthlyDays = 20;
	
	private static int EmpWagePerHr = 20;
	private static int fullWorkingHr = 8;
	private static int partTimeWage = 20;
	private static int partWorkingHr = 4;
	private static int fullWage;
	private static int partTimeWage1;
	private static int CustomfullWorkingHr;


	public int getMonthlyWage() {
		return monthlyWage;
	}


	public void setMonthlyWage(int monthlyWage) {
		this.monthlyWage = monthlyWage;
	}


	public int getMonthlyHrs() {
		return monthlyHrs;
	}


	public void setMonthlyHrs(int monthlyHrs) {
		this.monthlyHrs = monthlyHrs;
	}


	public int getMonthlyDays() {
		return monthlyDays;
	}


	public void setMonthlyDays(int monthlyDays) {
		this.monthlyDays = monthlyDays;
	}


	public int getEmpWagePerHr() {
		return EmpWagePerHr;
	}


	public void setEmpWagePerHr(int empWagePerHr) {
		EmpWagePerHr = empWagePerHr;
	}


	public int getFullWorkingHr() {
		return fullWorkingHr;
	}


	public void setFullWorkingHr(int fullWorkingHr) {
		this.fullWorkingHr = fullWorkingHr;
	}


	public int getPartTimeWage() {
		return partTimeWage;
	}


	public void setPartTimeWage(int partTimeWage) {
		this.partTimeWage = partTimeWage;
	}


	public int getPartWorkingHr() {
		return partWorkingHr;
	}


	public void setPartWorkingHr(int partWorkingHr) {
		this.partWorkingHr = partWorkingHr;
	}


	public int getFullWage() {
		return fullWage;
	}


	public void setFullWage(int fullWage) {
		this.fullWage = fullWage;
	}


	public int getPartTimeWage1() {
		return partTimeWage1;
	}


	public void setPartTimeWage1(int partTimeWage1) {
		this.partTimeWage1 = partTimeWage1;
	}
	
	public int getCustomfullWorkingHr() {
		return CustomfullWorkingHr;
	}


	public void setCustomfullWorkingHr(int CustomfullWorkingHr) {
		if (CustomfullWorkingHr >= 100) {
		this.CustomfullWorkingHr = CustomfullWorkingHr;
	}
	}


	void checkEmpWage() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(3);
		switch (randomNum) {
		case 0:
		System.out.println("Employee is absent");
		break;
		
		case 1:
		System.out.println("Employee is present");
		fullWage = EmpWagePerHr * fullWorkingHr;
		System.out.println("The Daily Employee Wage for full time Employee is  " + fullWage + "$");
		System.out.println("Calculating Wage of a full time employee for a month");
		monthlyWage = monthlyDays * fullWage;
		System.out.println("The monthly wage of a full time employee is  " + monthlyWage + "$");
		System.out.println("Enter the working hours if it has met 100 hours or more");
		setCustomfullWorkingHr(sc.nextInt());
		int customSal = CustomfullWorkingHr * EmpWagePerHr;
		System.out.println("Calculating wages when working hours "+ CustomfullWorkingHr+ " is "  +customSal+ "$");
		
		break;
		
		case 2:
		System.out.println("Employee is part time present");
		partTimeWage1 = partTimeWage * partWorkingHr;
		System.out.println("The Daily Wage for the Part Time Employee is  " + partTimeWage1 + "$");
		break;
		}

	}
}