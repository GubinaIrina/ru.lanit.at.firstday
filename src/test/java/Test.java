
import somepackage.Other;
import somepackage.Some;
import somethinggreen.AnnotationForExaple;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Some someText = new Some("текст");

        Class<?> cls = someText.getClass();

        Method defaultDesc = AnnotationForExaple.class.getDeclaredMethod("description");
        Object defDesc = defaultDesc.getDefaultValue();
        System.out.println(defDesc);

        String description = cls.getAnnotation(AnnotationForExaple.class).description();
        System.out.println(description);

        System.out.println(someText.getSecret(false));

        someText.setNoMoreSecrets("какой-то текст");

        System.out.println(someText.getДаТакТожеМожно());

        someText.soTellMeAboutInterfaces();

        System.out.println(someText.toString());

        System.out.println(someText.getNoMoreSecrets());

        System.out.println(someText.getSecret());

        Other.saySomthing();
    }
}
