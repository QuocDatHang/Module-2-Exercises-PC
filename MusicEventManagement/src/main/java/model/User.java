package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.DateUtils;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private long id;
    private String name;
    private String password;
    private LocalDate dob;
    private String address;
    private String phoneNumber;
    private EGender gender;

    public static void main(String[] args) {
        User user1 = new User(1,"Dat09", "123123", DateUtils.parseDate("20-01-2000"), "12 le loi", "0723999999", EGender.MALE);

    }
}
