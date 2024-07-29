public class Longestword {
    public static void main(String[] args) {
        String text1 = "This is a coding challenge for the interview process";
        String text2 ="";
        String largeword = "";
        String[] words = new String[100];
        int length = 0;
        //string = string + " ";
        for (int i =0 ; i< text1.length(); i++) {
            if(text1.charAt(i) != ' '){
                text2 = text2 + text1.charAt(i);
            }
            else{
                words[length] = text2;
                length++;
                text2 = "";
            }
        }
        largeword = words[0];
        for(int j = 0; j < length; j++){
            if(largeword.length() < words[j].length())
                largeword = words[j];
        }
        System.out.println("" + largeword);
    }
}