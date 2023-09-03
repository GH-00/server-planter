package com.example.planter.domain;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Plant")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plant_id")
    private int plantId;

    @ManyToOne
    @JoinColumn(name = "auth_id")
    private Member member;

    @Column(name = "name")
    private String name;

    @Column(name = "register_date")
    private Date registerDate;

    @Column(name = "plant_type")
    private String plantType;

    @Column(name = "validate_temperature")
    private int validateTemperature;

    @Column(name = "water")
    private int water;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "emoticon")
    private int emoticon;

    @Column(name = "humidity")
    private int humidity;

    @Column(name = "temperature")
    private int temperature;

    @Column(name = "light")
    private int light;

    @Column(name = "light_color")
    private int lightColor;

    @Column(name = "water_amount")
    private boolean waterAmount;

    @Column(name = "automation")
    private boolean automation;


    public Plant() {
    }

    public Plant(Member member, String name, Date registerDate, String plantType, int validateTemperature, int water,
                 byte[] image, int emoticon, int humidity, int temperature, int light, int lightColor,
                 boolean waterAmount, boolean automation) {
        this.member = member;
        this.name = name;
        this.registerDate = registerDate;
        this.plantType = plantType;
        this.validateTemperature = validateTemperature;
        this.water = water;
        this.image = image;
        this.emoticon = emoticon;
        this.humidity = humidity;
        this.temperature = temperature;
        this.light = light;
        this.lightColor = lightColor;
        this.waterAmount = waterAmount;
        this.automation = automation;
    }

}