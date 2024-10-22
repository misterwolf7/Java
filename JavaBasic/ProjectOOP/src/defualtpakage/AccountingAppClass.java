package defualtpakage;

public class AccountingAppClass {
    public static void main(String[] args) {
    	// class 호출
    	// valueOfSupply,getVAT(),getTotal()는 static 으로 정의함 
    	// => Accounting 이라는 클래스의 변수와 메소드
    	
    	// Accounting.valueOfSupply : valueOfSupply라는 변수는 
    	//	  						  Accounting 이라는 클래스에서 왔다고 알려주는 것.
    	
    	// 인스턴스화 => 클래스의 상태가 계속 바뀌어야될때 사용
    	// ex) valueOfSupply가 10000원, 20000원, 30000원 따로 구해야할 떄
    	// PrintAccounting class 를 Counting 에 인스턴스화
    	PrintAccountingClass Counting = new PrintAccountingClass(20000.0);
    	
        System.out.println("Value of supply : " + Counting.valueOfSupply);
        System.out.println("vatRate :"+ Counting.vatRate);
        System.out.println("VAT : " + Counting.getVAT());
        System.out.println("Total : " + Counting.getTotal());
 
    }

}