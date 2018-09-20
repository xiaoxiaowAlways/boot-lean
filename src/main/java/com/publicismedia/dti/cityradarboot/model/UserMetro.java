package com.publicismedia.dti.cityradarboot.model;

public class UserMetro {
    private Long id;

    private String user;

    private Integer cityId;

    private String city;

    private String district;

    private String metroLine;

    private String metroStation;

    private String detailAddress;

    private String coordinate;

    private String exit;

    private String areaType;

    private String areaSubType;

    private String surroundings;

    private String location;

    private String size;

    private String level;

    private String mediaCost;

    public UserMetro(Long id, String user, Integer cityId, String city, String district, String metroLine, String metroStation, String detailAddress, String coordinate, String exit, String areaType, String areaSubType, String surroundings, String location, String size, String level, String mediaCost) {
        this.id = id;
        this.user = user;
        this.cityId = cityId;
        this.city = city;
        this.district = district;
        this.metroLine = metroLine;
        this.metroStation = metroStation;
        this.detailAddress = detailAddress;
        this.coordinate = coordinate;
        this.exit = exit;
        this.areaType = areaType;
        this.areaSubType = areaSubType;
        this.surroundings = surroundings;
        this.location = location;
        this.size = size;
        this.level = level;
        this.mediaCost = mediaCost;
    }

    public UserMetro() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getMetroLine() {
        return metroLine;
    }

    public void setMetroLine(String metroLine) {
        this.metroLine = metroLine == null ? null : metroLine.trim();
    }

    public String getMetroStation() {
        return metroStation;
    }

    public void setMetroStation(String metroStation) {
        this.metroStation = metroStation == null ? null : metroStation.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit == null ? null : exit.trim();
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType == null ? null : areaType.trim();
    }

    public String getAreaSubType() {
        return areaSubType;
    }

    public void setAreaSubType(String areaSubType) {
        this.areaSubType = areaSubType == null ? null : areaSubType.trim();
    }

    public String getSurroundings() {
        return surroundings;
    }

    public void setSurroundings(String surroundings) {
        this.surroundings = surroundings == null ? null : surroundings.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getMediaCost() {
        return mediaCost;
    }

    public void setMediaCost(String mediaCost) {
        this.mediaCost = mediaCost == null ? null : mediaCost.trim();
    }
}