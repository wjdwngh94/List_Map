package map_demo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class hashtable_test {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		
		while(true){
			System.out.println("1.가입 2.로그인 3.목록 4.종료 : ");
			
			int sel = sc.nextInt();

			String id="", ps="";
			boolean c;
			
			switch(sel){
				case 1://가입
					System.out.println("아이디 : ");
					id=sc.next();
					System.out.println("비밀번호 : ");
					ps=sc.next();
					
					
					c = hashtable.containsKey(id);
					if(c==true){
						System.out.println("이미 사용중인 아이디 입니다.");
					}
					else{
						hashtable.put(id,ps);
					}
					break;
				case 2://로그인
					
					System.out.println("아이디 : ");
					id = sc.next();
					
					c=hashtable.containsKey(id);
					if(c==true){
						String ps2="";
						ps2 = hashtable.get(id);
						System.out.println("비밀번호 : ");
						ps = sc.next();
						if(ps2!=ps){
							System.out.println("비밀번호가 일치하지 않습니다.");
						}
					}else{
						System.out.println("아이디가 존재하지 않습니다.");
					}

					break;
					
				case 3://목록
					
					Enumeration<String> enu_key = hashtable.keys();
					
					while (enu_key.hasMoreElements()) { // HashSet에서는 it.hasNext();
						String key = enu_key.nextElement();
						String value = hashtable.get(key);
						
						System.out.println("아이디\t\t비밀번호");
						System.out.println(key + "\t\t\t" + value);
					}

					break;
					
				case 4://종료
					System.exit(0);
					
				default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
