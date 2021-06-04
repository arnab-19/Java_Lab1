public class Dnacomplement
{
	public static void main(String[] args) 
	{
	    String dna = "atgccctagtttagaggctctctagattca";
	    String DNA = dna.toUpperCase();
	    String qDNA = DNA.replace("A", "B").replace("G", "H");
	    String mDNA = qDNA.replace("T", "A").replace("C", "G");
	    String cDNA = mDNA.replace("B", "T").replace("H", "C");
	    System.out.println(DNA);
        System.out.println(cDNA);
	}
}
