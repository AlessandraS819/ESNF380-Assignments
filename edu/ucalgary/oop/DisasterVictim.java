
package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class DisasterVictim{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private static int ASSIGNED_SOCIAL_ID ;
    private static int nextSocialId = 1; // Initialize to 1 for the first victim
    private MedicalRecord medicalRecords[];
    private FamilyRelation familyConnections[];
    private final String ENTRY_DATE;
    private Supply personalBelongings[];
    private String gender;
    private int counter;
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        if (!isValidDateFormat(ENTRY_DATE)) {
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format.");
        }
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = nextSocialId; // Assign the next available ID
        nextSocialId++; // Increment for the next victim
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date of birth format. Please use YYYY-MM-DD format.");
        }
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
    public String getEntryDate() {
        return ENTRY_DATE;
    }

    private boolean isValidDateFormat(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
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