package conf.sqlmap.pojo;

public class IpAddress {
    private Integer id;

    private Integer minip;

    private Integer maxip;

    private String continent;

    private String areacode;

    private String country;

    private String user;

    private String multiarea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinip() {
        return minip;
    }

    public void setMinip(Integer minip) {
        this.minip = minip;
    }

    public Integer getMaxip() {
        return maxip;
    }

    public void setMaxip(Integer maxip) {
        this.maxip = maxip;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getMultiarea() {
        return multiarea;
    }

    public void setMultiarea(String multiarea) {
        this.multiarea = multiarea == null ? null : multiarea.trim();
    }
}