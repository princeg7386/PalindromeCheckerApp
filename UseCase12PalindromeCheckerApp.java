import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return input.equals(reversed.toString());
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.isPalindrome(input);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker App");

        System.out.print("Enter string: ");
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Choose: ");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.check(input);

        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}