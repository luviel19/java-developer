package com.company.luviel19.exam.exam04;

import java.time.LocalDate;
import javax.persistence.*;
@Entity
public class FishingBank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate arrivalDate;
    private LocalDate departureDate;

    @ManyToOne
    @JoinColumn(name = "fishingTrip_id", referencedColumnName = "id")
    private FishingTrip fishingTrip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public FishingTrip getFishingTrip() {
        return fishingTrip;
    }

    public void setFishingTrip(FishingTrip fishingTrip) {
        this.fishingTrip = fishingTrip;
    }
}