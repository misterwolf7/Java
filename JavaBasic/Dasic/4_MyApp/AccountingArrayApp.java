
public class AccountingArrayApp {
	// String[] args 도 배열의 한종류이다
	public static void main(String[] args) {
		// args[0] : args는 String[] args로 만든 배열이기때문에 0번째 인덱스를 출력
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VATRate = 0.1;
		double VAT = ValueOfSupply*VATRate;
		double Total = ValueOfSupply + VAT;
		double expenseRate = 0.3;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - ValueOfSupply*0.3;
		
		// Array(배열) 만들기
		// double[] : double형 데이터로 이루어져있는 매열을 의미
		// dividendRates : 그 배열의 변수
		// new double[3]; : 배열의 크기 설정 (데이터 3개를 가질수있음)
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income*dividendRates[0];
		double dividend2 = income*dividendRates[1];
		double dividend3 = income*dividendRates[2];
		
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
