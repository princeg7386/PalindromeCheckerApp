public static void main(String[] args) {

    // Define input string
    String input = "refer";

    // Create Deque to store characters
    java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

    // Add each character to deque
    for (char c : input.toCharArray()) {
        deque.addLast(c);
    }

    // Assume palindrome initially
    boolean isPalindrome = true;

    // Compare from both ends
    while (deque.size() > 1) {
        if (!deque.removeFirst().equals(deque.removeLast())) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}