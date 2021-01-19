package entities;

public class Employe {
	private String name;
	protected Integer hours;
	protected Double valueperHour;
	
	public Employe() {
		
	}
	
	public Employe(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valueperHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueperHour() {
		return valueperHour;
	}

	public void setValueperHour(Double valueperHour) {
		this.valueperHour = valueperHour;
	}
	
	public Double payment() {
		return valueperHour * hours;
	}
	
	

	@Override
	public String toString() {
		return "Employe [name=" + name + ", hours=" + hours + ", valueperHour=" + valueperHour + "]";
	}
	
	
}
