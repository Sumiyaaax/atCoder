import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    // B - Guidebook
    // https://atcoder.jp/contests/abc128/tasks/abc128_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Restaurant> restaurantList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            restaurantList.add(new Restaurant(i + 1, sc.next(), sc.nextInt()));
        }
        sc.close();
        // List<Restaurant> sortedRestaurants = restaurantList.stream()
        // .sorted(Comparator.comparing(Restaurant::city))
        // .thenComparing(Restaurant::rate).reversed();
        // for(Restaurant restaurant : sortedRestaurants) {
        //     System.out.println(restaurant.getNo());
        // }
        restaurantList.stream().sorted((r1, r2) -> {
            if(r1.city.compareTo(r2.city) != 0) {
                return r1.city.compareTo(r2.city);
            }
            return (r2.rate - r1.rate);
        }).forEach(r -> System.out.println(r.no));
    }

    static class Restaurant {
        int no;
        String city;
        int rate;
        public Restaurant(int no, String city, int rate) {
            this.no = no;
            this.city = city;
            this.rate = rate;
        }
        public String getCity() {
            return this.city;
        }
        public int getRate() {
            return this.rate;
        }
        public int getNo() {
            return this.no;
        }
    }
} 
