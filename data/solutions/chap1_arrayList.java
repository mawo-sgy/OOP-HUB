import java.util.ArrayList;
import java.util.List;

public class chap1_arrayList{
    public static void main(String[] args){

        /* ====== TASK 1 ArrayList with Integer ====== */

        // 1. Creates an arrayList of students from tab
        int[] tab = {17, 18, 19, 17, 20, 22, 24};

        ArrayList<Integer> std_ages = new ArrayList<>();

        for(int age : tab){
            std_ages.add(age);
        }

        // 2. Add two new elements
        std_ages.add(21);
        std_ages.add(20);

        // 3. Display elements at 3 and 10 positions
        System.out.println("Position 3: " + std_ages.get(2));
        try {
            System.out.println("Position 10: " + std_ages.get(9));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Position 10: Index out of bound!");
        }
            // A message out of bound is displayed

        // 4. Update the element at the 3rd position
        std_ages.set(2, 20);
        System.out.println("Updated Position 3: " + std_ages.get(2));

        // 5. Insert at the 2nd position
        std_ages.add(1, 23);

        // 6. Create a copy of the list
        ArrayList<Integer> std_ages_copy = (ArrayList<Integer>) std_ages.clone();

        // 7. Delete the element at the 4th position
        std_ages.remove(3);

        // 8. Delete 17
        std_ages.removeIf(age -> age == 17);
        System.out.println("New list size after deleting 17: " + std_ages.size());

        // 9. Create an arrayList of kids ages
        ArrayList<Integer> kids_ages = new ArrayList<>();
        int[] tab2 = {5, 4, 7, 4, 8};

        for(int age : tab2){
            kids_ages.add(age);
        }

        // 10. Put both lists into a new one
        ArrayList<Integer> people = new ArrayList<>();
        people.addAll(std_ages);
        people.addAll(kids_ages);

        // 11. Between 3rd and 8th position
        List<Integer> sub = people.subList(2, 8);
        System.out.println(sub);

    }
}