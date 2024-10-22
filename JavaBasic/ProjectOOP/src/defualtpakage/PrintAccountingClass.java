package defualtpakage;

// Accounting 이라는 클래스 생성.
// 생성자 생성 => 클래스의 이름과 똑같은 메소드를 정의하면 됨.
//            (static, return datatype 지정하지 않음)
class PrintAccountingClass{
	// 공급가액 : 물건의 실제 가격
	// valueOfSupply계속 변하는 값.
	public double valueOfSupply = 0.0;
	
	// Double 형태의 생성자를 받는다.
	// PrintConstructor 라는 메소드의 매개변수 : _valueOfSupply 를 생성
	public PrintAccountingClass(double _valueOfSupply) {
		// PrintAccounting의 인스턴스 변수인 valueOfSupply 에게 
		//_valueOfSupply 라는 생성자의 메개변수를 할당.
		this.valueOfSupply = _valueOfSupply;
	}
	
	// 부가가치세율 변하지 않는값 => static
	public static double vatRate = 0.1;
	
	// 메소드 정의 
	// getVAT() => 받아오는 valueOfSupply에따라 변하는 값 => static X
	public double getVAT() {
		return this.valueOfSupply * vatRate;
	}
	// getTotal() => 받아오는 valueOfSupply에따라 변하는 값 => static X
	public double getTotal() {
		return this.valueOfSupply + getVAT();
		}
}