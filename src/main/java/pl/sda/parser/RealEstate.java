package pl.sda.parser;

public class RealEstate {

    private String street;
    private String city;
    private Integer zip;
    private String state;
    private Integer beds;
    private Integer baths;
    private Integer squareFt;
    private String type;
    private String saleDate;
    private Integer price;
    private Float lat;
    private Float lot;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Integer getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public Integer getBeds() {
        return beds;
    }

    public Integer getBaths() {
        return baths;
    }

    public Integer getSquareFt() {
        return squareFt;
    }

    public String getType() {
        return type;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public Integer getPrice() {
        return price;
    }

    public Float getLat() {
        return lat;
    }

    public Float getLot() {
        return lot;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public void setSquareFt(Integer squareFt) {
        this.squareFt = squareFt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public void setLot(Float lot) {
        this.lot = lot;
    }
}

// ta klasa uzupełniona o gettery i settery pozwala nam pobierać i wyświetlać dane z pliku, obecnie
// klasa main i parser jest uzupłniona tylko o dane miasta, liczby nieruchomości i ch cen, datego
//wyświetamy tylko te dane gdy odpalamy program