package Service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {
	
	String greet(int i);
	
	ArrayList<Member> getAll();
	
//	メソッドの宣言
	int sumOf(int x, int y);

}
