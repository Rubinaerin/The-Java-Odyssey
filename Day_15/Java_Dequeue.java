import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            deque.add(num);
            
            // Java 7 compatible: getOrDefault replacement
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, count + 1);
            }
            
            if (deque.size() == m) {
                if (map.size() > max) {
                    max = map.size();
                }
                
                int first = deque.remove();
                int currentCount = map.get(first);
                
                if (currentCount == 1) {
                    map.remove(first);
                } else {
                    map.put(first, currentCount - 1);
                }
            }
            if (max == m) break;
        }
        System.out.println(max);
        in.close();
    }
}
