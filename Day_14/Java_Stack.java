import java.util.*;

class Solution {
    
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input = sc.next();
            // LIFO (Last-In-First-Out) mantigi icin Stack kullaniyoruz
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                
                // Acilis parantezi ise yigina (stack) ekle
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    // Kapanis parantezi geldi ama yigin bossa denge bozulmustur
                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    }
                    
                    // En son acilan parantezi cek ve su ankiyle eslesiyor mu bak
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') || 
                        (ch == '}' && top != '{') || 
                        (ch == ']' && top != '[')) {
                        isBalanced = false;
                        break;
                    }
                }
            }
            // Metin bittiginde yigin bossa tam dengelidir
            System.out.println(isBalanced && stack.isEmpty());
        }
        sc.close();
    }
}
