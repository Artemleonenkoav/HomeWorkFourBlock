// Разбить эту строку на подстроки и вывести на экран каждое предложения с новой строки.

package Task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
          
            int c = 0;
            pw.println("Посимвольный ввод:");
            while ((c = br.read()) != -1)
                pw.println((char) c);
            pw.println("Построчный ввод:");
            String s;
            do {
                s = br.readLine();
                pw.println(s);
            } while (!s.equals("q"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

