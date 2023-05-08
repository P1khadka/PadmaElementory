package com.padmaelementoryschoolboardmembers.service;

import com.padmaelementoryschoolboardmembers.model.Address;
import com.padmaelementoryschoolboardmembers.model.BoardMember;
import com.padmaelementoryschoolboardmembers.model.dto.BoardMemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardMemberService {
    @Autowired
    private BoardMemberDTO boardMemberDTO;

//    public BoardMember  getListBoardMembers(){
//        Address address= new Address();
//
//    }
//
//    public  BoardMember getOneListDetail( ){
//
//    }

    public  BoardMember createBoardMember(){
        Address address= new Address();
        BoardMember boardMember= new BoardMember();
        boardMember.setName(boardMemberDTO.getName());
        boardMember.setRole(boardMemberDTO.getRole());
     return boardMember;

    }

//    public BoardMember updateBoardMember(){
//
//    }
//
//    public


}
