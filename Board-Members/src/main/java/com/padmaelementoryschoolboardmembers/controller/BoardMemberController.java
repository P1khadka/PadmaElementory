package com.padmaelementoryschoolboardmembers.controller;

import com.padmaelementoryschoolboardmembers.model.BoardMember;
import com.padmaelementoryschoolboardmembers.service.BoardMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardMemberController {
@Autowired
   private BoardMemberService boardMemberService;
    @PostMapping("/api/v1/board-member-create")
    public BoardMember createBoardMember( BoardMember boardMember){
return boardMemberService.createBoardMember();
    }

}
