package Tdd;

public class AirLineReservation {
    private final boolean[] seatingArrangement = new boolean[10];

    public void assignSeat(String seatType) {
        if(seatType.equals("first-class")) {
            assignFreeSeat(0, 5);
        }
        else {
            assignFreeSeat(5, 10);
        }
    }

    public boolean[] getSeatingArrangement() {
        return seatingArrangement;
    }

    private void assignFreeSeat(int start, int end) {
        for (int seat = start; seat < end; seat++) {
            if (!seatingArrangement[seat]) {
                seatingArrangement[seat] = true;
                break;
            }
        }
    }
}
