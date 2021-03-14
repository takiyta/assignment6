package com.company;

public class House
{
    //All final attributes
    private final String Windows; // required
    private final String Doors; // required
    private final String Rooms; // optional
    private final String Garage; // optional
    private final String Swimpool; // optional

    private House(HouseBuilder builder) {
        this.Windows = builder.Windows;
        this.Doors = builder.Doors;
        this.Rooms = builder.Rooms;
        this.Garage = builder.Garage;
        this.Swimpool = builder.Swimpool;
    }

    public String getWindows() {
        return Windows;
    }

    public String getDoors() {
        return Doors;
    }

    public String getRooms() {
        return Rooms;
    }

    public String getGarage() {
        return Garage;
    }

    public String getSwimpool() {
        return Swimpool;
    }

    @Override
    public String toString() {
        return "House{" +
                "Windows='" + Windows + '\'' +
                ", Doors='" + Doors + '\'' +
                ", Rooms='" + Rooms + '\'' +
                ", Garage='" + Garage + '\'' +
                ", Swimpool='" + Swimpool + '\'' +
                '}';
    }

    public static class HouseBuilder
    {
        private final String Windows; // required
        private final String Doors; // required
        private final String Rooms; // optional
        private final String Garage; // optional
        private final String Swimpool;

        public HouseBuilder(String Windows, String Doors,String Rooms,String Garage,String Swimpool) {
            this.Windows = Windows;
            this.Doors = Doors;
            this.Rooms = Rooms;
            this.Garage = Garage;
            this.Swimpool = Swimpool;
        }

        //Return the finally consrcuted User object
        public House build() {
            House house =  new House(this);
            validateUserObject(house);
            return house;
        }
        private void validateUserObject(House house) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}
