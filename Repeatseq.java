public class Main
{
	public static void main(String[] args) 
	{
	String dna = ("atcaatagatatctacatccattataggtagaaatc");
	String DNA = dna.toUpperCase();
	int c1=0;
	int c2=0;
	char m1 = 'P';
	char m2 = 'Q';
	String R1 = DNA.replace("TAG","P");
	String R2 = DNA.replace("ATC","Q");
	System.out.println("DNA Sequence: " + DNA);
	System.out.println("First repeat sequence: "+ "TAG");
	System.out.println("Second repeat sequence: "+ "ATC");
	for (int i = 0; i < R1.length(); i++)
	{
	    if (R1.charAt(i) == m1)
	        {
	            c1++;
	        }
	}
	System.out.println("No. of times TAG is repeated: "+ c1);
	for (int i = 0; i < R2.length(); i++)
	{
	    if (R2.charAt(i) == m2)
	        {
	            c2++;
	        }
	}
	System.out.println("No. of times ATC is repeated: "+ c2);;
	}
}
	
	   
