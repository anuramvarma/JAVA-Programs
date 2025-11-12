class A
{
    public void msg()
     {
        System.out.println("2nd");
     }
    }
    class Super_Keyword extends A
    {
     public  void msg()
     {
         super.msg();
         System.out.println("1st");
      }
      public static void main(String []args)
      {
              Superkeyword obj = new Superkeyword();
              obj.msg();
      }
    }
