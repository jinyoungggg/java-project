package vo;

public class Powder extends Material {
	public void doPrint() {
		System.out.println("Powder 재료로 출력");
	}

	@Override
	public String toString() {
		return "재료는 Powder입니다";
	}
	
}
