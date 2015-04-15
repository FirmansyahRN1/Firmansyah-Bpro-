import java.util.Scanner;
public class SoalBelajarPenjumlahan{
  public static void main(String [] args){
    Scanner scan= new Scanner (System.in);
      int nilai;
      int nilai1;
      int nilai2;10
      int jumlah=0;
      
      
System.out.print("Belajar Beberapa Soal (n)=");
int n=scan.nextInt();

  for(int i=0; i<n; i++)
  {
    
   nilai1 =1+ (int)(Math.random()*9);
   nilai2 =1+ (int)(Math.random()*9);
   nilai= nilai1 + nilai2 ; 
   
   
   System.out.print(nilai1+"+"+nilai2+" =");
   int hasil=scan.nextInt();
  if(nilai==hasil)
    jumlah+=20;
   
 
     
   
   }
  System.out.println("Nilai anda ="+jumlah);
  }
  }
}
