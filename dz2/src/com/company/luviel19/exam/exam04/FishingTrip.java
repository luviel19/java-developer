package com.company.luviel19.exam.exam04;

import java.time.LocalDate;
import javax.persistence.*;
@Entity
public class FishingTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate departureDate;
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "boat_id", referencedColumnName = "id")
    private Boat boat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
}