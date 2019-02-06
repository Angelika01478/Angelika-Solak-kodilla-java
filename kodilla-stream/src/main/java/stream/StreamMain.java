package stream;

import stream.book.BookDirectory;
import stream.forumUser.Forum;
import stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theSpecialForumUsers = forum.getUserList().stream()
                .filter(forumUser->forumUser.getSex()=='M')
                .filter(forumUser -> LocalDate.now().getYear() -  forumUser.getDateOfBirth().getYear() > 19)
                .filter(forumUser -> forumUser.getNumberOfPushedPosts()>0)
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

     theSpecialForumUsers.entrySet().stream()
                            .map(entry-> entry.getKey() + " : " + entry.getValue().toString())
                            .forEach(System.out::println);


    }
}
