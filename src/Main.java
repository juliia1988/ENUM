import java.lang.reflect.Array;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Завдання номер 1: enum для колоди гральних карт");
        CardRank card1 = CardRank.ACE;
        CardRank card2 = CardRank.KING;
        System.out.println("-- Виводжу цифрове значення для константи ACE: " + card1.getCardNumber());
        System.out.println("-- Виводжу цифрове значення для константи KING: " + card2.getCardNumber());

        String sentence = "I would like to have a dog";
        System.out.println("Завдання 2: Порахувати скільки разів в реченні зустрічаються голосні");
        char[] sentenceCharArray = sentence.toCharArray();
        char cs1 = 'a' ;
        char cs2 = 'o' ;
        char cs3 = 'u' ;
        char cs4 = 'i' ;
        char cs5 = 'e' ;
        int countChar1 = 0;
        int countChar2 = 0;
        int countChar3 = 0;
        int countChar4 = 0;
        int countChar5 = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentenceCharArray[i] == cs1) {
                countChar1++;
            } else if (sentenceCharArray[i] == cs2) {
                countChar2++;
            } else if (sentenceCharArray[i] == cs3) {
                countChar3++;
            } else if (sentenceCharArray[i] == cs4) {
                countChar4++;
            } else if (sentenceCharArray[i] == cs5) {
                countChar5++;
            }
        }
        int sumChar = countChar1 + countChar2 +countChar3 + countChar4 + countChar5;

        System.out.println("-- В реченні -a- зустрічається: " + countChar1 + " раз");
        System.out.println("-- В реченні -o- зустрічається: " + countChar2 + " раз");
        System.out.println("-- В реченні -u- зустрічається: " + countChar3 + " раз");
        System.out.println("-- В реченні -i- зустрічається: " + countChar4 + " раз");
        System.out.println("-- В реченні -e- зустрічається: " + countChar5 + " раз");
        System.out.println("-- Загалом в реченні зустрічається: " + sumChar + " голосних");

        System.out.println("Завдання 3: розділіть рядок на масив слів за допомогою пробіла яе роздільника");
        String[] stringArray = sentence.split(" ");
        System.out.println("-- Виводжу з массиву слів слово під індексом 1:  " + stringArray[1]);

        System.out.println("Завдання 4: рвивести на консоль перщі 3 символи першого слова");
        System.out.println("-- Відповідь: " + stringArray[1].substring(0,3));

        System.out.println("Завдання 5: замыныть dog на cat");
        System.out.println("-- Відповідь: " + sentence.replace("dog", "cat"));

        System.out.println("Завдання 6: створити StringBuilder та висести у консоль в upper case");
        StringBuilder stringBuilder = new StringBuilder(sentence);
        System.out.println("-- Відповідь: " + stringBuilder.toString().toUpperCase(Locale.ROOT));


    }

}
