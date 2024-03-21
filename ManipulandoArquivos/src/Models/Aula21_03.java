package Models;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Aula21_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Aula Ive
		
		// Escrevendo em um arquivo de texto;
		writeToFile("fileData.txt", "Olá, mundo!");
		
		// Lendo de um arquivo de texto;
		String content = readFromFile("fileData.txt");
		System.out.println("Conteúdo lido do arquivo: " + content);
		
		
	}



	private static void writeToFile(String fileName, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(content);
			System.out.println("Conteúdo escrito no arquivo com sucesso.");
		} catch (Exception e) {
			System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
		
	}

	
	
	
	
	private static String readFromFile(String fileName) {

		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			/*
			 * Executar o loop de repetição enquanto a vaiável lida no arquivo for
			 * Diferente do nulo
			 */
			// Escreve o conteúdo na variável
			
			while ((line = reader.readLine()) != null) {
			content.append(line).append("\n");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		
		return content.toString();
	}
	
	
}
