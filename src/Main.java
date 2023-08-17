import java.util.Scanner;

public class Main {
	static boolean prime(int number,int bolen) {

		if (number < 2) {
			return false;		
		}
		else if (number==2) {
			return true;
		}
		else if (number%bolen==0) {
			return false;
		}
		else if (number/2<bolen) {
			return true;
		}
		
		return prime(number, bolen+1) ;
		
	}

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
    	System.out.println("Sayi Giriniz: ");
    	int number = inp.nextInt();
    	
    	if (prime(number, 2)) {
			System.out.println(number+" Sayisi Asaldir");
		}
    	else {
			System.out.println(number+" Sayisi Asal Degildir");
		}


	}

}
