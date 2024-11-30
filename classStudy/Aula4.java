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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ClasseSystemInFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		//Caso não exista throws FileNotFoundException
		InputStream arquivo = new FileInputStream("teste.txt");
		
		System.setIn(arquivo);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("nome: " + scan.nextLine());
		System.out.println("nome: " + scan.nextLine());
		System.out.println("nome: " + scan.nextLine());
		
	}
}

------------------------------------------------------------------------------------------------------------
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteHashNext 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File arquivo = new File("teste.txt");
		Scanner scan = new Scanner(arquivo);
		
		while(scan.hasNext()) //confere se tem a proxima linha
		{
			System.out.println("nome: " + scan.nextLine());// printa a string da proxline
		}
	}
}

