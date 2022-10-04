// программа определяющяя палиндром
public class Palindrome {
    public static void main(String[] args) {
        // madam racecar apple kayak song noon
        for(int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + isPalindrome(s));
        }
    }
    // метод возвращает обратную введённой строку
    public static String reversString(String string) {
        String reversString = "";
        for (int i = 0; i < string.length(); i++) {
            reversString += string.charAt(string.length() - i - 1);
        }
        return reversString;
    }
    //метод сравнивает строку с обратной ей
    public static boolean isPalindrome(String str) {
        return str.equals(reversString(str));
    }
}
