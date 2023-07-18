package edu.cores.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRole role1 = UserRole.EDITOR;
        UserRole role2 = UserRole.ADMINISTRATOR;
        UserRole role3 = UserRole.EDITOR;

        System.out.println(role1.getClass().getSuperclass());
        System.out.println(role1 == role2);
        System.out.println(role1 == role3);

        System.out.println(role2.name());
        System.out.println(role2.ordinal());

        UserRole role5 = UserRole.valueOf("EDITOR");
        UserRole role6 = UserRole.valueOf(UserRole.class, "READER");
        System.out.println(role5);
        System.out.println(role6);

        System.out.println(role6.getFilePermissions());
        System.out.println(role2.getFilePermissions());
        System.out.println(role3.getFilePermissions());

        UserRole[] roles = UserRole.values();
        for (UserRole role : roles) {
            System.out.print(role + " ");
        }
        System.out.println();

        Direction direction = Direction.UP;
        System.out.println(direction.changeCoordinate());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input you role");
        UserRole role4 = UserRole.valueOf(scanner.nextLine().toUpperCase());

        switch (role4) {
            case ADMINISTRATOR -> System.out.println("You can do everything");
            case EDITOR -> System.out.println("You can edit records");
            case READER -> System.out.println("You can read tge record");
        }
    }
}
