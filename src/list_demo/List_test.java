//index(순서가)붙는 List
//index가 key의 역할을 한다.

//Array List( 검색이 빠르다 )
//3 2 5 5 1 5
//List list
//list.get(2) -> 5   get(방번호)->값
//list.add(3, 10) -> 공간이 생기고 뒤로 밀린다.
//3 2 5 10 5 1 5
//list.remove(5) -> 3 2 5 10 5 5
//반복문 사용가능
//size -> 배열의 길이와 같은 역할


//Linked List( 추가 삭제가 빠르다)

package list_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//List -> ArrayList

public class List_test {
	public static void main(String[] args) {
		
		//저장소 생성
		//List list1 = new ArrayList();
		//ArrayList list2 = new ArrayList();
		
		ArrayList<String> list = new ArrayList<String>();
		
		//추가 : add() - boolean불가
		list.add("유재석");
		list.add("정형돈");
		list.add("하하");
		list.add("정준하");
		list.add("광희");
		list.add(1,"박명수");
		//박명수가 1번에 들어가는 순간
		//정형돈 이하는 한칸씩 밀리게 된다.
		
		
		//데이터 확인 - get(index)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println("이름 : " + name);
		}
		
		System.out.println("============================");
		
		
		//제거
		list.remove(4);
		//list.remove("정준하"); 와 동일하다
		
		for(String name : list){ // 확장 for문 - 
			//list에 있는것을 다 가져와서
			//name에 저장하라
			System.out.println("이름 : " + name);
		}

		System.out.println("============================");
		
		//Collections라는 클래스의 도움을 받아 순서 뒤섞기
		Collections.shuffle(list);//list를 무작위로 섞어라

		for(String name : list){ // 확장 for문 - 
			//list에 있는것을 다 가져와서
			//name에 저장하라
			System.out.println("이름 : " + name);
		}
		System.out.println("============================");
		
		//어떤 원리에 의한 정렬
		Collections.sort(list);
		
		for(String name : list){ // 확장 for문 - 
			//list에 있는것을 다 가져와서
			//name에 저장하라
			System.out.println("이름 : " + name);
		}
	}
}
