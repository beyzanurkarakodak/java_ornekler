package YazıTuraÖrneği;
public class Para 
{
		// yazı sabit değişkenini oluşturup bunu istediğimiz için 1 değerini atadık
		private final int yazı=1;
		//tura sabit değişkenini oluşturup bunu istemediğiimiz için 0 değerini atadık
		private final int tura=0;
		// attıktan sonra gelen yüzün değerini tutacak değişkeni tanımladık
		private int negeldi;
		
		
		//para adında bir metot tanımladık
		public Para()
		{
			//at metotunu çağırdık.
			//her para metotu çağırıldığında bu metot at metotuu çağıracak
			at();
		}
		
		
		//at metotunu tanımladık, bu bize yazı mı tura mı geldiğini öyleyecek
		public void at()
		{
			// 0 ile 2 arasında random bir sayı seçtirip sonucu ne geldi değişkenine atadık
			negeldi=(int)(Math.random()*2);
		}
		
		
		//yazı gelirse ekrana kazandın yazdıracağımız ve başka seçenekler için kaybettin
		//yazdıracağımız için kontrol etmek istediğimiz şey olan yazı mı adında bir boolean
		//metot oluşturduk. bu metot yazı ise true değilse false döndürecek
		public boolean yazımı()
		{
			//ne geldi yazı değerine eşitse true değilse false döndürecek
			return(negeldi==yazı);
		}
		
		
		//şimdi random seçimin sonucunu string olarak döndürecek bir metot tanımlayalım
		public String toString()
		{
			//sonucun string halini tutacak değişkenimizi tanımlayalım
			String yüzadı;
			//eğer sonuç 1 ise yani yazı ise;
			if(negeldi==yazı) 
				//bunu tutacak string değişkenimize yazı değerini tanımlayalım
				yüzadı="yazı tarafı geldi";
			
			else
				//değilse yani 0 ise tura değerini tanımladık
				yüzadı="tura tarafı geldi";
			//yazı mı tura mı olduğunu string olarak return edelim
			return yüzadı;
		}
	
}
