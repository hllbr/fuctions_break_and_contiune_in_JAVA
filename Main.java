
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        Break ; anahtar kelimesi 
        Döngü herhangi bir  yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
        Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
        ***
        break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır.Eğer iç içe döngüler varsa
        ve en içteki döngüde break kullanılmışsa sadece eniçteki dongü sona erer.
        ***********************************************************************************************************
        Continue anahtar Kelimesi 
        Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zamangeri kalan işlemleri yapmadan direkt döngü bloğunun başına döner...
        
        
        */
        /*
        int i = 0 ;
        while(i<85){
            if(i ==10){
               break;
            }
            System.out.println("i = "+i);
            i++;
            
        }
        System.out.println("**************************************************************");
        int b = 0;
        while(b<=85){
            if(b ==58){
                continue;
            }
            System.out.println("b = "+b);
            b++;
            
        }
*/
        /*
        System.out.println("**************************************************************");
        Scanner scn = new Scanner(System.in);
        while(true){
            
            //döngünün herhangi bir noktasında break kullanırsak döngümüz sonlanacak 
            //kullanıcıdan bir adet değer alalım
            System.out.println("bir adet say girişi yapınız : ");
            int islem = scn.nextInt();
            if(islem ==-1){
                //eğer kullanıcı -1 girmişse döngüyü sonlandırmak istiyoruz
                System.out.println("-1 adlı işlemi çağırdınız bu sebepten ötürü =___");
                System.out.println("Döngüden çıkılıyor....");
                break;
            }
            System.out.println("seçtiğin işlem = " +islem);
            
        }
*/
        for(int i= 0; i<10;i++){
        if(i ==1 || i ==3){
            continue;
        }
                System.out.println("i = "+i);

    }
        System.out.println("******************************************************");
        int c = 0;
        while(c<=20){
            if(c ==5 || c ==8){
                c++;
                continue;
            }
            System.out.println("c = "+c);
            
            c++;
            
        }
        /*
             int c = 0;
        while(c<20){
            if(c ==5 || c ==8){
                continue;// bbu şekilde bırakırsak döngü sıkışır ve tamamalanamaz
            }
            System.out.println("c = "+c);
            c++;
            
        }
        */

    }
    
}
