package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class MedicalRecord {
    // variables
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    // constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        setDateOfTreatment(dateOfTreatment); // Validate date format
    }

    // functions
    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        if (!isValidDateFormat(dateOfTreatment)) {
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD format.");
        }
        this.dateOfTreatment = dateOfTreatment;
    }

    public void setLocation(Location location) {
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

    private boolean isValidDateFormat(String date) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
