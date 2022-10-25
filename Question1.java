
public class Question1 {

	public static void main(String[] args)
	{	
		int n=13;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				//print I
				if((i==0 && j>=n/4 && j<=3*n/4)
						|| (i==(n-1) && j>=n/4 && j<=3*n/4) 
						|| j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			
		
				for(int j=0; j<n; j++)
				{
					// Print N 
					if(j==0 || j==n-1 || i==j && j<n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				
				}
				
				//Space
				for(int j=0; j<n/4; j++)
				{
						System.out.print(" ");
				}
				
				
				
				
				for(int j=0; j<n; j++)
				{
					// Print E
					if(j==0 || (i==0 && j<3*n/4 && j>0)
							|| (i==(n-1)/2 && j<3*n/4 && j>0) 
							|| (i==(n-1) && j<3*n/4 && j>0))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}	
				
			
					for(int j=0; j<n; j++)
					{
						// Print U
						if(j==0 && i<(n-1) || j==3*n/4 && i<(n-1) 
								|| i==(n-1) && j>0 && j<(3*n/4) )
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					
					}	
					
					for(int j=0; j<n; j++)
					{
						// Print R
						if(j==0 && i>0 || (j==3*n/4 && i<(n-1)/2 && i>0)
								|| (i==(n-1)/2 && j>0 & j<3*n/4) 
								|| i==j && j>(n-1)/2 || i==0 && j<3*n/4 && j>0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
						
					
					}
				
					//Space
					for(int j=0; j<n/4; j++)
					{
							System.out.print(" ");
					}
					
					for(int j=0; j<n; j++)
					{
						// Print O
						if((j==0 && i>0 && i<(n-1)) 
								|| (j==3*n/4 && i<(n-1) && i>0)
								|| (i==0 && j<3*n/4 && j>0) 
								|| (i==(n-1) && j>0 && j<3*n/4))
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					
					}
					
					for(int j=0; j<n; j++)
					{
						// Print N 
						if(j==0 || j==n-1 || i==j && j<n-1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					
						
					}
					
					//Space
					for(int j=0; j<n/4; j++)
					{
							System.out.print(" ");
					}
				System.out.println();
				
				
		}
			
	}

}
