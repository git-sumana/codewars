public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        if (args.length == 0) {
            System.out.println("Empty Array");
        }
        int smallest = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }
        return smallest;
    }
}