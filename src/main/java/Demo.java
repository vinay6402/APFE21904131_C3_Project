
import java.time.LocalTime;

public class Demo {
    public static void main(String [] args) throws restaurantNotFoundException {

        RestaurantService service = new RestaurantService();
        Restaurant restaurant1 = service.addRestaurant("Sarovar Royle", "Davangere", LocalTime.parse("10:30:00"), LocalTime.parse("22:00:00"));

        System.out.println(service.findRestaurantByName("Sarovar Royle"));
    }
}


