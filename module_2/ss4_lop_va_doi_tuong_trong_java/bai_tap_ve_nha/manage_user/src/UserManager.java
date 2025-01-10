package src;

public class UserManager {
    User[] list;
    private final int limit;

    public UserManager() {
        limit = 0;
        list = new User[limit];
    }

    public UserManager(int limit) {
        this.limit = limit;
        list = new User[limit];
    }

    public void addUser(User u) {
        User[] temp = new User[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        temp[list.length] = u;
        list = temp;
    }

    public void showListUser() {
        System.out.println("List user:");
        for (User item : list) {
            System.out.println(item.toString());
        }
    }

    public void editUser(int id, User newUser) {
        boolean check = false;
        for (User user : list) {
            if (user.getId() == id) {
                check = true;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < list.length; i++) {
                if (list[i].getId() == id) {
                    list[i] = newUser;
                }
            }
        } else {
            System.out.println("User not found");
        }
    }

    public void removeUser(int id) {
        int removeIndex = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                removeIndex = i;
                break;
            }
        }

        if (removeIndex == -1) {
            System.out.println("Invalid user id: " + id);
        } else {
            for (int i = removeIndex; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
            System.out.println("Remove user with id " + id + " successfully.");
        }
    }
}
