class Guest {
    private String name;
    private String addressDetails;

    public Guest(String name, String addressDetails) {
        // Defensive: Check for null or empty strings
        if (name == null || name.trim().isEmpty()) 
            throw new IllegalArgumentException("Guest name cannot be empty");
        if (addressDetails == null || addressDetails.trim().isEmpty()) 
            throw new IllegalArgumentException("Address cannot be empty");
        
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public void create() {
        System.out.println("Guest " + name + " profile created.");
    }
}