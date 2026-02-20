public static void main(String[] args) {

    String input = "level";
    String reversed = "";

    // Iterate from last character to first
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed = reversed + input.charAt(i);
    }

    // Compare original and reversed string
    if (input.equals(reversed)) {
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Palindrome Result: true");
    } else {
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Palindrome Result: false");
    }
}