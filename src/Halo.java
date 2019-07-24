
public class Halo {
	
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
	int minval(int *A, int n) {
		  int currmin;

		  for (int i=0; i<n; i++)
		    if (A[i] < currmin)
		      currmin = A[i];
		  return currmin;
		}

}
