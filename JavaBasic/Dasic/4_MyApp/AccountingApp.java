
public class AccountingApp {
	//args라는 값으로 입력값이 String(문자열)로 받아오게 초기 설정되어있음.
	public static void main(String[] args) {
		// 변수 도입
		// 변수 한번에 바꾸기 => refactor -> extend local variable (단축키 : SHIFT + ALT + L)
		double ValueOfSupply = Double.parseDouble(args[0]); //args은 문자열이기때문에 Double현태로 바꿔줘야됨.
		double VATRate = 0.1;
		double VAT = ValueOfSupply*VATRate;
		double Total = ValueOfSupply + VAT;
		double expenseRate = 0.3;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - ValueOfSupply*0.3;
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply :" + ValueOfSupply); // 공급가
		System.out.println("VAT :" + VAT); // 부가가치세
		System.out.println("Total :" + Total); // 소비자가 내야하는 돈
		System.out.println("Expense :"+ expense); // 비용
		System.out.println("income : "+ income); // 
		System.out.println("Dividend : "+ dividend1); // 동업자들끼리 배당
		System.out.println("Dividend : "+ dividend2); // 동업자들끼리 배당
		System.out.println("Dividend : "+ dividend3); // 동업자들끼리 배당
		// Edit -> Find/ Replace로 한번에 교체가능
	}

}
