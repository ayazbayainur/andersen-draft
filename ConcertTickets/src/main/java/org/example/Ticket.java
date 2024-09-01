package org.example;

public class Ticket {
    private Integer id;
    private String concertHall;
    private Integer eventCode;
    private long eventTime;  // Unix timestap
    private Boolean isPromo;
    private Character stadiumSector;
    private Double maxBackpackWeight;
    private long creationTime =  System.currentTimeMillis() / 1000L; // Unix timestap
    public static Integer price;

    public Ticket(){

    }

    public Ticket(Integer id, String concertHall, Integer eventCode, long eventTime, Boolean isPromo, Character stadiumSector, Double maxBackpackWeight){
        this.id = id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.eventTime = eventTime;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxBackpackWeight = maxBackpackWeight;
    }

    public Ticket(String concertHall, Integer eventCode, long eventTime){
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.eventTime = eventTime;
    }

    public Integer getId(){
        return id;
    }

    public String getConcertHall(){
        return concertHall;
    }

    public Integer getEventCode(){
        return eventCode;
    }

    public long getEventTime(){
        return eventTime;
    }

    public Boolean getIsPromo(){
        return isPromo;
    }

    public Character getStadiumSector(){
        return stadiumSector;
    }

    public Double getMaxBackpackWeight(){
        return maxBackpackWeight;
    }

    public void setId(Integer id){
        if(String.valueOf(id).length() <= 4){
            this.id = id;
        }
    }

    public void setConcertHall(String concertHall){
        if(concertHall.length() <= 10) {
            this.concertHall = concertHall;
        }
    }

    public void setEventCode(Integer eventCode){
        if(String.valueOf(eventCode).length() == 3){
            this.eventCode = eventCode;
        }
    }

    public void setIsPromo(Boolean isPromo){
        this.isPromo = isPromo;
    }

    public void setStadiumSector(Character stadiumSector){
        if(stadiumSector >= 65 && stadiumSector <= 90){
            this.stadiumSector = stadiumSector;
        }
    }

    public void setMaxBackpackWeight(Double maxBackpackWeight){
        this.maxBackpackWeight = maxBackpackWeight;
    }

    public String toString(){
        return "id: " + id + ", concertHall: " + concertHall + ", eventCode: " + eventCode + ", eventTime: " + eventTime + ", isPromo: " + isPromo
        + ", stadumSector: " + stadiumSector + ", maxBackpackWeight: " + maxBackpackWeight + ", creationTime: " + creationTime + ", price: " + price;
    }
}
