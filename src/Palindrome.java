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

        //These are just requirement for LeetCode, because I noticed that this had a same problem, and I wanted to check the runtime/time complexity of this. 24ms beats 11.47%
        //s= s.replaceAll("\\s+","");
        //s = s.replaceAll("[^A-Za-z 0-9]+", "");
        //s = s.toLowerCase();
        int mid = (int) (s.length()/2);
        StackRL<String> firstStack = new StackRL<>();
        StackRL<String> reverseStack = new StackRL<>();
        for(int i = 0; i<mid; i++){
            firstStack.push(s.substring(i, i+1));
        }
        if(s.length() % 2 == 1){
            s = s.substring(mid+1);
        }else{
            s = s.substring(mid);
        }

        for(int j = 0; j<mid; j++){
            reverseStack.push(s.substring(j, j+1));
            if(!reverseStack.peek().equals(firstStack.pop())){
                isAPalindrome = false;
            }
        }

        return isAPalindrome;
    }
}
