package com.example.corejavaexamplewithstreamapi.stream.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class EmpDto {

    private String name;
    private Integer id;

    public static List<EmpDto> getEmp (List<Emp> empList) {
        return empList.stream().map(EmpDto::new).collect(Collectors.toList());
    }

    @ToString.Exclude
    private final Emp emp;

    public String getName ( ) {
        return this.emp.getName();
    }

    public Integer getId ( ) {
        return this.emp.getId();
    }


}
