package id.andifauzy.beautifulnusantara;

public class Destination {
    private String namaDestination;
    private String namaKota;
    private String namaProvinsi;
    private String descDestination;
    private String descDetailDestination;
    private Double ratingDestination;
    private int photoDestination;

    Destination(String nama, String kota, String provinsi, String desc, String descMore, Double rating, int photo){
        namaDestination = nama;
        namaKota = kota;
        namaProvinsi = provinsi;
        descDestination = desc;
        descDetailDestination = descMore;
        ratingDestination = rating;
        photoDestination = photo;
    }

    public String getNamaDestination() {
        return namaDestination;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public String getNamaProvinsi() {
        return namaProvinsi;
    }

    public String getDescDestination() {
        return descDestination;
    }

    public String getDescDetailDestination() {
        return descDetailDestination;
    }

    public Double getRatingDestination() {
        return ratingDestination;
    }

    public int getPhotoDestination() {
        return photoDestination;
    }
}
