package loginSystem;

public class Main {

	public static void main(String[] args) {
		
		IDandPasswords idandPasswords = new IDandPasswords();
		
		

		loginPage Loginpage = new loginPage(idandPasswords.getLoginInfo());
		
	}

}