
public class loops_example 
{

	public static void main(String[] args) 
	{
		int value=0;
		int myint= 5 ;
		while (value < 10)
		  {
			System.out.println("Hello " + value);
			
			if (value==5) {
				break;
			}
			value =value + 1;
		  }
        for(int i=0; i < 5; i++)
          {
	        System.out.println("number is :" + i);
	        System.out.printf("number = : %d \n", i);
          }
	

	
	  if ( myint < 10)
	    {
		  System.out.println("Yes it is True");
	    }
	  else if ( myint  < 20)
	    {
		  System.out.println("No it is False");
	    }
	  
	  
	  
	}
}
