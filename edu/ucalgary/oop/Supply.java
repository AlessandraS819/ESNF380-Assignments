package edu.ucalgary.oop;

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
