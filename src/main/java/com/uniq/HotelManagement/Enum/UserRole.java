package com.uniq.HotelManagement.Enum;

public enum UserRole {
	
	CUSTOMER,
	ADMIN;

	public static UserRole fromString(String role) {
        if (role == null || role.trim().isEmpty()) {
            throw new IllegalArgumentException("Role cannot be null or empty");
        }
        return UserRole.valueOf(role.toUpperCase());
    }
}
