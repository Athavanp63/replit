import java.util.*;
class Heap {
   private ArrayList<Integer> list;

  public Heap()
  {
    list = new ArrayList<Integer>();
  }

  private void swap(int i, int j)
  {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }
  
  private int parent(int i)
  {
    return (i-1)/2;
  }
  
  private int leftChild(int i)
  {
    return 2*i+1;
  }
  
  private int rightChild(int i)
  {
    return 2*i+2;
  }

  public void insert(int i)
  {
    list.add(i);
    upheap(list.size()-1);
  }

  private void upheap(int i)
  {
    if(i==0)
    {
      return;
    }
    int p = parent(i);
    if(list.get(p)>list.get(i))
    {
      swap(p,i);
      upheap(p);
    }
  }

  public int remove()
  {
    int temp = list.get(0);
    int last = list.remove(list.size()-1);

    if(!list.isEmpty())
    {
      list.set(0,last);
      downheap(0);
    }
    return temp;
  }
  private void downheap(int i)
  {
    int minIndex = i;
    int left = leftChild(i);
    int right = rightChild(i);

    if(left<list.size() && list.get(left)<list.get(minIndex))
    {
      minIndex = left;
    }
    if(right<list.size() && list.get(right)<list.get(minIndex))
    {
      minIndex = right;
    }
    if(i!=minIndex)
    {
      swap(i,minIndex);
      downheap(minIndex);
    }
  }
}