import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Function<String, List<String>> funcStringToVocab = (String str) -> {
            return Arrays.stream(str.split(" "))
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
        };

        //исходный текст сообщения местного жителя
        String input = "кошка зашла на кухню зашла кошка";

        //применяем написанную функцию к исходному тексту сообщения местного жителя
        List<String> vocabularyList = funcStringToVocab.apply(input);
        vocabularyList.forEach(System.out::println);

    }

}
