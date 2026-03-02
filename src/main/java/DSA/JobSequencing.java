package DSA;
import java.util.*;
class JobSequencing {
  static class Job
    {
      int id;
      int deadline;
      int profit;
      Job(int id, int deadline, int profit)
      {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
      }
    }
   public static void main(String[] args)
  {
    int[] id = {1,2,3,4};
    int[] deadline = {4,1,1,1};
    int[] profit = {20,10,40,30};
    int n = id.length;
    List<Job> list = new ArrayList<>();
    for(int i = 0;i<n;i++)
      {
        list.add(new Job(id[i], deadline[i], profit[i]));
      }
    Collections.sort(list, (a,b)->b.profit-a.profit);
    int maxDeadline = 0;
    for(int i = 0;i<n;i++)
      {
        maxDeadline = Math.max(maxDeadline, list.get(i).deadline);
      }
    int[] res = new int[maxDeadline+1];
    Arrays.fill(res, -1);
    int count = 0;
    int maxProfit = 0;
    for(int i = 0;i<n;i++)
      {
        int currDeadline = list.get(i).deadline;
        for(int j = currDeadline;j>0;j--)
          {
            if(res[j]==-1)
              {
                res[j] = list.get(i).id;
                count++;
                maxProfit+=list.get(i).profit;
                break;
              }
          }
      }
    System.out.println(count);
    
  }
}