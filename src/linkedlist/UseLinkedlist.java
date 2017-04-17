package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kafiluddin on 4/15/17.
 */
public class UseLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of state name: ");
        int statenumber=input.nextInt();
        Scanner sca = new Scanner(System.in);
        for(int i=0;i<statenumber;i++) {
            System.out.println("enter state name");
            String statename = sca.nextLine();
            list.add(statename);
        }
       //iterator it
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println("State name are: "+it.next());
        }
        //for each loop
        //for(String.statename:list){
           // System.out.println();

        }
    }

