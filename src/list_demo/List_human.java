package list_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Human {
	private String name;
	private int age;

	public Human(String name, int age) {
		
		this.age=age;
		this.name=name;
	}

	public void info(){
		System.out.println("내이름은 : " + name+ " 나이는 : " + age);
	}
	public void getInfo_age(){
		
	}
}

public class List_human {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<Human>();
		
		Human[] human = new Human[5];
		
		String name ="";
		int age=0;
		for(int i=0; i<5; i++)
		{
			System.out.println("이름을 입력하시오");
			name=scanner.nextLine();
			System.out.println("나이를 입력하시오,");
			age = Integer.parseInt(scanner.nextLine());
			
			Human hu = new Human(name, age);
			
			list.add(hu);	
		}
		for(Human per : list){
			per.info();
		}
	}
}
