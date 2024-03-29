import java.util.Scanner;
import java.util.Stack;
public class P1874_스택으로_수열만들기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack();
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        int num = 1;

        for(int i = 0; i < N; ++i) {
            if (num > A[i]) {
                int n = (Integer)stack.pop();
                if (n != A[i]) {
                    System.out.println("NO");
                    result = false;
                    break;
                }

                bf.append("-\n");
            } else {
                while(num <= A[i]) {
                    bf.append("+\n");
                    stack.push(num++);
                }

                bf.append("-\n");
                stack.pop();
            }
        }

        if (result) {
            System.out.println(bf);
        }

    }
}
