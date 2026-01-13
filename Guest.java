class Guest {
    private String name;
    private String addressDetails;

    public Guest(String name, String addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public void create() {
        System.out.println("Guest " + name + " profile created.");
    }
}