package enküçüksayı;
import java.util.Scanner;
public class enküçüksayı
{

	public static void main(String[] args)
	{
		System.out.println("Aralarından en küçüğü bulmak istediğiniz kaç adet sayı var?: ");
		Scanner girdi=new Scanner(System.in);
		int elemansayisi=girdi.nextInt();
		System.out.println("Her elemandan sonra enter tuşuna basmak şartıyla elemanları giriniz:");
		int[] elemanlar=new int[elemansayisi];
		for(int i=0;i<elemansayisi;i++)
		{
			elemanlar[i]=girdi.nextInt();
		}
		int mindeğer=elemanlar[0];
		for(int j=0;j<elemansayisi;j++)
		{
			for(int k=j;k<elemansayisi;k++)
			{
				if(mindeğer>=elemanlar[k])
					mindeğer=elemanlar[k];
				else
					continue;
			}
		}
		System.out.println("Girdiğiniz veri dizisindeki en küçük değer: "+mindeğer);
	}

}
