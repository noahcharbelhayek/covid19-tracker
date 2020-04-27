package co.covid19.covid19tracker.model;

public class LocationStats {

    private String province;
    private String country;
    private int latestTotalCases;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                ", province='" + province + '\'' +
                "country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
