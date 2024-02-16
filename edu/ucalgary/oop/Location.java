package edu.ucalgary.oop;

import java.util.ArrayList;

class Location{
    //variables
    // Variables
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;
    //constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }
    //functions
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    // Methods to set occupants and supplies
    public void setOccupants(ArrayList<DisasterVictim> occupants) {
        this.occupants = occupants;
    }
    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public ArrayList<DisasterVictim> getOccupants() {
        return occupants;
    }
    public ArrayList<Supply> getSupplies() {
        return supplies;
    }

    // Methods to add and remove occupants
    public void addOccupant(DisasterVictim newVictim) {
        occupants.add(newVictim);
    }
    public void removeOccupant(DisasterVictim victimToRemove) {
        occupants.remove(victimToRemove);
    }
    // Methods to add and remove supplies
    public void addSupply(Supply newSupply) {
        supplies.add(newSupply);
    }

    public void removeSupply(Supply supplyToRemove) {
        supplies.remove(supplyToRemove);
    }
}
