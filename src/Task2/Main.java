package Task2;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
            File f = new File("D:\\Course\\Java Professional Course\\Java Professional Student\\" +
                    "003_IO_and_Strings\\003_Samples\\src\\com\\itvdn\\javaProfessional\\ex_002_file\\fileInfo");
            pw.println();
            pw.println("Файл \"" + f.getName() + "\" " + (f.exists() ? "" : "не ") + "существует");
            pw.println("Вы " + (f.canRead() ? "" : "не ") + "можете читать файл");
            pw.println("Вы " + (f.canWrite() ? "" : "нe ") + "можете записывать в файл");
            pw.println("Длина файла " + f.length() + " б");
            pw.println();
//            File d = new File("C:/Windows");
//            pw.println("Содержимое каталога:");
//            if (d.exists() && d.isDirectory()) {
//                String[] s = d.list();
//                for (int i = 0; i < s.length; i++)
//                    pw.println(s[i]);
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
