package com.bookMyshow.bookMyshow.EntryDTOs;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserEntryDTO {
    private String name;

    private int age;

    // marking this attribute is not null
    // Keeping email unique

    private String email;

    private String mobile;

    private String address;

}
