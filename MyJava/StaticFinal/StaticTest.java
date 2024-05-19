class HondaCity{
    static long price=10;
    int a,b;
    static double OnRoadPrice(String city){
        switch(city){
            case "Delhi":
                return price+price*0.1;
            case "Mumbai":
                return price+price*0.09;
            default:
                return 0;
        }
    }
}
public class StaticTest {
    public static void main(String args[]){
        System.out.println(HondaCity.OnRoadPrice("Delhi"));
        System.out.println(HondaCity.OnRoadPrice("Mumbai"));
        System.out.println(HondaCity.OnRoadPrice("Bihar"));
    }
    
}
