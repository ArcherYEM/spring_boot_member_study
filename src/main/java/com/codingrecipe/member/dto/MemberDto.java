package com.codingrecipe.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDto {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
