import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WarungSederhana{
  public static void main(String [] args) throws IOException {
  Scanner scan=new Scanner (System.in);
   BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int i = 0;
        int por1=0;
        int por=0;
        int hargatotal[]=new int[10];
        int penampung = 0;
        String menu[] = new String [100];
        int harga[] = new int [100];
        String keputusan="Y";

  String porsi="por";
   while (keputusan.equals("Y")||keputusan.equals("y"))
        {
  System.out.println("==================================");
  System.out.println("          SELAMAT DATANG          ");   
  System.out.println("==================================");
  System.out.println("Menu Makanan Dan Minuman");
  System.out.println("1. Bakso");
  System.out.println("2. Mie ayam");
  System.out.println("3. Nasi Rawon Gajah");
  System.out.println("4. Es Jeruk");
  System.out.println("5. Es Teh");
  
  
        System.out.print("Pilihan menu anda  = ");
        int pil = scan.nextInt();
   
              if (pil>5){
                System.out.println("Maaf pilihan menu anda tidak tersedia ");
            menu[i]= "Tidak Tersedia";
              
           }else if (pil==1){
            menu[i] = "Bakso";
            harga[i] = 8000;
            System.out.println("Jumlah Porsi= ");
              por = Integer.parseInt (input.readLine());
            por1=por*harga[i];
            hargatotal[1]=por*harga[i];
        } else if (pil==2) {
            menu[i]= "Mie ayam ";
            harga[i] = 7000;
            System.out.println("Jumlah Porsi= ");
              por = Integer.parseInt (input.readLine());
            por1=por*harga[i];
            hargatotal[2]=por*harga[i];
        } else if (pil==3) {
            menu[i]="Nasi Rawon Gajah";
            harga[i] = 40000;
            System.out.println("Jumlah Porsi= ");
              por = Integer.parseInt (input.readLine());
            por1=por*harga[i];
            hargatotal[3]=por*harga[i];
        } else if (pil==4) {
            menu[i]= "Es Jeruk";
            harga[i] = 5000;
            System.out.println("Jumlah Porsi= ");
              por = Integer.parseInt (input.readLine());
            por1=por*harga[i];
            hargatotal[4]=por*harga[i];
        } else if (pil==5) {
            menu[i]= "Es Teh";
            harga[i] = 5000;
            System.out.println("Jumlah Porsi= ");
              por = Integer.parseInt (input.readLine());
            por1=por*harga[i];
            hargatotal[5]=por*harga[i];
        }

        
  System.out.println("Menu yang anda pesan          : "+menu[i]);
  System.out.println("Jumlah Porsi         : "+por);
  System.out.println("Harga yang harus dibayar             : "+por1);
  System.out.println("Selamat Menikmati");
  System.out.print("Apakah anda ingin memesan lagi ? Y/N : ");
        
  try{
                keputusan = input.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            i++;
        }
   System.out.println("Total Harga        : "+(hargatotal[1]+hargatotal[2]+hargatotal[3]+hargatotal[4]+hargatotal[5]));
   System.out.println("Terimakasih Sudah Berkunjung");
}
}
  
