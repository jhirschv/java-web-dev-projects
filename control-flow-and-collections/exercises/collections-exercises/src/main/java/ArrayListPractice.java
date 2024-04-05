import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> allNums = new ArrayList<>();
        allNums.add(5);
        allNums.add(2);
        allNums.add(5);
        allNums.add(4);
        allNums.add(5);
        //int sum = sumEven(allNums);
        //System.out.print(sum);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of letters: ");
        int numOfLetters = input.nextInt();
        input.nextLine();

        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("catch");
        words.add("dog");
        words.add("mat");
        words.add("seven");
        ArrayList<String> selectedNumOfLetterWords = returnFiveLetterWords(words, numOfLetters);
        System.out.print(selectedNumOfLetterWords);
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer num : arr) {
            if(num % 2 == 0) {
                sum += num;
            }
        } return sum;
    }
    public static ArrayList<String> returnFiveLetterWords(ArrayList<String> arr, int numOfLetters){
        ArrayList<String> words = new ArrayList<>();
        for(String word : arr) {
            if(word.length() == numOfLetters) {
                words.add(word);
            }
        } return words;
    }

}
