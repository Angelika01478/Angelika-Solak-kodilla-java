package stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {

    private static int sID=0;
    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPushedPosts;

    public ForumUser(String userName, char sex, LocalDate dateOfBirth, int numberOfPushedPosts) {
        sID++;
        ID=sID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPushedPosts = numberOfPushedPosts;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPushedPosts() {
        return numberOfPushedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPushedPosts=" + numberOfPushedPosts +
                '}';
    }
}
