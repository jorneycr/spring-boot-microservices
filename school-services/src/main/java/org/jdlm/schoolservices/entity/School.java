package org.jdlm.schoolservices.entity;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("schoolName")
    private String schoolName;

    @JsonProperty("location")
    private String location;

    @JsonProperty("principalName")
    private String principalName;
}
