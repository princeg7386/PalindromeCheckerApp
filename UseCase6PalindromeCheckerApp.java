public static void main(String[] args) {

    // Define input string
    String input = "civic";

    // Create Queue (FIFO)
    java.util.Queue<Character> queue = new java.util.LinkedList<>();

    // Create Stack (LIFO)
    java.util.Stack<Character> stack = new java.util.Stack<>();

    // Insert characters into both queue and stack
    for (char c : input.toCharArray()) {
        queue.add(c);
        stack.push(c);
    }

    // Assume palindrome initially
    boolean isPalindrome = true;

    // Compare until queue becomes empty
    while (!queue.isEmpty()) {
        if (!queue.remove().equals(stack.pop())) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}