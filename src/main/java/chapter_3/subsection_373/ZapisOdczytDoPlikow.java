package chapter_3.subsection_373;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class ZapisOdczytDoPlikow {

    public static void main(String[] args) throws IOException {

//        PrintWriter out = new PrintWriter("C:\\Users\\kamil\\IdeaProjects\\JAVA_Podstawy_Horstmann\\src\\main\\java\\chapter_3\\subsection_373\\przyklad.txt");
//        out.println("Co się dzieje");
//        out.println("W Państwie Polskim");
//        out.close();                      //wykomentowane bo już dodałem ten wpis do pliku

        Scanner in = new Scanner(Path.of
                ("C:\\Users\\kamil\\IdeaProjects\\JAVA_Podstawy_Horstmann\\src\\main\\java\\chapter_3\\subsection_373\\przyklad.txt"),
                StandardCharsets.UTF_8);
        System.out.println(in.nextLine());
        System.out.println(in.nextLine());
    }
}
