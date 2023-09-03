package com.example.planter.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Diary")
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diary_id")
    private int diaryId;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;

    @ManyToOne
    @JoinColumn(name = "auth_id")
    private Member member;

    @Column(name = "date")
    private Date date;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "humidity")
    private int humidity;

    @Column(name = "temperature")
    private int temperature;

    @Column(name = "light")
    private int light;

    @Column(name = "state_imoticon")
    private int stateImoticon;

    @Column(name = "memo")
    private String memo;

    @Column(name = "public")
    private boolean isPublic;


    public Diary() {
    }

    public Diary(Plant plant, Member member, Date date, byte[] image, int humidity, int temperature,
                 int light, int stateImoticon, String memo, boolean isPublic) {
        this.plant = plant;
        this.member = member;
        this.date = date;
        this.image = image;
        this.humidity = humidity;
        this.temperature = temperature;
        this.light = light;
        this.stateImoticon = stateImoticon;
        this.memo = memo;
        this.isPublic = isPublic;
    }


}