package Service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {
	
//	シングルトンパターン用に記述
	private static MemberServiceImpl singleton = new MemberServiceImpl();
//	外からnewができないようにする
	private MemberServiceImpl() {};
//　外から情報を取得するようの記述
	public static MemberServiceImpl getInstance() {
		return singleton;
	}
	
	
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
	@Override
	public int sumOf(int x, int y) {
		
		int ans = 0; //答えを格納
		for(int i = x; i <= y; i++) {
			ans += i;
		}
		return ans;
	}

}
