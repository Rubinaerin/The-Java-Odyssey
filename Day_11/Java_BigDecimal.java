import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

       java.util.Arrays.sort(s, 0, n, new java.util.Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                java.math.BigDecimal b1 = new java.math.BigDecimal(a1);
                java.math.BigDecimal b2 = new java.math.BigDecimal(a2);
                // Azalan sira icin b2 ile b1'i karsilastiriyoruz
                return b2.compareTo(b1);
            }
        });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
