public class Gccontent
{
	public static void main(String[] args) 
	{
	    String dna = "atgccctagtttagaggctctctagattca";
	    char b1 = 'A';
	    char b2 = 'T';
	    char b3 = 'G';
	    char b4 = 'C';
	    int c1 = 0,c2 = 0,c3 = 0,c4 = 0;
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
	    int q = c3+c4;
	    float g = (float)q/a;
	    float t = (float)g*100;
	    System.out.println("DNA sequence: " + DNA);
	    System.out.println("A's count is " + c1);
	    System.out.println("T's count is " + c2);
	    System.out.println("G's count is " + c3);
	    System.out.println("C's count is " + c4);
	    System.out.println("GC percentage of DNA is: " + t);
	}
}