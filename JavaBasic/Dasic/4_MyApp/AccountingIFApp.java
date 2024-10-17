public class AccountingIFApp {
	public static void main(String[] args) {

		double ValueOfSupply = Double.parseDouble(args[0]); 
		double VATRate = 0.1;
		double VAT = ValueOfSupply*VATRate;
		double Total = ValueOfSupply + VAT;
		double expenseRate = 0.3;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;
		
		// IF(조건문) 사용하기
		double dividend1;
		double dividend2;
		double dividend3;
		if (income > 10000.0) {
			dividend1 = income*0.5;
			dividend2 = income*0.3;
			dividend3 = income*0.2;
		}
		else {
			dividend1 = income*1.0;
			dividend2 = income*0;
			dividend3 = income*0;
		}
		
		System.out.println("Value of supply :" + ValueOfSupply); // 공급가
		System.out.println("VAT :" + VAT); // 부가가치세
		System.out.println("Total :" + Total); // 소비자가 내야하는 돈
		System.out.println("Expense :"+ expense); // 비용
		System.out.println("income : "+ income); // 
		System.out.println("Dividend1 : "+ dividend1); // 동업자들끼리 배당
		System.out.println("Dividend2 : "+ dividend2); // 동업자들끼리 배당
		System.out.println("Dividend3 : "+ dividend3); // 동업자들끼리 배당
		// Edit -> Find/ Replace로 한번에 교체가능
	}

}
