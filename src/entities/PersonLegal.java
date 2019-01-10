package entities;

public class PersonLegal extends TaxPayer {
	
	private int numberEmployees;
		
	public PersonLegal() {
		super();
	}	
	
	public PersonLegal(String name, Double annualIncome, int numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}
	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double TaxesPay() {
		double tax= 0.0;
		
		if (numberEmployees >10) tax = 0.14;
		else tax = 0.16;
		
		return annualIncome * tax;
	}

}
