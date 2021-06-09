package Service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

//	明示的にアノテーションでオーバーライドを記載している
	@Override
	public String greet(int i) {
		String[]  greetings = {"Good Mornig", "Hello", "Good evening"};
		return greetings[i];
	}

//	全てを返すメソッド
	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		
//		インスタンスの作成
		Member mem1 = new Member(1, "Linda", "linda@example.com");
		Member mem2 = new Member(2, "Linda", "Jinda@example.com");
		
//		Listへインスタンスを格納
		list.add(mem1);
		list.add(mem2);
		
		return list;
	}

}
