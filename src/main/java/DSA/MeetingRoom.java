package DSA;
import java.util.*;
class MeetingRoom
  {
    static class Meet
      {
        int st;
        int end;
        int idx;

        public Meet(int st, int end, int idx)
        {
          this.st = st;
          this.end = end;
          this.idx = idx;
        }
      }
    public static void main(String[] args)
    {
       int[] st = {1,3,0,5,8,5};
       int[] end = {2,4,5,7,9,9};
       List<Meet> l = new ArrayList<>();
       int n = st.length;

      for(int i =0;i<n;i++)
        {
          l.add(new Meet(st[i], end[i], i));
        }
        Collections.sort(l, (a,b) -> a.end - b.end);
        int count = 1;
        int lastEnd = l.get(0).end;
        for(int i = 1;i<n;i++)
          {
            if(l.get(i).st >= lastEnd)
            {
              count++;
              lastEnd = l.get(i).end;
            }
          }
        System.out.println(count);
    }
  }