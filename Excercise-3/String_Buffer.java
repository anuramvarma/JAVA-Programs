class String_Buffer
{
    public static void main(String []args) 
  {
  	StringBuffer sb = new StringBuffer("Anuram Varma");
  	String message = sb.toString();
  	System.out.println(message);
  	  sb.delete(5,8);
  	System.out.println("After Delete"+sb);
  	  sb.deleteCharAt(5);
  	System.out.println("After Char Delete"+sb);
	
  }
}
