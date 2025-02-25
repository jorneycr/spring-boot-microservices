package org.jdlm.studentservice.studentservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private int id;
    @JsonProperty("schoolName")
    private String schoolName;

    @JsonProperty("location")
    private String location;

    @JsonProperty("principalName")
    private String principalName;
}
