package YazıTuraÖrneği;

public class YazıTura 
{

	public static void main(String[] args) 
	{
		//para sınıfından nesne oluşturuyoruz ki bu nesne ile sınıfın metotlarını kullanabilelim
		Para param=new Para();
		//param sınıfının at adındaki metodunu çağırıyoruz
		//metodun ne yaptığını görmek için para sınıfına git!
		param.at();
		
		//System.out.println(param);
		if(param.yazımı())
		{
			System.out.println("kazandın!");
		}
		else
		{
			System.out.println("kaybettin!");
		}

	}

}
