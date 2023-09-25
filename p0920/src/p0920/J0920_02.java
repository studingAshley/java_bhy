package p0920;

import java.util.ArrayList;

public class J0920_02 {

	public static void main(String[] args) {

		Student s1  = new Student(1001);
		Student s2  = new Student(1001);
		Student s3  = new Student(1003);
		Student s4  = new Student(1004);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println(list.size());
		System.out.println((list.get(0)).getStuNum());
		
		System.out.println();
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.contains(s1));
		
	}

}
