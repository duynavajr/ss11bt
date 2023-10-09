package ra.bt2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        boolean isCheck = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                isCheck = true;
                if (stack.isEmpty()) {
                    System.out.println("không có cặp ngoặc");
                    return;
                }
                char openBracket = stack.pop();
                if (!isMatchingBracket(openBracket, ch)) {
                    System.out.println("không có cặp ngoặc");
                    return;
                }
            }
        }
        boolean check = stack.isEmpty();
        if(check && isCheck){
            System.out.println("Có các cặp ngoặc hợp lệ");
        }else
            System.out.println("không có cặp ngoặc ");
    }

    private static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
