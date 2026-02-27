import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);

        StringBuilder rev = new StringBuilder();
        while (!stack.isEmpty()) rev.append(stack.pop());

        return input.equals(rev.toString());
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : input.toCharArray()) dq.add(c);

        while (dq.size() > 1) {
            if (!dq.removeFirst().equals(dq.removeLast()))
                return false;
        }
        return true;
    }
}

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine().replaceAll("\\s+","").toLowerCase();

        PalindromeStrategy stack = new StackStrategy();
        PalindromeStrategy deque = new DequeStrategy();

        long start1 = System.nanoTime();
        boolean r1 = stack.isPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = deque.isPalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("\nStack Result : " + r1);
        System.out.println("Stack Time   : " + (end1 - start1) + " ns");

        System.out.println("\nDeque Result : " + r2);
        System.out.println("Deque Time   : " + (end2 - start2) + " ns");

        sc.close();
    }
}