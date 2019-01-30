package com.kodilla.testing.testLearning;

import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class KlasaTestowa {
    public static void main(String[] args) {

        ForumUser forumUser = new ForumUser("Janek0147", "Jan Kowalski");


     /*   ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

      //  for(Integer el : list){
        //    System.out.println(el);
      //  }

        //System.out.println(list);

        ArrayList<ForumUser> fu = new ArrayList<>();
        ForumUser user1 = new ForumUser("Janek0147", "Jan Kowalski");
        ForumUser user2 = new ForumUser("Patryk", "Patryk Kot");
        ForumUser user3 = new ForumUser("Fieldon", "Robert Nowak");
        ForumUser user4 = new ForumUser("Jsuek", "Justyna Syek");
        fu.add(user1);
        fu.add(user2);
        fu.add(user3);
        fu.add(user4);
        //System.out.println(fu);

        ArrayList <ForumUser> fu2 = new ArrayList<>();
        fu2.add(new ForumUser("Janek0147", "Jan Kowalski"));
        fu2.add(new ForumUser("Patryk", "Patryk Kot"));
        fu2.add(new ForumUser("Fieldon", "Robert Nowak"));
        fu2.add(new ForumUser("Jsuek2", "Justyna Syek"));





        boolean contains = fu2.containsAll(fu) && fu.containsAll(fu2);
       // System.out.println(contains);


        boolean testowo=true;
        if(fu.size()==fu2.size()) {


            Collections.sort(fu);
            System.out.println(fu.toString());

            Collections.sort(fu2);
            System.out.println(fu2.toString());

            for(int i=0; i<fu.size();i++){
                if(!fu.get(i).toString().equals(fu2.get(i).toString())){
                    System.out.println(fu.get(i) + " vs " + fu2.get(i));
                    testowo= false;
                    break;

                }
            }
        }

*/


        System.out.println(KlasaTestowa.class);
        System.out.println(ForumUser.class);
        System.out.println(forumUser.getClass().toString());
        System.out.println(forumUser.getClass());
    }


}
