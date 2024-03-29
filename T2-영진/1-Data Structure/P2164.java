import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class P2164 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();

    for(int i = 1; i <= N; i++){
      q.add(i);
    }

    while(q.size() > 1){
      q.poll();
      q.add(q.poll()); //q.peek(x) q.poll(o)
    }

    System.out.println(q.poll());


  }
}
