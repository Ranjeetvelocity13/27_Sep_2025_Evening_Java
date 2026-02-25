package Day_37_25_11_24_OOPS;

public class TestHSBC {

	public static void main(String[] args) {


		HSBCBank HS = new HSBCBank(); //Object of concerete class - CTP - Static binding, ealry bing
		
		HS.HomeLoan();
		HS.BikeLoan();
		HS.carLoan();
		HS.CreditCard();
		HS.DebitCard();
		HS.EducationLoan();
		HS.GoldLoan();
		HS.PersonalLoan();
		HS.TransferMoney();
		
		
		System.out.println();
		RBIBank RB = new HSBCBank();
		
		
		RB.CreditCard();
		RB.DebitCard();
		RB.TransferMoney();
		RB.PersonalLoan();
		System.out.println(RBIBank.minbalance);
		
		
		USBank UB = new HSBCBank();
		UB.BikeLoan();
		UB.PersonalLoan();
		
		BrazilBank Bk = new HSBCBank();
		Bk.carLoan();
		Bk.MutualFunds();
		Bk.Displayed();
		
		//1. All var are public staic final
		//2. All method are public abstract by default
		//3. Interface cannot have construcotor
		//4. Interface support 200 abstraction
		//
		
		BrazilBank.Demo();
		
		
	}

}
