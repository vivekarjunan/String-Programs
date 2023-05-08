package practice_project;

public class Repeated_And_Non_repeated_string {

	public static void main(String[] args) {


				
	   String word = "helloworld";
	   
	   int ar[] = new int[word.length()];
	   
	   for(int i=0;i<word.length();i++)
	   {
		   int count=1;
		   
		   for(int j=i+1;j<word.length();j++)
		   {
			   if(word.charAt(i)==word.charAt(j))
			   {
				   count++;
				   ar[j]=-1;
			   }
		   }
		   
		   if(ar[i]!=-1)
		   {
			 ar[i]=count;  
		   }
	  }
	    
	   for(int i=0;i<word.length();i++)
	   {

		   if(ar[i]>=2)
		   {
			   System.out.println("repeated:"+word.charAt(i));
		   }
		   else if(ar[i]==1)
		   {
			   
			   System.out.println("non repeated:"+word.charAt(i));
		   }
		   
		   
		   
		   //if(ar[i]>=1&&ar[i]!=-1)
		   //{
			 //  System.out.println(word.charAt(i)+"="+ar[i]);
		   //}

	   
	   }

	
  }

}
