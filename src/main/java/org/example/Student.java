package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@With
@Builder

public class Student {
    private final int id;
    private final String name;
    private final String address;
    private final double grade;




}
