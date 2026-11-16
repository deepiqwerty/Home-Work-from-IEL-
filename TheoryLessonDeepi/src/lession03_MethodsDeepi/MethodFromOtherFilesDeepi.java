package lession03_MethodsDeepi;

public class MethodFromOtherFilesDeepi {
	
	public static void main(String[] args) {
		
		String email;
		String password;
		
		email = "iloveyou@ggmail.com";
		password = "ifellinLove";
		boolean input = IntroDeepi.isLoginSuccessfull(email,password); 
		System.out.println("Is login successfull " + input );
		
	}

}
