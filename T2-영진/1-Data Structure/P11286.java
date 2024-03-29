import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class P11286 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    PriorityQueue<Integer> q = new PriorityQueue() {
      public int compare(int a, int b) {
        int A = Math.abs(a);
        int B = Math.abs(b);
        if (A == B) {
          if (a > b) {
            return 1;
          } else if (a < b) {
            return -1;
          }
        }
        else {
          return A - B;
        }
        return a-b;
      }
    };

    for (int i = 0; i < N; i++) {
      int k = sc.nextInt();
      if (k == 0) {
        if (q.isEmpty()) {
          System.out.println(0);
        } else {
          System.out.println(q.poll());
        }
      } else {
        q.add(k);
      }
    }
  }
}
