package DataSerializationforBackup;

public class BackupService {
	public static void processBackup(Object obj) {

        if (obj instanceof Backupable) {
            System.out.println("Object eligible for backup: " + obj);
            
        } else {
            System.out.println("Object NOT eligible for backup");
        }
    }

    public static void main(String[] args) {

        UserData user = new UserData("Harshdeep", 22);
        TempSessionData temp = new TempSessionData();

        processBackup(user);
        processBackup(temp);
    }
}
