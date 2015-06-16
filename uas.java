import java.io.*;
import java.util.*;
import java.util.Vector.*;
import java.util.Date; 
import java.text.DateFormat; 
import java.text.SimpleDateFormat; 

public class uas{
  
  public static Vector<String> addbrg (String barang){
   Vector<String> vector = new Vector <String>();
   vector.addElement(barang);
   return vector;
  }
  public static Vector<Integer> addbrg1 (int jumlah, int harga){
   Vector<Integer> vector1 = new Vector <Integer>();
   vector1.addElement(jumlah);
   vector1.addElement(harga);
   return vector1;
  }
  
  public static Vector<Vector> dataT = new Vector<Vector>();
  public static Vector<String>waktu = new Vector<String>();
  public static Vector<String>code1 = new Vector<String>();
  public static Vector<String>code2 = new Vector<String>();
  public static Vector<Integer>harga1 = new Vector<Integer>();
  public static Vector<Integer>jml = new Vector<Integer>();
  public static Vector<String>barang1 = new Vector<String>();
  public static Vector<String>nmbrgs= new Vector<String>();
  public static Vector<Integer>jmlbelis= new Vector<Integer>();
  public static Vector<Integer>hrgbrgs= new Vector<Integer>();
  public static Vector<String>nmbrgh= new Vector<String>();
  public static Vector<Integer>jmlbelih= new Vector<Integer>();
  public static Vector<Integer>hrgbrgh= new Vector<Integer>();
    
  public static String id[][]={
    {"User","user"},{"Firman","fin"}
  }; 
    //array
  public static String []code= {"001","002","003","004","005"};
  public static String [] barang = {"Sunsilk","Dettol","Pepsodent","Cussons","Lifebuoy"};
  public static int [] harga ={14000,13000,9000,23000,18000};
  public static int [] hargabeli ={14000,13000,9000,23000,18000};
  public static void viewAll(){
    
    for(int i=0;i<code.length;i++){
     System.out.print(code[i]+"  "); 
    System.out.print(barang[i]+"  ");
    System.out.println(harga[i]);
    }
  }
  
    public String getTanggal() { 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        Date date = new Date(); 
        return dateFormat.format(date); 
    }
  public static void main(String []args)throws IOException{
    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
     Scanner scan=new Scanner (System.in);
     int pil=0;
     int jmlpem=0;
     String keputusan="Y";
     int noT=1;
     int w=-1;
  int count=0;
  int ulang=0;
  
  
  do{
  System.out.println("FORM LOGIN :");
  System.out.print("ID       : ");
  String user=scan.nextLine();
  System.out.print("PASSWORD : ");
  String sandi=scan.nextLine();
  for (int i=0;i<id.length;i++)
  {
    if(user.equals(id[i][0])&&sandi.equals(id[i][1]))
    {
      count=4;
      w=i;
    }
  }
  count++;
  }while(count<3);
  if(w==-1)
  {
  System.out.println("Anda Sudah Mencoba 3x!\nSystem Lock.");
  System.exit(0);
  }
  System.out.println("SELAMAT DATANG "+id[w][0]);
  do{
   while (keputusan.equals("Y") ||keputusan.equals("y"))
   {
     
    System.out.println("=====================================");
    System.out.println("         Selamat Datang V-Mart       ");
    System.out.println("=====================================");
    System.out.println("1. Nama dan Harga Barang : ");
    System.out.println("2. Proses Pembelian : ");
    System.out.println("3. Maintenance Data Barang : ");
    System.out.println("4. Total barang yang di beli : ");
    System.out.println("5. History pembelian hari ini : ");
    System.out.println("6. Exit ");
    int pilihan=scan.nextInt();
     dataT.addElement(nmbrgh);
     dataT.addElement(jmlbelih);
     dataT.addElement(hrgbrgh);
    
    switch(pilihan){
      case(1):
        System.out.println("=====================================");
        System.out.println("        Nama dan Harga Barang        ");
        System.out.println("=====================================");
        viewAll();
        
        
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin kembali ke menu awal ? Y/N : ");
        break;
        
        
      case(2):
        System.out.println("=====================================");
        System.out.println("           Proses Pembelian          ");
        System.out.println("=====================================");
        viewAll();
         System.out.println("Masukkan Jumlah Item Yang Dibeli = ");
         jmlpem= Integer.parseInt(input.readLine());
         ulang+=jmlpem;
        viewAll();


        for(int u=0;u<jmlpem;u++){
          
          
          
        System.out.println("Masukkan Kode Barang yang ingin dipilih = ");
        String kode=input.readLine();
      
     
        for (int k=0; k<code.length; k++){
        
        if(kode.equals(code[k])){
         
          
        code1.add(kode);
        code2.add(kode);
        
        
        System.out.println(barang[k]+" "+harga[k]);
        System.out.println("Ingin Beli Berapa ?");
        int jumlah=Integer.parseInt(input.readLine());
 
       jmlbelis.add(jumlah);
        hrgbrgs.add(harga[k]);
        nmbrgs.add(barang[k]);
        
        jmlbelih.add(jumlah);
        hrgbrgh.add(harga[k]);
        nmbrgh.add(barang[k]);
      
        }
    
        } 
  
   
        }
  
          System.out.println("=====================================");
        System.out.print("Apakah anda ingin kembali ke menu awal ? Y/N : ");
        break;
       case(3):
         System.out.println("1. Menambah Barang Baru");
         System.out.println("2. Mengupdate Data Barang");
         System.out.println("3. Menghapus Data Barang");
         System.out.println("4. Tampilkan Semua Barang");
         int pilMain= scan.nextInt();
         
         switch (pilMain){
           case(1):
             viewAll();
             
             System.out.print("Masukan Kode yang akan ditambahkan");
         String tkode=scan.next();
        System.out.print("Masukan Nama Barang yang akan ditambahkan");
         String tbrg=scan.next();
         System.out.print("Masukan Harga Barang yang akan ditambahkan");
         int tharga=scan.nextInt();
             for(int y=0;y<code.length;y++){
               if(code[y].equals(tkode) ||barang[y].equals(tbrg)){
                 System.out.println("Maaf Barang Sudah Ada");
             }
             }
       String []newkode=new String[code.length];
       String []newbrg=new String[barang.length];
       int [] newharga=new int [harga.length];
       
         System.arraycopy(code,0,newkode,0,code.length);
         System.arraycopy(barang,0,newbrg,0,barang.length);
         System.arraycopy(harga,0,newharga,0,harga.length);
        code=new String[code.length+1];
        barang=new String[barang.length+1];
        harga=new int[harga.length+1];
        System.arraycopy(newkode,0,code,0,newkode.length);
         System.arraycopy(newbrg,0,barang,0,newbrg.length);
        System.arraycopy(newharga,0,harga,0,newharga.length);
        code[code.length-1]=tkode;
        barang[barang.length-1]=tbrg;
        harga[harga.length-1]=tharga;
        
        System.out.print("Apakah anda ingin kembali ke menu awal ? Y/N : ");
      break;  
           case(2):
             viewAll();
              int idx=-1;
       System.out.print("Masukan Kode Barang yang akan diupdate");
       String update=scan.next();
          for (int i=0;i<code.length;i++)
          {
            if (code[i].equals(update))
            {
              idx=i;
              
            }
          }
          if(idx==-1)
          {
            System.out.println("Data tidak ketemu!");
            break;
          }
          
          System.out.print("Apakah anda akan mengupdate Daftar Barang Kode "+code[idx]+" Nama Barang "+barang[idx]+" Harga : "+harga[idx]+" ?[y/n]");
          String jawab=scan.next();
          if (jawab.equalsIgnoreCase("y")){
          System.out.print("Masukan Nama Baru Pada Kode "+code[idx]+" : ");
          String hasil=scan.next();
          System.out.print("Masukan Harga Baru Pada Kode "+code[idx]+" : ");
          int hasil1=scan.nextInt();
          barang[idx]=hasil;
          harga[idx]=hasil1;
          }
           case(3):
           viewAll();
           
            int index=-1;
            int j=-1;
          
             String []newkode1=new String[code.length-1];
             String []newbarang=new String[barang.length-1];
             int [] newharga1=new int [harga.length-1]; 
             int [] newhargabeli = new int [hargabeli.length-1];
             System.out.print("Masukan Kode Barang yang akan dihapus");
             String hapus=scan.next();
              for (int n=0;n<code.length;n++)
       {
         if (code[n].equals(hapus))
         {
           index=n;
           j=n;
         }
}
       if(index==-1)
       {
         System.out.println("Data tidak Ditemukan!");
        break;
       }
      System.out.print("Apakah anda akan menghapus Daftar Barang =");
        System.out.println("kode :"+code[index]);
        System.out.println(" Nama Barang "+barang[index]);
        System.out.println(" Harga : "+harga[index]+"    ?[y/n]");
      jawab=scan.next(); 
      if (jawab.equalsIgnoreCase("y")){
         //memindah semua data sebelum index  
         
         System.arraycopy(code,0,newkode1,0,index);
         System.arraycopy(barang,0,newbarang,0,index);
         System.arraycopy(harga,0,newharga1,0,index);
         System.arraycopy(hargabeli,0,newhargabeli,0,index);
         //mengisi sesudah index
         
         System.arraycopy(code,(index+1),newkode1,index,(code.length-index)-1);
         System.arraycopy(barang,(index+1),newbarang,index,(barang.length-index)-1);
         System.arraycopy(harga,(index+1),newharga1,index,(harga.length-index)-1);
         System.arraycopy(hargabeli,(index+1),newhargabeli,index,(hargabeli.length-index)-1);
         //memindah array baru ke array lama kembali
         code=new String[newkode1.length];
         barang=new String[newbarang.length];
         harga=new int[newharga1.length];
         hargabeli=new int[newhargabeli.length];
         
         
         System.arraycopy(newkode1,0,code,0,newkode1.length);
         System.arraycopy(newbarang,0,barang,0,newbarang.length);
         System.arraycopy(newharga1,0,harga,0,newharga1.length);
         System.arraycopy(newhargabeli,0,hargabeli,0,newhargabeli.length);
       }
            
             System.out.print("Apakah anda ingin kembali ke menu awal ? Y/N : ");      
         
         break;
           case 4:
             viewAll();
             System.out.print("Apakah anda ingin kembali ke menu awal ? Y/N : ");      
         
             break;
         }
         break;
         
      case(4):
           System.out.println("Transaksi Ke = "+noT);

          noT++;
         System.out.println("======================================================");
         System.out.println("                   Selamat Datang                     ");
         System.out.println("   Code  ||   Barang   || Jumlah || Harga Per Satuan  ");
         System.out.println("======================================================");
        int total=0;

        for (int i=0;i<jmlpem;i++){
          
          total=(hrgbrgs.elementAt(i)*jmlbelis.elementAt(i));
          
        System.out.print("  "+code1.elementAt(i));
        System.out.print("  || "+nmbrgs.elementAt(i));
        System.out.print(" ||  "+ jmlbelis.elementAt(i));
        System.out.println("     ||  "+hrgbrgs.elementAt(i));
        
        dataT.addElement(addbrg(nmbrgs.elementAt(i)));
        dataT.addElement(addbrg1(jmlbelis.elementAt(i),hrgbrgs.elementAt(i)));
        }
       
        System.out.println("======================================================");
        System.out.println("  Total Transaksi                    "+total);
        System.out.println("======================================================"); 


 

code1.clear();
        hrgbrgs.clear();
        jmlbelis.clear();
        hrgbrgs.clear();

total=0;    
        
         int omset=0;
         int omset1=0;
         
         int hrgjual=0;
         
        System.out.println("Omset Anda Sebesar");
        for(int b=0;b<hrgbrgs.size();b++){
          int hrgjual1=jmlbelis.elementAt(b)*(hrgbrgs.elementAt(b)-hargabeli[b]);
          hrgjual=hrgjual1+hrgjual;
          
       
        }
        System.out.println("harga jual"+hrgjual);
        
             System.out.print("Apakah anda ingin kembali ke menu awal ? Y/N : ");
             break;
      case(5):       
        System.out.println("History barang yang telah dibeli hari ini ");
        for(int f=0; f<ulang;f++)
        {
          System.out.println("Barang : "+dataT.elementAt(0).elementAt(f));
          System.out.println("Jumlah : "+dataT.elementAt(1).elementAt(f));   
          System.out.println("Harga : "+dataT.elementAt(2).elementAt(f));
        }
       break;      
             
             
      case(6):
      System.exit(0);
        break;
         
    } 
    try{
                keputusan = input.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
        
     
  
   
   }
    
    
  }while(true);
  
}
}
