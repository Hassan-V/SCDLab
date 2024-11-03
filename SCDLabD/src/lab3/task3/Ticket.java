package lab3.task3;

import java.util.Date;

public class Ticket {
    private char source;
    private char destination;
    private Date dateOfJourney;
    private String time;
    private char busNo;
    private String seatNo;

    public Ticket(char source, char destination, Date dateOfJourney, String time, char busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }

    // Getters and Setters
    public char getSource() {
        return source;
    }

    public void setSource(char source) {
        this.source = source;
    }

    public char getDestination() {
        return destination;
    }

    public void setDestination(char destination) {
        this.destination = destination;
    }

    public Date getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(Date dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public char getBusNo() {
        return busNo;
    }

    public void setBusNo(char busNo) {
        this.busNo = busNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
}

