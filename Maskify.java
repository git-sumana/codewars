public class Maskify {
    public static String maskify(String str) {
        // Check if the string is null or empty
        if (str == null || str.isEmpty()|| str.length()<=4) {
            return str;
        }
        // Get the last four characters of the string
        String lastFourChars = str.substring(str.length() - 4);

        // Create a mask of '#' characters with a length equal to the original string length minus 4
        String mask = "#".repeat(str.length() - 4);
        return mask + lastFourChars;
    }
  }