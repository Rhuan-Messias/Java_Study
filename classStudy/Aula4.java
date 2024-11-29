import java.io.*;

public class ClasseSystemOutFile 
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		File arquivo = new File("teste.txt");
		FileOutputStream stream = new FileOutputStream(arquivo);
		PrintStream escreveNoArquivo = new PrintStream(stream);
		
		System.setOut(escreveNoArquivo);
		System.out.println("Dory");
		System.out.println("Coraline");
	}
	
}
