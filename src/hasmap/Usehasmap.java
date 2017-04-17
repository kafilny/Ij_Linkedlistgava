package hasmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kafiluddin on 4/15/17.
 */
public class Usehasmap {
    public static void main(String[] args) {

        Map<String, String> citylist = new HashMap<String, String>();
        citylist.put("canada", "ontario");
        citylist.put("usa", "ny");
        citylist.put("uk", "london");
        citylist.put("bd", "dhaka");
        System.out.println(citylist.get("bd"));
       // for(Map.Entry map:citylist.entrySet()){
         //   System.out.println(map.getKey()+ " " + map.getValue());

        }
    }


