public class TebakGambarAngka{
  public static void main (String argc[]){
    int bilRandom = (int) (Math.random()+0.5) ; //
    if (bilRandom==1){
      System.out.println("GAMBAR") ;
    }
    else{
      System.out.println("ANGKA") ;
    }
  }
}
