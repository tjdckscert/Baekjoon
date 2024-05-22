import java.util.*;

public class Main {
    static int[] building;
    static int n;
    static int sum;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        building = new int[n];
        for (int i = 0; i < n; i++) building[i] = sc.nextInt();
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum  = Math.max(checkSee(i),sum);
        }
        System.out.println(sum);
    }

    public static int checkSee(int buildingNumber) {
        double max = 0;
        int count = 0;
        for (int i = buildingNumber-1; i >= 0; i--) {
            double result = (double) (building[buildingNumber] - building[i]) / (buildingNumber - i);
            if ( result < max  || i == buildingNumber-1) {
                max = result;
                count++;
            }
        }
        max = 0;
        for (int i = buildingNumber+1; i < n; i++) {
            double result = (double) (building[buildingNumber] - building[i]) / (buildingNumber - i);
            if ( result > max || i == buildingNumber+1) {
                max = result;
                count++;
            }
        }
        return count;
    }
}