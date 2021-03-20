package chapter_3.subsection_369;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder mySentence = new StringBuilder();

        mySentence.append("Co ");
        mySentence.append("się dzieje z ");
        mySentence.append(12);
        mySentence.append(" szklankami");

        String completSentence = mySentence.toString();
        System.out.println(completSentence);
        System.out.println(completSentence.length());

        int lengthInStringBuilder = mySentence.length();
        System.out.println(lengthInStringBuilder);

        mySentence.setCharAt(0, 'e');
        System.out.println(mySentence); // różnica w mySentence, a completSentence nic nie jest zmienione z uwagi że jest to inny obiekt
        System.out.println(completSentence);


    }
}
