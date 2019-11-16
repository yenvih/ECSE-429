import java.util.Scanner;
import java.io.*;

public class GenerateMutants {
    public static void main(String[] args) {
        // Create an instance of File for data.txt file.
        File file = new File("Arithmetic.java");
		int totalmutants=0;

		// + mutants
        try {
            Scanner scanner = new Scanner(file);
			File fout1 = new File("mutantplus1.txt");
		    FileOutputStream fos1 = new FileOutputStream(fout1);
		    BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(fos1));

			File fout2 = new File("mutantplus2.txt");
		    FileOutputStream fos2 = new FileOutputStream(fout2);
		    BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(fos2));

			File fout3 = new File("mutantplus3.txt");
		    FileOutputStream fos3 = new FileOutputStream(fout3);
		    BufferedWriter bw3 = new BufferedWriter(new OutputStreamWriter(fos3));
			int line1_nb=0;
			int line2_nb=0;
			int line3_nb=0;
			
			File fout_mutant = new File("mutant.txt");
		    FileOutputStream fos_mutant = new FileOutputStream(fout_mutant);
		    BufferedWriter bw_mutant = new BufferedWriter(new OutputStreamWriter(fos_mutant));
		
			
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
				line1_nb++;
				if (line.contains("n1 +")) { 
				  String line1 = line.replace("n1 + n2", "n1 - n2");
				  String line2 = line.replace("n1 + n2", "n1 * n2");
				  String line3 = line.replace("n1 + n2", "n1 / n2");
	  			  
				  bw1.write("// origin line: " + line);bw1.write("\n");
				  bw1.write("// below is mutant line: Mutant type -");bw1.write("\n");
				  bw1.write(line1);bw1.write("\n");
				  totalmutants++;
				  bw2.write("// origin line: " + line);bw2.write("\n");
				  bw2.write("// below is mutant line: Mutant type *");bw2.write("\n");
				  bw2.write(line2);bw2.write("\n");
				  totalmutants++;
				  bw3.write("// origin line: " + line);bw3.write("\n");
				  bw3.write("// below is mutant line: Mutant type /");bw3.write("\n");
				  bw3.write(line3);bw3.write("\n");
				  totalmutants++;
				  
				  bw_mutant.write(line1_nb + ":" + "+" + ":" + "-,*,/");bw_mutant.write("\n");
				  
								  
				} 
				
				if (line.contains("n1 -")) {
					bw_mutant.write(line1_nb + ":" + "-" + ":" + "+,*,/");bw_mutant.write("\n");
					totalmutants+=3;
				}
				
				if (line.contains("n1 *")) {
					bw_mutant.write(line1_nb + ":" + "*" + ":" + "+,-,/");bw_mutant.write("\n");
					totalmutants+=3;
				}
				if (line.contains("n1 /")) {
					bw_mutant.write(line1_nb + ":" + "/" + ":" + "+,-,*");bw_mutant.write("\n");
					totalmutants+=3;
				}
				else {
				  bw1.write(line);
                  bw1.write("\n");
				  
				  bw2.write(line);
                  bw2.write("\n");
				  
				  bw3.write(line);
                  bw3.write("\n");
				}
            }
			
			bw_mutant.write("Total Possible Mutants: " + totalmutants);bw_mutant.write("\n");
			bw1.close();
			bw2.close();
			bw3.close();
			bw_mutant.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
		  // Problem when writing to the file
		  e.printStackTrace();
		}
	System.out.println("Total	number	of	mutants : "+totalmutants);	

    }
}
