package br.com.dio.java;


import java.io.*;

public class ExercicioIo2 {

    public static void lerTecladoEscreverDoc() throws IOException {
        System.out.println("Digite 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        File f = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line.isEmpty()));
        bw.flush();

        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        lerTecladoEscreverDoc();
    }

}