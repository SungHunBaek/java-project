package day45_encapsulation_practice;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programming");
		//System.out.println(course1.getName());
	
		List<String> teachers = new ArrayList<>();
		teachers.add("Vasyl");
		teachers.add("Murodil");
		teachers.add("Marufjon");
		teachers.add("Muhtar");
	
		course1.setTeachers(teachers);
		System.out.println(course1.toString());
		System.out.println(teachers);
	
		List<String> students = new ArrayList<>();
		students.add("Sung");
		students.add("Roman");
		students.add("Ruslan");
		students.add("Boyan");
		
		course1.setStudents(students);
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Ekatarina");
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Mari0a is there");
		}
		if(course1.getStudents().contains("Ekatarina")) {
			System.out.println("Ekatarina is there");
		}
		
		course1.removeStudent("Roman");
		course1.removeTeacher("Maria");
		
		if(course1.getStudents().contains("Roman")) {
			System.out.println("Roman is there");
		}else {
			System.out.println("Roman is out");
		}
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is there");
		}else {
			System.out.println("Maria is out.");
		}
		
		
	}
}
