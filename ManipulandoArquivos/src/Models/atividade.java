package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double tabuada;
        String msg;

        System.out.println("A tabuada será de qual número? ");
        int num = sc.nextInt();

        System.out.println("Quantos itens você quer?");
        int itens = sc.nextInt();

        System.out.println("Tabuada do " + num);
        for (int i = 1; i <= itens; i++) {
            tabuada = num * i;
            msg = num + " x " + i + " = " + tabuada;

            writeToFile("FileData.txt", msg);
            
        }

        String content = readFromFile("FileData.txt");
        System.out.println("Conteúdo lido do arquivo: " + content);
        sc.close();
    }

    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content + "\n");

        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

    }

    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return content.toString();


    }

}
