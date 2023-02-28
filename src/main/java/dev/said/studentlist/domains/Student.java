package dev.said.studentlist.domains;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    Integer id;
    String firstName;
    String lastName;
    String age;
    String major;
    String phoneNumber;
}
