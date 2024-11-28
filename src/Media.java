import java.util.ArrayList;

public class Media {
    public static void main(String[] args) {
        int suma = 0;
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(5);
        nums.add(5);

        for (int i = 0; i < nums.size(); i++) {
            suma += nums.get(i);
        }

        System.out.println(suma/nums.size());
    }
}
