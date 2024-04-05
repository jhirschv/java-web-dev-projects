public class Array {
    public static void main(String[] args) {
        int[] someInts = {1,1,2,3,5,8};
        for(int num : someInts) {
            if(num % 2 != 0) {
                System.out.print(num);
            }
        }
        System.out.println();
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");

        for(String word : words) {
            System.out.print(word + " :) ");
        }

    }
}
