import java.util.Scanner;
public class Practice
{
	
    public static void main(String [] args)
    {	
	System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.");
	System.out.println("Lopetus negatiivisella kokonaisluvulla.");
	int indeksi=0;
	int summa=0;
                
	Scanner readi = new Scanner(System.in);
	while(true){
            System.out.print("Anna arvosana (4-10):");
            int luku = Integer.parseInt(readi.nextLine());	
            if(luku < 0 ){
		break;
            }
            else if(luku>3 && luku<11){
                summa+=luku;
                indeksi++;
            }else{
                continue;
            }
	}
		System.out.println("Ohjelmaan syötetty "+ indeksi +" arvosanaa.");
		System.out.println("Arvosanojen keskiarvo: "+ 1.0*summa/indeksi);
	}
}