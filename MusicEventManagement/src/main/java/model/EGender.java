package model;

public enum EGender {

    MALE(1, "Nam"), FEMALE(2, "Nữ"), OTHER(3, "Khác");

    private EGender(int id, String type) {
        this.id = id;
        this.type = type;
    }
    private long id;
    private String type;
}
