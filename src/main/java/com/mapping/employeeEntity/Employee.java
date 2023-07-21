package com.mapping.employeeEntity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "emp_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String username;
    private  String email;
    private  int age;
    private  int phone;
    private  String website;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id")
    private List<Address> address = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_office_id")
    private Office office;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_ID")
    private Department department;
}
