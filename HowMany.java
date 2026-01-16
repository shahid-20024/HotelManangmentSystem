class HowMany {
    private int number;

    public HowMany(int number) {
        this.number = number;
    // HowMany snippet
    if (number <= 0) throw new IllegalArgumentException("Count must be at least 1");
        }

    public int getNumber() {
        return number;
    }
}