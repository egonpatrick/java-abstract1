package entities;

public class PersonLegal extends TaxPayer {
	
	private Double numberEmployees;
		
	public PersonLegal() {
		super();
	}	
	
	public PersonLegal(String name, Double annualIncome, Double numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}
	public Double getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Double numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double TaxesPay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
