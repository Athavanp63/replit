import java.util.*;
public class Main {
  public static void main(String[] args) { 
    int[] nums = {6, 5, 3, 2, 8, 10, 9};
    int k = 3;
    int[] res = new int[nums.length];
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int idx =0;
    for(int i=0;i<=k;i++)
      {
        q.add(nums[i]);
      }
    for(int i = k+1;i<nums.length;i++)
      {
        res[idx++] = q.poll();;
        q.add(nums[i]);
      }
    while(!q.isEmpty())
      {
        res[idx++] = q.poll();
      }
    System.out.println(Arrays.toString(res ));
  }
}