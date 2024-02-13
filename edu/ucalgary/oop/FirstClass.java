package edu.ucalgary.oop;

public class FirstClass{

}

class Location{
    private String name; 
    private String address;
    private DisasterVictim occupants[];
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public DisasterVictim[] getOccupants() {
        return occupants;
    }
}

class Supply{
    private String type;
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getType() {
        return type;
    }

}

class DisasterVictim{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getComments() {
        return comments;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
}

class FamilyRelation{
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;
    
    FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo){
        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationshipTo = relationshipTo;
    }
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }
    public DisasterVictim getPersonOne() {
        return personOne;
    }
    public String getRelationshipTo() {
        return relationshipTo;
    }
    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

}

class ReliefService{
    private String dateOfInquiry;

    public void setDateOfInquiry(String dateOfInquiry) {
        this.dateOfInquiry = dateOfInquiry;
    }
    public String getDateOfInquiry() {
        return dateOfInquiry;
    }
}

class Inquirer{
    private final String FIRST_NAME;
    private final String LAST_NAME;

}

class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOftreatment){
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOftreatment;
    }
    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }
    public void setdateOfTreament(String dateofTreatment){
        this.dateOfTreatment = dateofTreatment;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }
    public String getTreatmentDetails() {
        return treatmentDetails;
    }
    public Location getLocation() {
        return location;
    }


}