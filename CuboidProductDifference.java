public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    //your code here !!
    int p1=1;int p2=1;
    for(int i=0;i<=2;i++)
    {
      p1*=firstCuboid[i];
      p2*=secondCuboid[i];
    }
    return Math.abs(p1-p2);
  }
}