public class AccountingArrayLoopApp {
	public static void main(String[] args) {

		double ValueOfSupply = Double.parseDouble(args[0]);
		double VATRate = 0.1;
		double VAT = ValueOfSupply*VATRate;
		double Total = ValueOfSupply + VAT;
		double expenseRate = 0.3;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - ValueOfSupply*0.3;

		
		System.out.println("Value of supply :" + ValueOfSupply); // 공급가
		System.out.println("VAT :" + VAT); // 부가가치세
		System.out.println("Total :" + Total); // 소비자가 내야하는 돈
		System.out.println("Expense :"+ expense); // 비용
		System.out.println("income : "+ income); // 
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend :"+ income * dividendRates[i]);
			i = i + 1;
		}
	}

}
