import java.util.Locale;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			scan.useLocale(Locale.US);
			

			System.out.println("1: Bakiyeyi Görüntüle");
			System.out.println("2: Para Yatýrma");
			System.out.println("3: Para Çekme");
			System.out.println("4: Sistemden Çýkýþ");
			
			System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçiniz :");
			int number = scan.nextInt();
			int total_balance = 1000;
			
			switch (number) {
			case 1:
				System.out.print("Toplam Miktar :"+ total_balance +" TL");
				break;
			case 2:
				System.out.print("Yatýrmak Ýstediðiniz Miktarý Giriniz :");
				int deposit_money = scan.nextInt();
				total_balance = total_balance + deposit_money;
				System.out.print("Toplam Miktar :"+ total_balance +" TL" );
				break;
			case 3:
				System.out.print("Çekmek Ýstediðiniz Miktarý Giriniz :");
				int withdraw_money = scan.nextInt();
				total_balance = total_balance - withdraw_money;
				System.out.print("Kalan Miktar :"+ total_balance +" TL" );
				break;
			case 4:
				System.out.println("Sistemden Çýkýldý");
				break;
			default:
				System.out.println("Geçersiz Ýþlem Yaptýnýz");
				break;
			}

			

		}

	}

