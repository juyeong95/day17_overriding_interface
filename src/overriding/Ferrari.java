package overriding;

import java.util.ArrayList;


public class Ferrari extends ArrayList<String> {
	private int ye;

	public Ferrari(int ye) {
		this.ye = ye;
	}

	public int getYe() {
		return ye;
	}

	public void speed() {
		System.out.println(ye + "년식 페라리 속도: 300Km");
		add("ttt");
		System.out.println(get(0));
	}
	// Alt + Shift + s

	@Override
	public boolean add(String e) {
		System.out.println("내가만든 add 메소드 입니다.");
		return true;
	}
	
}
