import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("**********************************\n"+
						 "Sisteme Ho�geldiniz\n"+
						 "**********************************\n"+
						 "Kullan�c� Bilgilerinizi Giriniz\n");
		
        String sys_user = "dursunozer";
        String sys_password = "12345";
        int try_again = 3;
        
        while(true) {
        	System.out.print("Kullan�c� ad�n�z� giriniz :");
            String user =scan.nextLine();
            System.out.print("Parolan�z� giriniz :");
            String password =scan.nextLine();
            
            if(user.equals(sys_user) && password.equals(sys_password)){
            	 System.out.println("Sisteme Ho�geldin...");
                 break;
            }
            else if(user.equals(sys_user) && !password.equals(sys_password)) {
            	if(try_again == 0) {
            		System.out.println("");
            	}
            	else {
            		System.out.println("Parolan�z� yanl�� girdiniz l�tfen tekrar deneyiniz...");
                    try_again-=1;
                    System.out.println("giri� hakk�n�z : "+ try_again);
            	}
            }
            else if(!user.equals(sys_user) && password.equals(sys_password)) {
            	if(try_again == 0) {
            		System.out.println("");
            	}
            	else {
            		System.out.println("Kullan�c� ad�n�z� yanl�� girdiniz l�tfen tekrar deneyiniz...");
            		try_again-=1;
            		System.out.println("giri� hakk�n�z : "+ try_again);	
            	}
            }
            else {
            	if(try_again == 0) {
            		 System.out.println("");
            	}
            	else {
            		System.out.println("kullan�c� ad�n�z� ve parolan�z� yanl�� girdiniz l�tfen tekrar deneyiniz...");
                    try_again-=1;
                    System.out.println("giri� hakk�n�z : "+ try_again);
            	}
            }
            if(try_again == 0){
                System.out.println("Giri� hakk�n�z� tamamlad�n�z");
                break;
        }
        
        

	}

	}
}
