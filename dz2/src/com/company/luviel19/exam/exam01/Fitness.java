package com.company.luviel19.exam.exam01;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.ZipEntry;

public class Fitness {
    public FitnesSubscription[] gum01 = new FitnesSubscription[20];
    public FitnesSubscription[] pool01 = new FitnesSubscription[20];
    public FitnesSubscription[] group01 = new FitnesSubscription[20];

    private int countGum = 0;
    private int countPool = 0;
    private int countGroup = 0;
    private final LocalTime curretTime = LocalTime.now();

    public void addClient(FitnesSubscription subscription, TypeOfSubscription Zone) {
        if (subscription.getRegistration().isAfter(subscription.getEnd_date_registration())) {
            throw new IllegalArgumentException("Subscriber expired");
        }
        if (curretTime.isBefore(subscription.getTypeOfSubscription().getStart()) || curretTime.isAfter(subscription.getTypeOfSubscription().getEnd())) {
            System.out.println("Your subscriber's time is not suitable");
            return;
        }
        if (subscription.getTypeOfSubscription().getName().equals(TypeOfSubscription.ONE_TIME.getName())) {

            if (Zone.name().equals(TypeOfSubscription.GYM.name())) {
                getInfoClientWhoCame(subscription, Zone);
                this.gum01 = addClientToGYM(subscription, Zone, gum01);
                System.out.println("gym_visitors = " + Arrays.toString(gum01));
                return;
            } else if (Zone.name().equals(TypeOfSubscription.POOL.name())) {
                this.pool01 = addClientToPOOL(subscription, Zone, pool01);
                getInfoClientWhoCame(subscription, Zone);
                System.out.println("visitors_pool = " + Arrays.toString(pool01));
                return;
            } else {
                System.out.println("The type of subscription does not allow you to visit this zone!");
                return;
            }
        }


        if (subscription.getTypeOfSubscription().getName().equals(TypeOfSubscription.DAYTIME.getName())) {
            if (Zone.name().equals(TypeOfSubscription.GYM.name())) {

                this.gum01 = addClientToGYM(subscription, Zone, gum01);
                getInfoClientWhoCame(subscription, Zone);

                System.out.println("gym_visitors = " + Arrays.toString(gum01));

                return;
            } else if (Zone.name().equals(TypeOfSubscription.GROUP.name())) {

                this.group01 = addClientToGroupClasses(subscription, Zone, group01);
                getInfoClientWhoCame(subscription, Zone);
                System.out.println("visitors_group_classes = " + Arrays.toString(gum01));

                return;
            } else {
                System.out.println("The type of subscription does not allow you to visit this zone!");
                return;
            }
        }

        if (subscription.getTypeOfSubscription().getName().equals(TypeOfSubscription.FUL.getName())) {
            if (Zone.name().equals(TypeOfSubscription.GYM.name())) {
                this.gum01 = addClientToGYM(subscription, Zone, gum01);
                System.out.println("gym_visitors = " + Arrays.toString(gum01));
                getInfoClientWhoCame(subscription, Zone);
                return;
            } else if (Zone.name().equals(TypeOfSubscription.GROUP.name())) {
                this.group01 = addClientToGroupClasses(subscription, Zone, group01);

                System.out.println("visitors_group_classes = " + Arrays.toString(group01));
                getInfoClientWhoCame(subscription, Zone);
                return;
            } else if (Zone.name().equals(TypeOfSubscription.POOL.name())) {
                this.pool01 = addClientToPOOL(subscription, Zone,  pool01);
                getInfoClientWhoCame(subscription, Zone);
                System.out.println("visitors_pool = " + Arrays.toString(pool01));
                return;
            }
        } else {
            System.out.println("The type of subscription does not allow you to visit this zone!");
            return;
        }

    }



    public void closedFitness() {
        LocalTime start_time = TypeOfSubscription.FUL.getStart();
        LocalTime end_time = TypeOfSubscription.FUL.getEnd();


        while (curretTime.isBefore(start_time) || curretTime.isAfter(end_time)) {
            for (int i = 0; i < 20; i++) {
                if (this.pool01[i] != null) this.pool01[i] = null;
                if (this.group01[i] != null) this.group01[i] = null;
                if (this.gum01[i] != null) this.gum01[i] = null;
            }

            System.out.println("gym_visitors = " + Arrays.toString(gum01));
            System.out.println("visitors_group_classes = " + Arrays.toString(group01));
            System.out.println("visitors_pool = " + Arrays.toString(pool01));
            return;
        }

    }

    public void getInfoALLclients() {
        for (FitnesSubscription gum01 : gum01) {
            if (gum01 != null)
                System.out.println(" The following visitor is registered in the gym " + gum01);
        }

        for (FitnesSubscription pool01 : pool01) {
            if (pool01 != null)
                System.out.println(" The following visitor is registered in the pool " + pool01);
        }

        for (FitnesSubscription group01 : group01) {
            if (group01 != null)
                System.out.println("The following visitor is registered for group classes " + group01);
        }
    }

    public void getInfoClientWhoCame(FitnesSubscription subscription, TypeOfSubscription Zone){
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    }




    public FitnesSubscription[] addClientToGYM(FitnesSubscription subscription, TypeOfSubscription fitnesZone,  FitnesSubscription[] gym_visitors) {


        if (countGum < gym_visitors.length) {
            gym_visitors[countGum] = subscription;
            countGum++;
            System.out.println("You are registered in " + fitnesZone.name() + ". Have a good workout");
        } else {
            System.out.println("There are no seats in the gym.");
        }
        return gym_visitors;
    }



    public  FitnesSubscription[] addClientToPOOL(FitnesSubscription subscription, TypeOfSubscription fitnesZone, FitnesSubscription[] visitors_pool) {

        if (countPool < visitors_pool.length) {
            visitors_pool[countPool] = subscription;
            countPool++;
            System.out.println("You are registered in " + fitnesZone.name() + ". Have a good workout");
        } else {
            System.out.println("There are no seats in the gym");
        }
        return visitors_pool;
    };



    public FitnesSubscription[] addClientToGroupClasses(FitnesSubscription subscription, TypeOfSubscription fitnesZone, FitnesSubscription[] visitors_group_classes) {

        if (countGroup < visitors_group_classes.length) {
            visitors_group_classes[countGroup] = subscription;
            countGroup++;
            System.out.println("You are registered in " + fitnesZone.name() + " . Have a good workout ");
        } else {
            System.out.println("There are no seats in the gym");
        }
        return visitors_group_classes;
    };


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fitness that = (Fitness) o;
        return countGum == that.countGum && countPool == that.countPool && countGroup == that.countGroup && Arrays.equals(gum01, that.gum01) && Arrays.equals(pool01, that.pool01) && Arrays.equals(group01, that.group01);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(countGum, countPool, countGroup);
        result = 31 * result + Arrays.hashCode(gum01);
        result = 31 * result + Arrays.hashCode(pool01);
        result = 31 * result + Arrays.hashCode(group01);
        return result;
    }

    @Override
    public String toString() {
        return "Fitness{" +
                "gum01=" + Arrays.toString(gum01) +
                ", pool01=" + Arrays.toString(pool01) +
                ", group01=" + Arrays.toString(group01) +
                ", countGum=" + countGum +
                ", countPool=" + countPool +
                ", countGroup=" + countGroup +
                ", curretTime=" + curretTime +
                '}';
    }
}



