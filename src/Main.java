public class Main {
    public static void main(String[] args) {
        Palindrome test = new Palindrome();
        //System.out.println(test.isPalindrome("racecar"));
        //System.out.println(test.isPalindrome("abba"));
        //System.out.println(test.isPalindrome("idfcvn"));
        //System.out.println(test.isPalindrome("o"));
        System.out.println(test.isPalindrome(" "));
        System.out.println(test.isPalindrome("race a car"));
        System.out.println(test.isPalindrome("A man, a plan, a canal: Panama"));
    }
}