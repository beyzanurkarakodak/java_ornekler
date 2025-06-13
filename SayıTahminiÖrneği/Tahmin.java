package SayıTahminiÖrneği;
import java.util.*;
public class Tahmin 
{
	//Bilgisayara kkarşı bir sayı tahmin etme oyunu

	public static void main(String[] args) 
	{
		Scanner girdi=new Scanner(System.in);
		System.out.println("Tahmin yapmak istediğiniz aralığın 0'dan kaça kadar olacağını belirleyin: ");
		final int kaçakadar =girdi.nextInt();
		int cevap, tahmin;
		Random sayıseçici=new Random();
		cevap=sayıseçici.nextInt(kaçakadar)+1;
		System.out.print("Belirlediğiniz aralıkta bir sayı seçtim! Sizce neseçtim?\nTahmininizi yazın: ");
		tahmin=girdi.nextInt();
		if(tahmin==cevap)
			System.out.println("Bildiniz!");
		else
			System.out.println("Maalesef tahmininiz yanlıştı.");
		System.out.println("Tuttuğum sayı "+cevap+" idi!");
	}

}
