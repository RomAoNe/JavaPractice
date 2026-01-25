package TrainingTasks.StreamApi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceLetter {
    public static void main(String[] args) {
        replaceLetter();
    }

    public static void replaceLetter() {
        String company = "OстОн";
        String aston = Stream.of(company)
                .map(x -> x.replace("O", "A"))
                .collect(Collectors.joining());
        System.out.println(aston);
    }

}
