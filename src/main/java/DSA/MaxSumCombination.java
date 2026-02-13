import java.util.*;
public class MaxSumCombination {
  public static void main(String[] args) { 

    class Node
      {
        int sum;
        int i;
        int j;

        Node(int sum, int i, int j)
        {
          this.sum = sum;
          this.i = i;
          this.j=j;
        }
      }
    int[] nums1 = {3, 4, 5};
    int[] nums2 = {2, 6, 3};
    int k =2;

    int n = nums1.length;
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    PriorityQueue<Node> q = new PriorityQueue<>((a,b)->b.sum - a.sum);

    List<Integer> res = new ArrayList<>();
    Set<String> visited = new HashSet<>();

    int i = n-1;
    int j = n-1;

    q.offer(new Node(nums1[i] + nums2[j], i, j));
    visited.add(i+","+j);

    while(k>0 &&!q.isEmpty())
      {
        Node curr = q.poll();
        res.add(curr.sum);

        int x = curr.i;
        int y = curr.j;

        if(x-1>=0)
        {
          String key1 = (x-1)+","+y;
          if(!visited.contains(key1))
          {
            q.offer(new Node(nums1[x-1]+nums2[y], x-1, y));
            visited.add(key1);
          }
        }
        if(y-1>=0)
        {
          String key2 = x+","+(y-1);
          if(!visited.contains(key2))
          {
            q.offer(new Node(nums1[x]+nums2[y-1], x, y-1));
            visited.add(key2);
          }
        }
        k--;
      }
    System.out.print(res);
  }
}