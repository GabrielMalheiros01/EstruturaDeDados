//import da biblioteca que ler arquivos
import java.io.File;
//biblioteca para tratamento de arquivos
import java.io.FileNotFoundException;
//biblioteca para utilizar o scanner
import java.util.Scanner;

//class para ler o arquivo csv
public class programa_csv{
	
	//metodo main para rodar o java
	public static void main(String[] args){
		
		// objeto do tipo File para abrir o arquivo csv
		File arquivoCSV = new File("C:\\Users\\Bill\\Desktop\\programação\\java\\Estrutura\\trabalho\\parte1\\grupo_1.csv");
		
		//tratamento de erros caso o arquivo apresente erros
		try{
			
			//objeto que irar armazenar as informações do arquivo 
			String linhasDoArquivo = new String();
			//objeto leitor que irar ler o arquivo
			Scanner leitor = new Scanner(arquivoCSV);
			
			//a primeira variavel do arquivo é um "X", logo irei pular ele e ler os proximos 1000 numeros
			leitor.nextLine();
			
			//loop para ler o arquivo até o final
			while(leitor.hasNext()){
				
				//o objeto linhasDoArquivo irar receber o scanner linha apos linha para ser exibido no print
				linhasDoArquivo = leitor.nextLine();
				
				System.out.println(linhasDoArquivo);
			}
			
		}catch(FileNotFoundException e){
			
		}
	}
}