public class Palindrome {
    /**
     * Break a stack into two, push the first half to one stack, then push
     * second half to a stack, then pop & push to a second stack.
     * If the string is odd, the middle element goes to both stacks (or neither!)
     * R A C E C A R
     * Stack 1: R A C E
     * Middle Letter: E
     * Stack 2: E C A R
     * Re-stack either the first or second stack and compare them.
     * @param s a string to test
     * @return true if they are the same
     */
    public boolean isPalindrome(String s) {
        boolean isAPalindrome = true;
        int mid = (int) (s.length()/2);
        StackRL<String> firstStack = new StackRL<String>();
        StackRL<String> reverseStack = new StackRL<String>();
        for(int i = 0; i<mid; i++){
            firstStack.push(s.substring(i, i));
        }
        s = s.substring(mid);
        for(int j = 0; j<mid; j++){
            reverseStack.push(s.substring(j, j));
        }
        System.out.println(firstStack);
        System.out.println(reverseStack);

        return isAPalindrome;
    }
}
