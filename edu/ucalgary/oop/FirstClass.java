package edu.ucalgary.oop;

public class FirstClass{

}

class Location{
    //variables
    private String name; 
    private String address;
    private DisasterVictim occupants[];
    private Supply supplies[];
    //constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //functions
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }
    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
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
    public Supply[] getSupplies() {
        return supplies;
    }

    public void addOccupant(DisasterVictim newVictim) {
        if (occupants == null) {
            // If occupants array is null, initialize it with size 1
            occupants = new DisasterVictim[1];
            occupants[0] = newVictim;
        } else {
            // If occupants array is not null, resize and add new occupant
            DisasterVictim[] newOccupants = new DisasterVictim[occupants.length + 1];
            // Copy existing occupants to the new array
            for (int i = 0; i < occupants.length; i++) {
                newOccupants[i] = occupants[i];
            }
            // Add the new occupant to the end of the array
            newOccupants[newOccupants.length - 1] = newVictim;
            // Set the occupants array to the new array
            occupants = newOccupants;
        }
    }
    public void removeOccupant(DisasterVictim victimToRemove) {
        if (occupants != null) {
            // Find the index of the victim to remove
            int indexToRemove = -1;
            for (int i = 0; i < occupants.length; i++) {
                if (occupants[i] == victimToRemove) {
                    indexToRemove = i;
                    break;
                }
            }
            // If the victim is found, remove them from the occupants array
            if (indexToRemove != -1) {
                DisasterVictim[] newOccupants = new DisasterVictim[occupants.length - 1];
                int newIndex = 0;
                for (int i = 0; i < occupants.length; i++) {
                    if (i != indexToRemove) {
                        newOccupants[newIndex++] = occupants[i];
                    }
                }
                occupants = newOccupants;
            }
        }
    }
    public void addSupply(Supply newSupply) {
        if (supplies == null) {
            // If supplies array is null, initialize it with size 1
            supplies = new Supply[1];
            supplies[0] = newSupply;
        } else {
            // If supplies array is not null, resize and add new supply
            Supply[] newSupplies = new Supply[supplies.length + 1];
            // Copy existing supplies to the new array
            for (int i = 0; i < supplies.length; i++) {
                newSupplies[i] = supplies[i];
            }
            // Add the new supply to the end of the array
            newSupplies[newSupplies.length - 1] = newSupply;
            // Set the supplies array to the new array
            supplies = newSupplies;
        }
    }
    public void removeSupply(Supply supplyToRemove) {
        if (supplies != null) {
            // Find the index of the supply to remove
            int indexToRemove = -1;
            for (int i = 0; i < supplies.length; i++) {
                if (supplies[i] == supplyToRemove) {
                    indexToRemove = i;
                    break;
                }
            }
            // If the supply is found, remove it from the supplies array
            if (indexToRemove != -1) {
                Supply[] newSupplies = new Supply[supplies.length - 1];
                int newIndex = 0;
                for (int i = 0; i < supplies.length; i++) {
                    if (i != indexToRemove) {
                        newSupplies[newIndex++] = supplies[i];
                    }
                }
                supplies = newSupplies;
            }
        }
    }
}

class Supply{
    //variables
    private String type;
    private int quantity;
    //constructor
    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
    //functions
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
    private final int ASSIGNED_SOCIAL_ID;
    private MedicalRecord medicalRecords[];
    private FamilyRelation familyConnections[];
    private final String ENTRY_DATE;
    private Supply personalBelongings[];
    private String gender;
    private int counter;
    //constructor
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
    }

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
    public void setMedicalRecords(MedicalRecord[] medicalRecords){
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(Supply[] personalBelongings){
        this.personalBelongings = personalBelongings;
    }
    public void setFamilyConnections(FamilyRelation[] familyConnections){
        this.familyConnections = familyConnections;
    }
    public void setGender(String gender){
        this.gender = gender;
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
    public MedicalRecord[] getMedicalRecords(){
        return medicalRecords;
    }
    public int getAssignedSocialID(){
            return ASSIGNED_SOCIAL_ID;
    }
    public Supply[] getPersonalBelongings(){
        return personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections(){
        return familyConnections;
    }
    public String getGender(){
        return gender;
    }
    public void addPersonalBelonging(Supply supply) {
        if (personalBelongings == null) {
            personalBelongings = new Supply[1];
            personalBelongings[0] = supply;
        } else {
            Supply[] newPersonalBelongings = new Supply[personalBelongings.length + 1];
            for (int i = 0; i < personalBelongings.length; i++) {
                newPersonalBelongings[i] = personalBelongings[i];
            }
            newPersonalBelongings[personalBelongings.length] = supply;
            personalBelongings = newPersonalBelongings;
        }
    }
    public void removePersonalBelonging(Supply supply) {
        if (personalBelongings != null) {
            int indexToRemove = -1;
            for (int i = 0; i < personalBelongings.length; i++) {
                if (personalBelongings[i] == supply) {
                    indexToRemove = i;
                    break;
                }
            }
            if (indexToRemove != -1) {
                Supply[] newPersonalBelongings = new Supply[personalBelongings.length - 1];
                int newIndex = 0;
                for (int i = 0; i < personalBelongings.length; i++) {
                    if (i != indexToRemove) {
                        newPersonalBelongings[newIndex++] = personalBelongings[i];
                    }
                }
                personalBelongings = newPersonalBelongings;
            }
        }
    }
    public void addFamilyConnection(FamilyRelation familyConnection) {
        if (familyConnections == null) {
            familyConnections = new FamilyRelation[1];
            familyConnections[0] = familyConnection;
        } else {
            FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length + 1];
            for (int i = 0; i < familyConnections.length; i++) {
                newFamilyConnections[i] = familyConnections[i];
            }
            newFamilyConnections[familyConnections.length] = familyConnection;
            familyConnections = newFamilyConnections;
        }
    }
    public void removeFamilyConnection(FamilyRelation familyConnection) {
        if (familyConnections != null) {
            int indexToRemove = -1;
            for (int i = 0; i < familyConnections.length; i++) {
                if (familyConnections[i] == familyConnection) {
                    indexToRemove = i;
                    break;
                }
            }
            if (indexToRemove != -1) {
                FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length - 1];
                int newIndex = 0;
                for (int i = 0; i < familyConnections.length; i++) {
                    if (i != indexToRemove) {
                        newFamilyConnections[newIndex++] = familyConnections[i];
                    }
                }
                familyConnections = newFamilyConnections;
            }
        }
    }
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[1];
            medicalRecords[0] = medicalRecord;
        } else {
            MedicalRecord[] newMedicalRecords = new MedicalRecord[medicalRecords.length + 1];
            for (int i = 0; i < medicalRecords.length; i++) {
                newMedicalRecords[i] = medicalRecords[i];
            }
            newMedicalRecords[medicalRecords.length] = medicalRecord;
            medicalRecords = newMedicalRecords;
        }
    }
}

class FamilyRelation{
    //variables
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;
    //constructor
    FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo){
        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationshipTo = relationshipTo;
    }
    //functions
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
    //variables
    private String dateOfInquiry;
    private DisasterVictim missingPerson;
    private Inquirer inquirer;
    private String infoProvided;
    private Location lastKnownLocation; 
    //constructor
    ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation){
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }
    //functions
    public void setDateOfInquiry(String dateOfInquiry) {
        this.dateOfInquiry = dateOfInquiry;
    }
    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }
    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }
    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }
    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }
    public String getInfoProvided() {
        return infoProvided;
    }
    public Inquirer getInquirer() {
        return inquirer;
    }
    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }
    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }
    public String getLogDetails() {
        String logDetails = "Date of Inquiry: " + dateOfInquiry + "\n" +
                            "Missing Person: " + missingPerson.getFirstName() + " " + missingPerson.getLastName() + "\n" +
                            "Inquirer: " + inquirer.getFirstName() + " " + inquirer.getLastName() + "\n" +
                            "Info Provided: " + infoProvided + "\n" +
                            "Last Known Location: " + lastKnownLocation.getName() + ", " + lastKnownLocation.getAddress();
        return logDetails;
    }
}

class Inquirer{
    //variables
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String INFO;
    private final String SERVICES_PHONE;
    //constructors
    Inquirer(String FIRST_NAME, String LAST_NAME, String INFO, String SERVICES_PHONE){
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.INFO = INFO;
        this.SERVICES_PHONE = SERVICES_PHONE;
    }
    //functions
    public String getFirstName() {
        return FIRST_NAME;
    }
    public String getLastName() {
        return LAST_NAME;
    }
    public String getInfo() {
        return INFO;
    }
    public String getServicePhone() {
        return SERVICES_PHONE;
    }
}

class MedicalRecord {
    //variables
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;
    //constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOftreatment){
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOftreatment;
    }
    //functions
    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }
    public void setDateOfTreament(String dateofTreatment){
        this.dateOfTreatment = dateofTreatment;
    }
    public void setLocation(Location location){
        this.location = location;
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