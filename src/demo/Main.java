package demo;

import java.util.ArrayList;

import Service.MemberServiceImpl;
import entity.Member;

public class Main {

	public static void main(String[] args) {
		MemberServiceImpl service = new MemberServiceImpl();
		System.out.println(service.getAll());
		ArrayList<Member> list = service.getAll();
		for(Member mem : list) {
			System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
		}
	}

}
