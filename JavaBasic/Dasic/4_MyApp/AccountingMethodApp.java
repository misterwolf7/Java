
public class AccountingMethodApp {
	// 이 중과호 안에서 선언되는 변수들은 전역변수(Global variables)이다
	public static double valueOfSupply;
	public static double vatRate;
	public static double vat;
	public static double expenseRate;

	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		vat = getVAT();
		
		double Total = getTotal();
		double expense = getExpense();
		double income = getIncome(expense);
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply :" + valueOfSupply); // 공급가
		System.out.println("VAT :" + vat); // 부가가치세
		System.out.println("Total :" + Total); // 소비자가 내야하는 돈
		System.out.println("Expense :"+ expense); // 비용
		System.out.println("income : "+ income); // 
		System.out.println("Dividend : "+ dividend1); // 동업자들끼리 배당
		System.out.println("Dividend : "+ dividend2); // 동업자들끼리 배당
		System.out.println("Dividend : "+ dividend3); // 동업자들끼리 배당
		// Edit -> Find/ Replace로 한번에 교체가능
	}

	public static double getIncome(double expense) {
		return valueOfSupply - expense;
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	// 메소드를 만드는 코드
	private static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
