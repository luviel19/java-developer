package com.company.luviel19.exam.exam04;

import javax.persistence.*;

@Entity
public class CrewMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String position;

    @ManyToOne
    @JoinColumn(name = "fishingTrip_id", referencedColumnName = "id")
    private FishingTrip fishingTrip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public FishingTrip getFishingTrip() {
        return fishingTrip;
    }

    public void setFishingTrip(FishingTrip fishingTrip) {
        this.fishingTrip = fishingTrip;
    }
}
