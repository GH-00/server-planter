package com.example.planter.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private int noteId;

    @ManyToOne
    @JoinColumn(name = "auth_id")
    private Member member;

    @Column(name = "plant_name")
    private String plantName;

    @Column(name = "date")
    private Date date;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "memo")
    private String memo;

    @Column(name = "place")
    private String place;


    public Note() {
    }

    public Note(Member member, String plantName, Date date, byte[] image, String memo, String place) {
        this.member = member;
        this.plantName = plantName;
        this.date = date;
        this.image = image;
        this.memo = memo;
        this.place = place;
    }

}






