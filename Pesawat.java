import java.util.Scanner;
import java.io.*;
public class Pesawat{
  public static void main(String []args){
    String keputusan="Y";
    int lambang=0;
    int duduk=1;
    int hargaVIP=1000000;
    int hargabisnis=600000;
    int total1=0;
    int totaleco=0;
    int totalbisnis=0;
    int jumlahbisnis=0;
    int jumlaheco=0;
    int jumlah1=0;
    int totalsemua=0;
   while (keputusan.equals("Y")||keputusan.equals("y"))
        {
    System.out.println("Penjualan Tiket Pesawat");  
    System.out.println("1. Penjualan tiket"); 
    System.out.println("2. Daftar kursi kosong"); 
    System.out.println("3. Daftar kursi isi");
    System.out.println("4. Daftar semua kursi");
    System.out.println("5. Total omset");
    System.out.println("6. Exit");
   Scanner scan = new Scanner (System.in);
   BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    int[][]kursi={{1,1,2,1,2,2},
      {1,2,1,2,1,2},
      {1,1,2,2,1,2},
      {2,1,2,1,2,2},
      {1,2,1,2,1,1},
      {1,2,1,1,1,1},
      {2,1,1,1,2,1},
      {1,2,1,2,2,1},
      {2,1,2,2,1,2},
      {1,2,1,2,2,2},
      {1,1,2,1,2,1},
      {1,1,2,2,1,2},
      {1,1,1,1,2,1}};
    
    System.out.print("Masukkan Pilihan Anda   =");
    int masukkan=scan.nextInt();
    
    switch (masukkan){
      case 1:
       System.out.println("1. Kolom kursi kanan 3 Kolom kiri 3");
       System.out.println("2. Terdapat 13 baris");
       System.out.println("3. Untuk VIP baris 1-2           75% > eco");
       System.out.println("4. Untuk bisnis baris 3-7       50% > eco");
       System.out.println("5. Untuk Eco baris 8-13        100.000");
   System.out.print("Kembali (Y)");
   break;
      case 2:
        System.out.println("          A    B    C    D    E    F  ");
        for (int i=0; i<13; i++){
        System.out.print("Baris  "+duduk+"  ");
        duduk++;
    for (int j=0; j<6; j++){
      
      if(kursi[i][j]==1){
        System.out.print("*    ");
      }
      else{
        if(kursi[i][j]==2){
          System.out.print("     ");
        }
      }
     
            
            
    }System.out.println();
   
    
      }
        System.out.println();
         System.out.print(" Keterangan   =");
        System.out.println("      *      = Kosong");
        System.out.print("Kembali (Y)");
        duduk=1;
        break;
        
      case 3:
        System.out.println("          A    B    C    D    E    F  ");
       for (int i=0; i<13; i++){
        System.out.print("Baris  "+duduk+"  ");
        duduk++;
    for (int j=0; j<6; j++){
 
      if(kursi[i][j]==1){
        System.out.print("     ");
      }
      else{
        if(kursi[i][j]==2){
          System.out.print("X    ");
        }
      }
     
        
    }System.out.println();
   
    
      }
        System.out.println();
         System.out.print(" Keterangan   =");
        System.out.println("      X      = Isi");
        System.out.print("Kembali (Y)");
        duduk=1;
        break;
        
        case 4:
        System.out.println("          A    B    C    D    E    F  ");
       for (int i=0; i<13; i++){
        System.out.print("Baris  "+duduk+"  ");
        duduk++;
    for (int j=0; j<6; j++){
 
      if(kursi[i][j]==1){
        System.out.print("*    ");
      }
      else{
        if(kursi[i][j]==2){
          System.out.print("X    ");
        }
      }
     
        
    }System.out.println();
   
    
      }
        System.out.println();
         System.out.print(" Keterangan   =");
         System.out.println("      *      = Kosong");
        System.out.println("      X      = Isi");
        System.out.print("Kembali (Y)");
        duduk=1;
        break;
        
      case 5:
        duduk=1;
        for (int i=0; i<13; i++){
        duduk++;
    for (int j=0; j<6; j++){
      if((duduk==2) || (duduk==3)){
      if(kursi[i][j]==1){
       total1+=kursi[i][j];
       jumlah1=(hargaVIP+600000)*total1;
      }
      }
      if((duduk==4) || (duduk==5) ||(duduk==6) || (duduk==7) ||(duduk==8)){
      if(kursi[i][j]==1){
       totalbisnis+=kursi[i][j];
       jumlahbisnis=(hargabisnis+600000)*totalbisnis;
      }
      }
       if((duduk==9) || (duduk==10) ||(duduk==11) || (duduk==12) ||(duduk==13) || (duduk==14)){
      if(kursi[i][j]==1){
       totaleco+=kursi[i][j];
       jumlaheco=600000*totaleco;
      }
      }     
     }
      }
       totalsemua=jumlah1+jumlahbisnis+jumlaheco;
        System.out.println("Total Penjualan Tiket VIP   = "+jumlah1);
        System.out.println("Total Penjualan Tiket Bisnis   = "+jumlahbisnis);                
        System.out.println("Total Penjualan Tiket Economis   = "+jumlaheco); 
        System.out.println("Total Penjualan Semua Tiket   = "+totalsemua);
    System.out.print("Kembali (Y)");
      break;
      case 6:
        System.exit(0);
        break;
    }
      try{
                keputusan = input.readLine();
            }catch(IOException e){
                 System.out.println("Error");
            }
          
    }
  }
}
  
        
    
