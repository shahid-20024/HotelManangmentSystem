class RoomType {
    private String kind;
    private double cost;

    public RoomType(String kind, double cost) {
        this.kind = kind;
        this.cost = cost;
             // RoomType snippet
        if (cost < 0) throw new IllegalArgumentException("Cost cannot be negative");
    }
}