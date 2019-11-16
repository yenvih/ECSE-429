import java.util.Scanner;
import java.io.*;

public class GenerateMutants {
    public static void main(String[] args) {
	
		File file = new File("Arithmetic.java");
		File mutant = new File("mutant.txt");
		
		String[][] matrix = new String[4][3];
		int count=0;
		
		try {
			Scanner readmutant = new Scanner(mutant);
			
			while (readmutant.hasNextLine()) {
				String myline = readmutant.nextLine();
				// System.out.println(myline);
				String[] parts = myline.split(":");
				
				if (count <4) {
					
					matrix[count][0] = parts[0];
					matrix[count][1] = parts[1];
					matrix[count][2] = parts[2];
					count++;
				}
				
			}
		
		}
		catch (IOException e) {
				  // Problem when writing to the file
			e.printStackTrace();
		}		
		
		count=1;
		try {
			Scanner scanner = new Scanner(file);

			File fout0 = new File("origin_software_undertest.java");
		    FileOutputStream fos0 = new FileOutputStream(fout0);
		    BufferedWriter bw0 = new BufferedWriter(new OutputStreamWriter(fos0));
			//
			File fout1 = new File("mutant1.java");
		    FileOutputStream fos1 = new FileOutputStream(fout1);
		    BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(fos1));
			
			File fout12 = new File("mutant12.java");
		    FileOutputStream fos12 = new FileOutputStream(fout12);
		    BufferedWriter bw12 = new BufferedWriter(new OutputStreamWriter(fos12));
			
			File fout13 = new File("mutant13.java");			
		    FileOutputStream fos13 = new FileOutputStream(fout13);
		    BufferedWriter bw13 = new BufferedWriter(new OutputStreamWriter(fos13));		
			//
			//
			File fout2 = new File("mutant2.java");
		    FileOutputStream fos2 = new FileOutputStream(fout2);
		    BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(fos2));

			File fout22 = new File("mutant22.java");
		    FileOutputStream fos22 = new FileOutputStream(fout22);
		    BufferedWriter bw22 = new BufferedWriter(new OutputStreamWriter(fos22));

			File fout23 = new File("mutant23.java");
		    FileOutputStream fos23 = new FileOutputStream(fout23);
		    BufferedWriter bw23 = new BufferedWriter(new OutputStreamWriter(fos23));					
			//
			//
			File fout3 = new File("mutant3.java");
		    FileOutputStream fos3 = new FileOutputStream(fout3);
		    BufferedWriter bw3 = new BufferedWriter(new OutputStreamWriter(fos3));

			File fout32 = new File("mutant32.java");
		    FileOutputStream fos32 = new FileOutputStream(fout32);
		    BufferedWriter bw32 = new BufferedWriter(new OutputStreamWriter(fos32));

			File fout33 = new File("mutant33.java");
		    FileOutputStream fos33 = new FileOutputStream(fout33);
		    BufferedWriter bw33 = new BufferedWriter(new OutputStreamWriter(fos33));
			
			
			//
			//
			File fout4 = new File("mutant4.java");
		    FileOutputStream fos4 = new FileOutputStream(fout4);
		    BufferedWriter bw4 = new BufferedWriter(new OutputStreamWriter(fos4));	
			
			File fout42 = new File("mutant42.java");
		    FileOutputStream fos42 = new FileOutputStream(fout42);
		    BufferedWriter bw42 = new BufferedWriter(new OutputStreamWriter(fos42));	
			
			File fout43 = new File("mutant43.java");
		    FileOutputStream fos43 = new FileOutputStream(fout43);
		    BufferedWriter bw43 = new BufferedWriter(new OutputStreamWriter(fos43));	
			//
			

			while (scanner.hasNextLine()) {
				String myline = scanner.nextLine();

				bw0.write(myline);bw0.write("\n");
				
			    if (count == Integer.parseInt(matrix[0][0])) {				
					bw1.write("        int sum = n1 - n2;");bw1.write("\n");
					bw12.write("        int sum = n1 * n2;");bw12.write("\n");
					bw13.write("        int sum = n1 / n2;");bw13.write("\n");				
				} 
				else {
					bw1.write(myline);bw1.write("\n"); 
					bw12.write(myline);bw12.write("\n"); 
					bw13.write(myline);bw13.write("\n"); 
				}

			    if (count == Integer.parseInt(matrix[1][0])) {				
					bw2.write("        int difference = n1 + n2;");bw2.write("\n");
					bw22.write("        int difference = n1 * n2;");bw22.write("\n");
					bw23.write("        int difference = n1 / n2;");bw23.write("\n");
				} 
				else {
					bw2.write(myline);bw2.write("\n"); 
					bw22.write(myline);bw22.write("\n");
					bw23.write(myline);bw23.write("\n");
				}				

			    if (count == Integer.parseInt(matrix[2][0])) {				
					bw3.write("        int product = n1 + n2;");bw3.write("\n");
					bw32.write("        int product = n1 - n2;");bw32.write("\n");
					bw33.write("        int product = n1 / n2;");bw33.write("\n");
				} 
				else {
					bw3.write(myline);bw3.write("\n"); 
					bw32.write(myline);bw32.write("\n");
					bw33.write(myline);bw33.write("\n");
				}	

			    if (count == Integer.parseInt(matrix[3][0])) {				
					bw4.write("        int quot = n1 * n2;");bw4.write("\n");
					bw42.write("        int quot = n1 + n2;");bw42.write("\n");
					bw43.write("        int quot = n1 - n2;");bw43.write("\n");
				} 
				else {
					bw4.write(myline);bw4.write("\n");
					bw42.write(myline);bw42.write("\n"); 
					bw43.write(myline);bw43.write("\n");				
				}					
				
			
				count++;
			}
			
			bw0.close();
			bw1.close();
			bw12.close();
			bw13.close();
			bw2.close();
			bw22.close();
			bw23.close();
			bw3.close();
			bw32.close();
			bw33.close();
			bw4.close();
			bw42.close();
			bw43.close();
			
		}
		catch (IOException e) {
				  // Problem when writing to the file
		  e.printStackTrace();
		}
	}
}
