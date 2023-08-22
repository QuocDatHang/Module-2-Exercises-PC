package service;

import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    private final String fileUser = "./data/ListUsers.txt";
    @Override
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileUser);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public User findUser(long id) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void deleteUser(long id) {

    }

    public static void main(String[] args) {

    }
}
