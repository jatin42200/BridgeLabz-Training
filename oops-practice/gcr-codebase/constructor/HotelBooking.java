class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copied constructor
    public HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public void display() {
        System.out.println(guestName + " | " + roomType + " | " + nights + " nights");
    }
}
 class Hotel{
    public static void main(String[] args) {

        HotelBooking b1 = new HotelBooking();
        b1.display();
        System.out.print("default booking");

        HotelBooking b2 = new HotelBooking("Jatin", "Deluxe", 3);
        b2.display();
        System.out.print("original booking");

        HotelBooking b3 = new HotelBooking(b2);
        System.out.print("copied booking");
        b3.display();
    }
}
