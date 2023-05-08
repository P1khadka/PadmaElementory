package com.padmaelementoryschoolboardmembers.model;

import lombok.*;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "board_member_tbl")
@Setter
@Getter
//@Entity
@ToString


public class BoardMember {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
   // private Address address;
    private String role;
   // private List<String> phoneNumberList;
}
