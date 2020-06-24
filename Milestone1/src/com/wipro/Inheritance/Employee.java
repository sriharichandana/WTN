package com.wipro.Inheritance;

public class Employee extends Person{
	private double AnnualSalary;
	private int StartingYear;
	private String InsuranceNumber;
	
	
	Employee(String s,double as,int sy,String in){
		super(s);
		AnnualSalary=as;
		StartingYear=sy;
		InsuranceNumber=in;
		}
	
	void setAnnualSalary(double AnnualSalary) {
		this.AnnualSalary=AnnualSalary;
	}
	void setStartingYear(int StartingYear) {
		this.StartingYear=StartingYear;
	}
	void setInsuranceNumber(String InsuranceNumber) {
		this.InsuranceNumber=InsuranceNumber;
	}
	double getAnnualSalary() {
		return AnnualSalary;
	}
	int getStartingYear() {
		return StartingYear;
	}
	String getInsuranceNumber() {
		return InsuranceNumber;
	}
	public String toString(){
		return super.toString()+" "+AnnualSalary+" "+StartingYear+" "+InsuranceNumber;
	}

}
