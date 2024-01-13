package com.company.luviel19.exam.exam04;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Catch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fishType;
    private Double weight;
    private String quality;

    @ManyToOne
    @JoinColumn(name = "fishingTrip_id", referencedColumnName = "id")
    private FishingTrip fishingTrip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public FishingTrip getFishingTrip() {
        return fishingTrip;
    }

    public void setFishingTrip(FishingTrip fishingTrip) {
        this.fishingTrip = fishingTrip;
    }
}