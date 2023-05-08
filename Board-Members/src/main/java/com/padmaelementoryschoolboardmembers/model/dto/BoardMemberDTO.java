package com.padmaelementoryschoolboardmembers.model.dto;

import com.padmaelementoryschoolboardmembers.model.Address;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@Entity
@ToString


public class BoardMemberDTO {
    private String name;
   // private Address address;
    private String role;
   // private List<String> phoneNumberList;
}
