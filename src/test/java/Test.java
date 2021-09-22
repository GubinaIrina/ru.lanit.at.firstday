import somepackage.Other;
import somepackage.Some;

public class Test {
    public static void main(String[] args) {
        Some someText = new Some("текст");

        System.out.println(someText.getSecret(false));

        someText.setNoMoreSecrets("какой-то текст");

        System.out.println(someText.getДаТакТожеМожно());

        someText.soTellMeAboutInterfaces();

        System.out.println(someText.toString());


    }
}
