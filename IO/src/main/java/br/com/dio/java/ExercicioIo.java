package br.com.dio.java;


import java.io.*;

public class ExercicioIo {

    public static void receberTecladoImprimirConsole() throws IOException {
        System.out.println("Digite 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
        receberTecladoImprimirConsole();
    }

}