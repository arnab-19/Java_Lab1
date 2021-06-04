public class Basefrequency
{
	public static void main(String[] args) 
	{
	    String dna = "atgccctagtttagaggctctctagattca";
	    char b1 = 'A';
	    char b2 = 'T';
	    char b3 = 'G';
	    char b4 = 'C';
	    int c1 = 0;
	    int c2 = 0;
	    int c3 = 0;
	    int c4 = 0;
	    String DNA = dna.toUpperCase();
	    for (int i = 0; i < DNA.length(); i++) 
	    {
	        if (DNA.charAt(i) == b1)
	        {
	            c1++;
	        }
	        else if (DNA.charAt(i) == b2)
	        {
	            c2++;
	        }
	        else if (DNA.charAt(i) == b3)
	        {
	            c3++;
	        }
	        else if (DNA.charAt(i) == b4)
	        {
	            c4++;
	        }
	    }
	    int a = c1+c2+c3+c4;
	    float cf1 = (float)c1/a*100;
	    float cf2 = (float)c2/a*100;
	    float cf3 = (float)c3/a*100;
	    float cf4 = (float)c4/a*100;
	    float m1 = Math.max(cf1,cf2);
	    float m2 = Math.max(cf3,cf4);
	    float m = Math.max(m1,m2);
	    float n1 = Math.min(cf1,cf2);
	    float n2 = Math.min(cf3,cf4);
	    float n = Math.min(n1,n2);
	    System.out.println("Percentage of A: " + cf1);
	    System.out.println("Percentage of T: " + cf2);
	    System.out.println("Percentage of G: " + cf3);
	    System.out.println("Percentage of C: " + cf4);
	    System.out.println("Maximum base frequency: "+ m);
	    System.out.println("Minimum base frequency: "+ n);
	}
}
