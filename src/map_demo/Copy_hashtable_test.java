package map_demo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;



class LoginProcess {
	private Scanner sc;
	private Hashtable<String, String> table;
	//컬렉션을 지정하지 않으면 Object로 지정된다.

	public LoginProcess() {
		table = new Hashtable<String, String>();
		sc = new Scanner(System.in);

	}

	public void accept() {
		// 멤버필드에 scanner를 쓰면 중복을 피할 수 있다.
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();

		if (table.containsKey(id)) {
			System.out.println("이미 사용중인 아이디");
		} else {
			table.put(id, pw);
			System.out.println("회원가입 성공");
		}
	}

	public void login() {
		// 멤버필드에 scanner를 쓰면 중복을 피할 수 있다.
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();

		if (table.containsKey(id)) {
			String dbPw = table.get(id);

			if (pw.equals(dbPw)) {
				System.out.println("로그인 성공");
			}

			else {
				System.out.println("비밀번호가 맞지 않습니다.");
			}
		} else {
			System.out.println("아이디가 존재하지 않습니다.");
		}

	}

	public void list() {
		Enumeration<String> enu = table.keys();
		while (enu.hasMoreElements()) {
			String id = enu.nextElement();
			String pw = table.get(id);

			System.out.println("id : " + id + "\t\tpw : " + pw);
		}
	}

	public void exit() {
		System.exit(0);
		// 0이니까 정상종료를 의미한다.
	}
}

public class Copy_hashtable_test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LoginProcess pro = new LoginProcess();

		while (true) {
			System.out.println("1.가입 2.로그인 3.목록 4.종료 : ");

			int sel = sc.nextInt();

			switch (sel) {
			case 1:// 가입
				pro.accept();
			case 2:// 로그인
				pro.login();
			case 3:// 목록
				pro.list();
			case 4:// 종료
				pro.exit();
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}

//객체를 집어넣는 컬렉션

//				Set			Map(이름표추가)							List(index순서추가)
//추가		add			put(k,v)											add(data) add(index, data)
//크기		size			size												size()
//검색		contains		containsKey(k) containsValue(v)			contains(data)
//삭제		remove		remove											remove(data) remove(index)
//정렬		iterator		keys		elements							iterator()