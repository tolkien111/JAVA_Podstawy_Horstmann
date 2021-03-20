package chapter_3.subsection_373;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class ZapisOdczytDoPlikow {

    public static void main(String[] args) throws IOException {

//        File file = new File("input.txt");

        Scanner in = new Scanner(Path.of
                ("C:\\Users\\kamil\\IdeaProjects\\JAVA_Podstawy_Horstmann\\src\\main\\java\\chapter_3\\subsection_373\\przyklad.txt"),
                StandardCharsets.UTF_8);

        PrintWriter out = new PrintWriter("C:\\Users\\kamil\\IdeaProjects\\JAVA_Podstawy_Horstmann\\src\\main\\java\\chapter_3\\subsection_373\\przyklad.txt");
        out.println("Co się dzieje");
        out.println("W Państwie Polskim");
        out.close();

    }
}
