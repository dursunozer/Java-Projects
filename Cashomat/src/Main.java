import java.util.Locale;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			scan.useLocale(Locale.US);
			

			System.out.println("1: Bakiyeyi G�r�nt�le");
			System.out.println("2: Para Yat�rma");
			System.out.println("3: Para �ekme");
			System.out.println("4: Sistemden ��k��");
			
			System.out.print("Yapmak �stedi�iniz ��lemi Se�iniz :");
			int number = scan.nextInt();
			int total_balance = 1000;
			
			switch (number) {
			case 1:
				System.out.print("Toplam Miktar :"+ total_balance +" TL");
				break;
			case 2:
				System.out.print("Yat�rmak �stedi�iniz Miktar� Giriniz :");
				int deposit_money = scan.nextInt();
				total_balance = total_balance + deposit_money;
				System.out.print("Toplam Miktar :"+ total_balance +" TL" );
				break;
			case 3:
				System.out.print("�ekmek �stedi�iniz Miktar� Giriniz :");
				int withdraw_money = scan.nextInt();
				total_balance = total_balance - withdraw_money;
				System.out.print("Kalan Miktar :"+ total_balance +" TL" );
				break;
			case 4:
				System.out.println("Sistemden ��k�ld�");
				break;
			default:
				System.out.println("Ge�ersiz ��lem Yapt�n�z");
				break;
			}

			

		}

	}

