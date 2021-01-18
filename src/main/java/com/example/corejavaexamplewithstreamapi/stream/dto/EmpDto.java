package com.example.corejavaexamplewithstreamapi.stream.dto;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@ToString
@RequiredArgsConstructor
public class EmpDto {
    @ToString.Exclude
    private final Emp emp;
    private String name;
    private Integer id;


    public String getName ( ) {
        return this.emp.getName();
    }


    public Integer getId ( ) {
        return this.emp.getId();
    }


    public static List<EmpDto> getEmp (List<Emp> empList) {
        return empList.stream().map(EmpDto::new).collect(Collectors.toList());
    }
}
