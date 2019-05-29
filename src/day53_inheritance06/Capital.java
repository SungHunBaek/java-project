package day53_inheritance06;

public class Capital extends City{
	private long population;
	public int count = 1;
	
	public Capital(int id, String name, long population) {
		super(id,name);
		this.population = population;
	}
	
	public void displayCount() {
		System.out.println("city count: " + super.count);
		System.out.println("capital count: " + count);
	}
	public void setPopulation (long population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return super.toString() + " population: " + population + "cap count:" +count;
	}
}
