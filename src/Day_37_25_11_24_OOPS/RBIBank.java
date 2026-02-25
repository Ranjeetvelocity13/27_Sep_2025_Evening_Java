package Day_37_25_11_24_OOPS;

public interface RBIBank {

	int minbalance = 2000;  //static and final
	
	void DebitCard();
	void CreditCard();
	void TransferMoney();  //Abstract + Public
	void PersonalLoan();
	
	default void Displayed() {
		System.out.println("Default method inside interface");
	}
	
}
