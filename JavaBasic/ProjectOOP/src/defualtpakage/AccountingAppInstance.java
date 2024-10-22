package defualtpakage;

class Accounting{
    public double valueOfSupply;
    // 세율 => 변하지 않는 값 => static(클래스 소속으로)
    public static double vatRate = 0.1;
    
    //    Accounting 메소드 : 생성자가 생성될때 매개변수를 호출해야만 하는 생성자
    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }
    // vatRate는 static(클래스 소속의 변수이므로 다시 호출하지 않아도됨.)
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingAppInstance {
    public static void main(String[] args) {
    	// 인스턴스 호출 new
        Accounting a1 = new Accounting(10000.0);
         
        Accounting a2 = new Accounting(20000.0);
         
        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
         
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());
         
        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
         
  
    }
}
