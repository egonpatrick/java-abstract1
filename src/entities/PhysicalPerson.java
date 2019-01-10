package entities;

public class PhysicalPerson extends TaxPayer{

	private Double healthSpeding;
	
	public PhysicalPerson() {
	 super();
	}	
		
	public PhysicalPerson(String name, Double annualIncome, Double healthSpeding) {
		super(name, annualIncome);
		this.healthSpeding = healthSpeding;
	}

	public Double getHealthSpeding() {
		return healthSpeding;
	}

	public void setHealthSpeding(Double healthSpeding) {
		this.healthSpeding = healthSpeding;
	}
	
	@Override
	public double TaxesPay() {
		
		double fee= 0;
		double tax = 0;
		if (annualIncome < 20000.00) tax = 0.15;
		else tax = 0.25;
		if (healthSpeding > 0)	fee = healthSpeding * .50;		
		
		return annualIncome*tax - fee;
	}	
}
