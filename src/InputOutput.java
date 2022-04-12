import java.io.*;
import java.util.Arrays;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        File file = new File("src/inputFile.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file) ) ) {
            StringBuilder sb = new StringBuilder();

            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line + " ");
            }
            String text = sb.toString();
            System.out.println("\nсчитали из файла:");
            System.out.println(text);

//  String text = String.join(" ", Files.readAllLines(file.toPath())); // возможно с Java 11

//  оставим только слова без знаков препинаний
            System.out.println("\nслова без знаков препинаний:");
            String onlyWords = text.replaceAll("[(,!-:—)«»]", "");
            System.out.println(onlyWords);

//  Сортировка массива строк по алфавиту
            System.out.println("\nслова по алфавиту:");
            String[] allWords = onlyWords.split("\\s+");
            Arrays.sort(allWords, String.CASE_INSENSITIVE_ORDER);
            System.out.println(Arrays.toString(allWords));

//  запишем в новый файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/newFile.txt") ) ) {
                writer.write(Arrays.toString(allWords));

                System.out.println("\nзаписали в новый файл.");

            } catch (IOException e) {
                System.out.println("Тут исключение Writer!");
                e.getMessage();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.getMessage();
        }
    }
}
