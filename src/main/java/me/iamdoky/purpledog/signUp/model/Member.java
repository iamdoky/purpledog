package me.iamdoky.purpledog.signUp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table ( name = "member" )
public class Member {

    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY )
    private Long id;
    private String memberId;
    private String password;


}
