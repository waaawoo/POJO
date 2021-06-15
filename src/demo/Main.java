package demo;

import java.util.ArrayList;

import Service.MemberService;
import Service.MemberServiceImpl;
import entity.Member;

public class Main {

	public static void main(String[] args) {
		
//		シングルトンパターンの場合newできない
//		MemberServiceImpl service = new MemberServiceImpl();
//		メソッドで情報を取り出す
		MemberService service = MemberServiceImpl.getInstance();
		
//		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
//		for(Member mem : list) {
//			System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
//		}
		int a = service.sumOf(3, 5);
		System.out.println(a);
		
	}

}
