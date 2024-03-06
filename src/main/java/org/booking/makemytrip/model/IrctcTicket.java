package org.booking.makemytrip.model;

public class IrctcTicket {
    private long id;
    private String trainNumber;
    private String amount;
    private String pnr;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    @Override
    public String toString() {
        return "IrctcTicket{" +
                "id=" + id +
                ", trainNumber='" + trainNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", pnr='" + pnr + '\'' +
                '}';
    }
}
