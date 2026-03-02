package DSA;
import java.util.*;
class SFA {
   public static void main(String[] args)
  {
    int[] jobs = {3,1,4,2,5};
    int n = jobs.length;
    Arrays.sort(jobs);
    int t= 0;
    int wt = 0;
    for(int i = 0;i<n;i++)
      {
        wt+=t;
        t+=jobs[i];
      }
    System.out.println((double)wt/n);
  }
}