package InnerClasses;

public class Hotel {

    private String hotelName;
    private int totalRooms;
    private int bookedRooms;

    public Hotel(String hotelName, int totalRooms, int bookedRooms) {
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.bookedRooms = bookedRooms;
    }

    public void reserveRoom(String visitor, int noofRooms) {

        class ReservationValdator {
            boolean validate() {
                if (noofRooms <= 0) {
                    System.out.println("Invalid number of rooms requested.");
                    return false;
                }
                if (bookedRooms + noofRooms > totalRooms) {
                    System.out.println("Not enough rooms available.");
                    return false;
                }
                return true;
            }
        }

        ReservationValdator validator = new ReservationValdator();
        if (validator.validate()) {
            bookedRooms += noofRooms;
            System.out.println("Reservation successful for " + visitor + " of " + noofRooms + " rooms"
                    + " in Hotel - " + hotelName);
        } else {
            System.out.println("Reservation failed for " + visitor + ".");
        }

    }
}
