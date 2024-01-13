package com.company.luviel19.exam.exam04;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class BoatPassport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "boat_id", referencedColumnName = "id")
    private Boat boat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
}
