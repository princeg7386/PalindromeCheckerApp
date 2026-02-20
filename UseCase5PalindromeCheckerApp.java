public static void main(String[] args) {

    // Declare and initialize input string
    String input = "noon";

    // Create stack to store characters
    java.util.Stack<Character> stack = new java.util.Stack<>();

    // Push each character into stack
    for (char c : input.toCharArray()) {
        stack.push(c);
    }

    // Assume palindrome initially
    boolean isPalindrome = true;

    // Compare by popping from stack
    for (char c : input.toCharArray()) {
        if (c != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}