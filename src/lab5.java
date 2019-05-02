import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        List<City.InnerClass> list = new ArrayList<>();

        System.out.println("input data or just enter to exit");
        System.out.println("1 -- avenue\n2 -- area\n3 -- street");
        String line = sc.nextLine();
        while (!line.isEmpty()){
            String[] arr = line.split(" ");
            try {
                if (Integer.parseInt(arr[1]) > 3 || Integer.parseInt(arr[1]) < 1){
                    throw new IllegalArgumentException();
                }
                list.add(new City.InnerClass(arr[0], Integer.parseInt(arr[1])));
            }
            catch (Exception e){
                e.printStackTrace();
                return;
            }
            line = sc.nextLine();
        }
        City toponims = new City(list);
        System.out.println(toponims);
    }
}
