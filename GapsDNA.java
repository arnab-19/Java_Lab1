public class GapsDNA
{
	public static void main(String[] args) 
	{
	String dna = ("atcaa agatat tacatc cat tatag gta gaaatc");
	String DNA = dna.toUpperCase();
	int c=0;
	char m = 'P';
	System.out.println("DNA sequence: " + DNA);
	String G = DNA.replace(" ","P");
	for (int i = 0; i < G.length(); i++)
	{
	    if (G.charAt(i) == m)
	        {
	            c++;
	        }
	}
	int n = DNA.length();
	float p = (float)c/n*100;
	System.out.println("No. of gaps in DNA sequence: "+ c);
	System.out.println("Percentage of gaps in DNA sequence: "+ p);
	}
}
	
	   
