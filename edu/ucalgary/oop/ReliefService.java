package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
    private boolean isValidDateFormat(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    public void setDateOfInquiry(String dateOfInquiry) {
        if (!isValidDateFormat(dateOfInquiry)) {
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format.");
        }
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
        String inquirerName = inquirer.getFirstName(); // Get inquirer's first name
        String missingPersonName = missingPerson.getFirstName() + " " + missingPerson.getLastName(); // Get missing person's full name
        String lastKnownLocationDetails = lastKnownLocation.getName(); // Get the name of the last known location

        String logDetails = "Inquirer: " + inquirerName + ", " +
                "Missing Person: " + missingPersonName + ", " +
                "Date of Inquiry: " + dateOfInquiry + ", " +
                "Info Provided: " + infoProvided + ", " +
                "Last Known Location: " + lastKnownLocationDetails; // Combine all details

        return logDetails.replaceAll("\\s*null\\b", "");
    }
}