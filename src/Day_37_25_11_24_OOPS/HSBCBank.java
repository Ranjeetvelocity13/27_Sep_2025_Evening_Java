package Day_37_25_11_24_OOPS;

public class HSBCBank implements RBIBank,USBank,BrazilBank{

	
	
	public void HomeLoan() {
		System.out.println("HSBC Bank - Home Loan");
	}

	public void EducationLoan() {
		System.out.println("HSBC Bank - Education Loan");
	}
	
	public void GoldLoan() {
		System.out.println("HSBS Bank gold Laon");
	}
	
	@Override
	public void DebitCard() {
	
		
		System.out.println("HSBC Bank Debit card");
	}

	@Override
	public void CreditCard() {

		System.out.println("HSBC Bank Credit card");
	}

	@Override
	public void TransferMoney() {
		System.out.println("HSBC Bank TransferMoney");
		
	}

	@Override
	public void PersonalLoan() {

		System.out.println("HSBC Bank PerosnLoan");

	}

	@Override
	public void BikeLoan() {
	
		System.out.println("HSBC Bank bike lona");
		
	}

	@Override
	public void carLoan() {
		System.out.println("HSBC Bank car Loan");
		
	}

	@Override
	public void MutualFunds() {
	
		System.out.println("HSBC Bank Mutula Funds");
		
	}

	@Override
	public void Displayed() {
		
		RBIBank.super.Displayed();
	}
	
}
