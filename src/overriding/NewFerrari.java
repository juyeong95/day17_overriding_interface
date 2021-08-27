package overriding;

public class NewFerrari extends Ferrari{
	public NewFerrari(int ye) { super(ye); }
	public void autoSystem() {
		System.out.println("자동 운전모드를 실행합니다.");
	}
	public void speed() {
		System.out.println(getYe()+"년식 페라리 속도 : 500Km");
		System.out.println("터보 speed 달리자~");
	}
}
