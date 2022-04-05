import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class proString {
    public static void main(String[] args) {

        String str1 = "Lorem 12 Ipsum text 34 is simply 56 dummy text";
        char[] strToChar = str1.toCharArray();

//        1	Четные и нечетные символы разделить по разным строкам
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if (strToChar[i] % 2 == 0 ) {
                sbEven.append(str1.charAt(i) );
            } else {
                sbOdd.append(str1.charAt(i) );
            }
        }

        System.out.println("Начальная строка: " + str1);
        System.out.println("Четные символы: " + sbEven);
        System.out.println("Нечетные символы: " + sbOdd);

//        2	Количество цифр в строке
        int digitCounter = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (strToChar[i] >= 48 && strToChar[i] <= 57 ) {
                digitCounter++;
            }
        }
        System.out.println("Количество цифр в строке: " + digitCounter);

//        3	Вводится строка из букв и цифр, построить новую только из цифр
        StringBuilder sbOnlyDigits = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if (strToChar[i] >= 48 && strToChar[i] <= 57 ) {
                sbOnlyDigits.append(str1.charAt(i) );
            }
        }
        System.out.println("Строка только из цифр: " + sbOnlyDigits);

//        4	Удаление одинаковых символов
        String deleteCharFromString = str1.replaceAll("([m])", "");
        System.out.println("Строка без буквы 'm': " + deleteCharFromString);

//        5	Частота встречаемости символа в строке
        int letterCounter = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (strToChar[i] == 'm' ) {
                letterCounter++;
            }
        }
        System.out.println("Количество букв 'm': " + letterCounter);

//        6	Переворот строки
        StringBuilder strToReverse = new StringBuilder(str1);
        strToReverse.reverse();
        System.out.println("Перевернутая строка: " + strToReverse);

//        7	Количество вхождений подстроки в строку
        String substr = "text";
        Pattern pattern = Pattern.compile(substr);
        Matcher matcher = pattern.matcher(str1);
        int substrCounter = 0;
        while(matcher.find() ) {
            substrCounter++;
        }
        System.out.println("Количество вхождений слова 'text': " + substrCounter);

//        8	Вывести слова строки в обратном порядке
        StringBuilder reversedWordsInString = new StringBuilder();
        String[] words = str1.split(" ");

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedWordsInString.append(reversedWord + " ");
        }
        System.out.println("Перевернутые слова в том же порядке: " + reversedWordsInString.toString().trim() );

        StringBuilder reversedPositionOfWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedPositionOfWords.append(words[i] + " ");
        }
        System.out.println("Слова в обратном порядке: " + reversedPositionOfWords.toString().trim() );

//        9	Сортировка массива строк по алфавиту
        String[] wordsForSort = str1.split(" ");
        Arrays.sort(wordsForSort, String.CASE_INSENSITIVE_ORDER);
        System.out.println("В алфавитном порядке: " + Arrays.toString(wordsForSort) );

//        10	Определить длину самого короткого слова в строке
        int shortest = 30; // подразумеваем, что есть слово короче данного значения
        String[] shortestWord = str1.split(" ");
        for (String word : shortestWord) {
            int wordMinLength = word.length();
            if (wordMinLength < shortest ){
                shortest = wordMinLength;
            }
        }
        System.out.println("Длина самого короткого слова: " + shortest);

//        11	Подсчет количества слов в строке
        String[] wordsQuantity = str1.split("\\d");
        System.out.println("Количество слов в строке (не чисел): " + wordsQuantity.length + " - ");

//        12	Добавление пробелов в строку
        StringBuilder addWhitespaces = new StringBuilder(str1);
        addWhitespaces.insert(2," ");
        System.out.println("Добавлен пробел на 2 позицию: " + addWhitespaces);

//        13	Является ли строка палиндром?
        String str2 = "я ем змея";

        String withoutWhitespaces = str2.replaceAll(" ", "");
        StringBuilder checkPalindrome = new StringBuilder(withoutWhitespaces.toLowerCase() ).reverse();

        if (withoutWhitespaces.equals(checkPalindrome.toString() ) ) {
            System.out.println("Проверили: " + str2 + " - палиндром.");
        } else {
            System.out.println("Проверили: " + str2 + " - не палиндром.");
        }

//        14	Замена подстроки в строке
        String changeText = str1.replaceAll("text", "digit");
        System.out.println(changeText);

//        15	Расстояние между подстроками
//        Гарантируется, что 2 слова есть в строке

        String substr1 = "Lorem";
        String substr2 = "Ipsum";
        char[] strFull = str1.toCharArray();
        char[] strA = substr1.toCharArray();
        char[] strB = substr2.toCharArray();

        int counterA = 0;
        int counterB = 0;
        int pointA = 0;
        int pointB = 0;

        for (int i = 0; i < strFull.length - strA.length; i++) {
            if (strFull[i] == strA[counterA]) {
                counterA++;
                if (counterA == strA.length) {
                    pointA = i;
                    break;
                }
            }
        }
        for (int j = 0; j < strFull.length - strB.length; j++) {
            if (strFull[j] == strB[counterB]) {
                counterB++;
                if (counterB == strB.length) {
                    pointB = j - strB.length;
                    break;
                }
            }
        }

        System.out.println("Расстояние между " + substr1 + " и " + substr2 + " = "
                + (pointB - pointA) + " символа(-ов)");
    }
}

