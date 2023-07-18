package edu.cores.enums;

public enum UserRole {
    ADMINISTRATOR("rwd"),
    EDITOR("rw"),
    READER;

    private String filePermissions = "r";

    UserRole(String filePermissions) {
        this.filePermissions = filePermissions;
    }

    UserRole() {
    }

    public String getFilePermissions() {
        return filePermissions;
    }
}
