import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("**********************************\n"+
						 "Sisteme Hoþgeldiniz\n"+
						 "**********************************\n"+
						 "Kullanýcý Bilgilerinizi Giriniz\n");
		
        String sys_user = "dursunozer";
        String sys_password = "12345";
        int try_again = 3;
        
        while(true) {
        	System.out.print("Kullanýcý adýnýzý giriniz :");
            String user =scan.nextLine();
            System.out.print("Parolanýzý giriniz :");
            String password =scan.nextLine();
            
            if(user.equals(sys_user) && password.equals(sys_password)){
            	 System.out.println("Sisteme Hoþgeldin...");
                 break;
            }
            else if(user.equals(sys_user) && !password.equals(sys_password)) {
            	if(try_again == 0) {
            		System.out.println("");
            	}
            	else {
            		System.out.println("Parolanýzý yanlýþ girdiniz lütfen tekrar deneyiniz...");
                    try_again-=1;
                    System.out.println("giriþ hakkýnýz : "+ try_again);
            	}
            }
            else if(!user.equals(sys_user) && password.equals(sys_password)) {
            	if(try_again == 0) {
            		System.out.println("");
            	}
            	else {
            		System.out.println("Kullanýcý adýnýzý yanlýþ girdiniz lütfen tekrar deneyiniz...");
            		try_again-=1;
            		System.out.println("giriþ hakkýnýz : "+ try_again);	
            	}
            }
            else {
            	if(try_again == 0) {
            		 System.out.println("");
            	}
            	else {
            		System.out.println("kullanýcý adýnýzý ve parolanýzý yanlýþ girdiniz lütfen tekrar deneyiniz...");
                    try_again-=1;
                    System.out.println("giriþ hakkýnýz : "+ try_again);
            	}
            }
            if(try_again == 0){
                System.out.println("Giriþ hakkýnýzý tamamladýnýz");
                break;
        }
        
        

	}

	}
}
