package ödev3;

import java.util.Scanner;


public class ödev3Soru1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen oyuncu sayısını giriniz: ");
		int oyuncuSayisi=sc.nextInt(); //oyuncu sayısını kullanıcılardan alır
		
		if(oyuncuSayisi!=0) {
		int liderlikArrayi[]=new int[oyuncuSayisi+1];
		
		
		for(int i=0;i<oyuncuSayisi;i++) {
			int sayac=1; //ilk deneme için sayac 1'den başlatılmıştır. 
			int sansliSayi = (int) (Math.random() * 99 + 1);
			System.out.println("Lütfen tahmininizi giriniz : ");
	        int tahminEdilenSayi= sc.nextInt();
	        
	        
			while(sansliSayi!=tahminEdilenSayi) {
				 if(tahminEdilenSayi> 100 || tahminEdilenSayi < 0) {
	                 System.out.println("Girilen sayı 1-100 arasında olmalıdır! ");
	                 System.out.println("-------------------- ");
	                 tahminEdilenSayi = sc.nextInt(); 
	                 }
	
	         else if (tahminEdilenSayi < sansliSayi) {
	        	 
	                 System.out.println("Daha büyük bir sayı giriniz: ");
	                 System.out.println("---------------------------- ");
	                 tahminEdilenSayi = sc.nextInt(); 
	                 
	                 }
	         else{
	                 System.out.println("Daha küçük bir sayı giriniz: ");
	                 System.out.println("---------------------------- ");
	                 tahminEdilenSayi = sc.nextInt();
	                  }
				 sayac++;
     }
		
		liderlikArrayi[oyuncuSayisi]=sayac;
        System.out.println("Tebrikler " +oyuncuSayisi+ ". kullanıcı doğru tahmin");
        System.out.println(sayac+". denemede doğru sayı olan "+sansliSayi+" buldunuz");
        System.out.println("----------------------- ");       
//      System.out.println(liderlikArrayi[oyuncuSayisi]);
		}
		}
		else {
			System.out.println("Sıfır girdiğiniz için oyun başlatılamadı. ");
		}
}
}
