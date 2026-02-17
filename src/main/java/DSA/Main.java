package DSA;

class Override {
    void print()
  {
    System.out.println("overriding");
  }
}
class Example extends Override
  {
    void print()
    {
      System.out.println("example overriding");
    }
  }

class Main
  {
    public static void main(String[] args)
    {
      Example obj = new Example();
      obj.print();
    }
  }