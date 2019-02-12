package stream.portfolio;

public final class User {

    private final String userName;
    private final String realName;


    public User(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }


    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        return realName != null ? realName.equals(user.realName) : user.realName == null;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
