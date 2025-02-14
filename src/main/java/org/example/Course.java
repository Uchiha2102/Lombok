package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@With
@Builder
public class Course {
    private final int id;
    private final String name;
    private final Teacher teacher;


}
