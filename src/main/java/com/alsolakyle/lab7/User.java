package com.alsolakyle.lab7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Generates getters, setters for all fields
@Builder // Generates a builder pattern [cite: 164]
@AllArgsConstructor // Generates constructor with all arguments [cite: 165]
@NoArgsConstructor // Generates default constructor [cite: 166]
public class User {
    private int UID;
    private String username;
    private String password;
    private boolean enabled;
}