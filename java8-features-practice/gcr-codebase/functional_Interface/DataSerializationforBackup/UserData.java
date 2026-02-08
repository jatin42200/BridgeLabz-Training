package DataSerializationforBackup;

import java.io.Serializable;

public class UserData implements Backupable, Serializable{
	private String username;
    private int age;

    public UserData(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String toString() {
        return username + " - " + age;
    }
}
