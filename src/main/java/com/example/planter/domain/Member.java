package com.example.planter.domain;

import javax.persistence.*;

@Entity
@Table(name = "Member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_id")
    private int authId;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "email")
    private String email;

    public Member() {
    }

    public Member(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

}
