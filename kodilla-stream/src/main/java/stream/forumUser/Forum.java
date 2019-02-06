package stream.forumUser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUsers= new ArrayList<>();

    public Forum(){
        theForumUsers.add(new ForumUser("John0147", 'M', LocalDate.of(1986,5,10),6));
        theForumUsers.add(new ForumUser("Tom223", 'M', LocalDate.of(1996,1,5),1));
        theForumUsers.add(new ForumUser("Kris98", 'M', LocalDate.of(1978,12,21),5));
        theForumUsers.add(new ForumUser("Caroll87", 'F', LocalDate.of(1991,11,10),47));
        theForumUsers.add(new ForumUser("Miriam", 'F', LocalDate.of(1990,2,1),3));
        theForumUsers.add(new ForumUser("Tom478", 'M', LocalDate.of(1974,5,15),8));
        theForumUsers.add(new ForumUser("KateVatirrs", 'F', LocalDate.of(1965,6,16),5));
        theForumUsers.add(new ForumUser("Powers", 'F', LocalDate.of(1977,1,18),15));
        theForumUsers.add(new ForumUser("Velba15", 'M', LocalDate.of(2005,11,19),26));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUsers);
    }

}
