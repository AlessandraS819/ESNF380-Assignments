package edu.ucalgary.oop;

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
