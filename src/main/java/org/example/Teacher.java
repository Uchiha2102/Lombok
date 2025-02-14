package org.example;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@With
@Builder
public class Teacher {
    private final int id;
    private final String name;
    private final String subject;
}

