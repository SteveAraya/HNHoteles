package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Steve and Marcos
 */
public class Reservation {

    private int reservation_num;
    private String reservationhour;
    private String entrydate;
    private String exitdate;
    private int nightsnumbers;
    private int childrenamount;
    private String adulstamount;
    private int num_room;
    private int id_user;
    private int cardnumber;

    public Reservation(int reservation_num, String reservationhour, String entrydate, String exitdate, int nightsnumbers, int childrenamount, String adulstamount, int num_room, int id_user, int cardnumber) {
        this.reservation_num = reservation_num;
        this.reservationhour = reservationhour;
        this.entrydate = entrydate;
        this.exitdate = exitdate;
        this.nightsnumbers = nightsnumbers;
        this.childrenamount = childrenamount;
        this.adulstamount = adulstamount;
        this.num_room = num_room;
        this.id_user = id_user;
        this.cardnumber = cardnumber;
    }

    public int getReservation_num() {
        return reservation_num;
    }

    public void setReservation_num(int reservation_num) {
        this.reservation_num = reservation_num;
    }

    public String getReservationhour() {
        return reservationhour;
    }

    public void setReservationhour(String reservationhour) {
        this.reservationhour = reservationhour;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getExitdate() {
        return exitdate;
    }

    public void setExitdate(String exitdate) {
        this.exitdate = exitdate;
    }

    public int getNightsnumbers() {
        return nightsnumbers;
    }

    public void setNightsnumbers(int nightsnumbers) {
        this.nightsnumbers = nightsnumbers;
    }

    public int getChildrenamount() {
        return childrenamount;
    }

    public void setChildrenamount(int childrenamount) {
        this.childrenamount = childrenamount;
    }

    public String getAdulstamount() {
        return adulstamount;
    }

    public void setAdulstamount(String adulstamount) {
        this.adulstamount = adulstamount;
    }

    public int getNum_room() {
        return num_room;
    }

    public void setNum_room(int num_room) {
        this.num_room = num_room;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public static String actualdate() {// static methow for get actully date for reservation day
        Date actualdate = new Date();
        SimpleDateFormat formatdate = new SimpleDateFormat("dd/MM/YYYY");
        return formatdate.format(actualdate);
    }

}
