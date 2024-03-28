package com.aswe.communicraft.models.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    private String name;

    private int teamSize;

    private int numberOfTasks;

    //private List<UserEntity> craftsmenList;
}