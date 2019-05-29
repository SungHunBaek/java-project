package day53_inheritance06;
import java.lang.*;
public class City extends Object{
	int id;
	String name;
	public int count = 100;
	
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void buildARoad() {
		System.out.println("City - building a road");
	}
	@Override
	public int hashCode() {
		return id + name.length();
	}
	@Override
	public boolean equals(Object obj) {
		City anotherCity = (City)obj;
		if(this.id == anotherCity.id && this.name.equals(anotherCity.name)) {
			return true;
		}
		return false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "id: " + id + " name: " + name + "count: " + count;
	}
 }
