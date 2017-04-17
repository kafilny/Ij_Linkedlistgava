package hasmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kafiluddin on 4/15/17.
 */
public class Usehasmapuse {
    public static void main(String[] args) {
        List<String> cityofusa = new ArrayList<String>();
        cityofusa.add("ny");
        cityofusa.add("nj");
        cityofusa.add("dc");
        cityofusa.add("ca");

        List<String> cityofbd = new ArrayList<String>();
        cityofbd.add("dhaka");
        cityofbd.add("ctg");
        cityofbd.add("raj");
        cityofbd.add("sylhet");

        List<String> cityofuk = new ArrayList<String>();
        cityofuk.add("london");
        cityofuk.add("yorkshare");
        cityofuk.add("hampshare");
        cityofuk.add("east midland");


        Map<String, List<String>> citylist = new HashMap<String, List<String>>();
        citylist.put("usa", cityofusa);
        citylist.put("bd", cityofbd);
        citylist.put("uk", cityofuk);

        // System.out.println(citylist.get("usa"));
        for (Map.Entry<String,List<String>> map : citylist.entrySet()) {
            List<String> citName=map.getValue();
           // System.out.println(map.getKey());
           /*
            for(String city:citName){
                System.out.print(" " + city);
            }
            System.out.println();
           */

            System.out.println(map.getKey()+" "+map.getValue());

           // System.out.println(map.getKey() + " " + map.getValue());

        }


    }
}
