package br.com.dio.java;


import java.io.*;

public class ExercicioIo3 {

    public static void copiarArquivo() throws IOException {

        File f = new File("F:\\Documentos\\aulasjava\\dio-java\\DIO-java\\IO\\recomendacoes.txt");
        String nameArquivo = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine();

        String nomeArquivoCopia = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nomeArquivoCopia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while(!(line == null));

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende mais 3 filmes: ");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        pw.printf("Fim!");

        br.close();
        bw.close();
        pw.close();


    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(!(line.isEmpty()));

        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        copiarArquivo();
    }

}