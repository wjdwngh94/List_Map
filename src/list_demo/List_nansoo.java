package list_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * arraylist를 사용하여
 * 중복없는 난수 생성기를 만든다
 * 
 */

class nansoo{
	
}
public class List_nansoo {
	
	public static void main(String[] args) {
		
		int num =0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("생성할 난수의 갯수 : ");
		num = scanner.nextInt();
		
		
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		for (int i = 0; i < num; i++) { 
			System.out.print(list.get(i) + "\t");
		}
		
	}
}
