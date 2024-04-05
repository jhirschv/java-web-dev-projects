import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class HashMapExercise {

    public static void main(String[] args) {
        HashMap<String,Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter Students name: ");
            name = input.nextLine();
            if(!name.equals("")) {
                System.out.println("Enter Students id: ");
                Integer id = input.nextInt();
                input.nextLine();
                students.put(name, id);
            }

        } while (!name.equals(""));
        System.out.println("Class roster: ");
        for(Map.Entry<String,Integer> student : students.entrySet()) {
            System.out.println("Student: "+student.getKey()+" Id:"+student.getValue());
        }
    }


}
