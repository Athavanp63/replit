class FractionalKnapsack {
   public static void main(String[] args)
  {
    class Item
      {
        int value;
        int weight;
        Item(int value, int weight)
        {
          this.value = value;
          this.weight = weight;
        }
      }
    int val[] = {60, 100, 120};
    int wt[] = {10, 20, 30};
    int cap = 50;
    double totalvalue = 0.0;
    int n = val.length;
    Item[] item = new Item[n];

    for(int i =0;i<n;i++)
      {
        item[i] = new Item(val[i], wt[i]);
      }
    Arrays.sort(item, (a,b)->Double.compare((double)b.value/b.weight, (double)a.value/a.weight));

    for(int i =0;i<n;i++)
      {
        if(cap>=item[i].weight)
        {
          totalvalue += item[i].value;
          cap -= item[i].weight;
        }
        else
        {
          totalvalue += ((double)item[i].value/item[i].weight)*cap;
        }
      }
      System.out.println(totalvalue);
  }
}