public class Square {    
    public static boolean isSquare(int n) {
      double x=Math.sqrt(n);
      if(Math.sqrt(n) == (int) x)
        return true;
      else
        return false;// fix me!
    }
}