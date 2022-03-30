package me.iamdoky.purpledog.signUp.model.request;

import lombok.Data;

@Data
public class MemberRequest {

    private Long id;
    private String memberId;
    private String password;

}
