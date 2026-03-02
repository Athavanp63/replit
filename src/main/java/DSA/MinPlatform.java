package DSA;
import java.util.*;
class MinPlatform {
  static class Pack
    {
      int arr;
      int dep;

      Pack(int arr, int dep)
      {
        this.arr = arr;
        this.dep = dep;
      }
    }
   public static void main(String[] args)
  {
    int[] arr = {900, 945, 955, 1100, 1500, 1800};
    int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
    int n = arr.length;
    List<Pack> list = new ArrayList<>();
    for(int i = 0;i<n;i++)
      {
        list.add(new Pack(arr[i], dep[i]));
      }
    Collections.sort(list, (a,b)->a.arr-b.arr);
    int count = 1;
    int ans = 1;
    int i = 1;
    int j = 0;
    while(i<n && j<n)
      {
        if(list.get(i).arr<=list.get(j).dep)
          {
            count++;
            i++;
          }
        else if(list.get(i).arr>list.get(j).dep)
          {
            count--;
            j++;
          }
        ans = Math.max(ans, count);
      }
      System.out.println(ans);
  }
}