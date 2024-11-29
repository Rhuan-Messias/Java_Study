import java.io.*;
// Escreve no arquivo
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

-------------------------------------------------------------------------------------------------------
import java.util.Scanner;
//Le no console

public class ClasseSystemInOut 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");// system só importado dentro do main
		
		String nome = scan.nextLine();// le a proxima linha inteira de string
		System.out.println("Seu nome é: " + nome);
	}
	
}

--------------------------------------------------------------------------------------------------------
//Le no arquivo
	
