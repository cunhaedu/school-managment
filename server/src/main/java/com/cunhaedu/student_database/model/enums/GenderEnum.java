package com.cunhaedu.student_database.model.enums;

public enum GenderEnum {
    MALE(1),
    FEMALE(2);

    private final int code;

    GenderEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static GenderEnum fromCode(int code) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.getCode() == code) {
                return gender;
            }
        }
        throw new IllegalArgumentException("invalid code: " + code);
    }
}
