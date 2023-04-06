import java.util.Scanner;

public class KDVHesabı {

	public static void main(String[] args) {

		double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
		Scanner input = new Scanner(System.in);
		System.out.println("Ücret Tutarını Giriniz :");
		tutar = input.nextDouble();

		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;

		if (tutar <= 1000) {
			System.out.println(kdvOran = 0.18);
		} else if (tutar > 1000) {
			System.out.println(kdvOran = 0.8);
		}

		System.out.println("KDV'siz Tutar :" + tutar);
		System.out.println("KDV Oranı :" + kdvOran);
		System.out.println("KDV Tutarı:" + kdvTutar);
		System.out.println("KDV'li Tutar :" + kdvliTutar);
		System.out.println(kdvliTutar);

	}

}
