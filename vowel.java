public class vowel
{
   public static void main(String args[])
   {
      String str1 = "Challenge";
      str1 = str1.toLowerCase();
      StringBuilder vowel = new StringBuilder();
      int count = 0;
      for (int i =0; i < str1.length(); i++)
      {
         if (str1.charAt(i) == 'a'|| str1.charAt(i) == 'e'||str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u' )
         {
            count++;
            vowel.append(str1.charAt(i)).append(" ");
         }
      }
      System.out.println("" +count);
      System.out.println("" + vowel.toString());
   }
}