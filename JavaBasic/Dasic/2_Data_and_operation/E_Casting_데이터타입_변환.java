
public class E_Casting_데이터타입_변환 {

	public static void main(String[] args) {
		
		int a = (int) 1.1;
		double b = 1.1;
		System.out.println(a);
		System.out.println(b);
		
		// 1(int) -> String
		String f = Integer.toString(1);
		System.out.println(f);
		// 데이터 타입 확인
		System.out.println(f.getClass());
		
	}

}
