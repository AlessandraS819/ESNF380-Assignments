package edu.ucalgary.oop;

class Location{
    private String name; 
    private String address;
    private DisasterVictim occupants[];
}

class Supply{
    private String type;
    private int quantity;

}

class DisasterVictim{
    private String firstName;
}

class FamilyRelation{
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;
}

class ReliefService{
    private String dateOfInquiry;
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


}