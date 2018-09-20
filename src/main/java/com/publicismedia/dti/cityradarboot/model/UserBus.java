package com.publicismedia.dti.cityradarboot.model;

public class UserBus {
    private Long id;

    private String user;

    private Integer cityId;

    private String city;

    private String district;

    private String stationNo;

    private String stationName;

    private String detailAddress;

    private String coordinate;

    private String size;

    private String mediaCost;

    public UserBus(Long id, String user, Integer cityId, String city, String district, String stationNo, String stationName, String detailAddress, String coordinate, String size, String mediaCost) {
        this.id = id;
        this.user = user;
        this.cityId = cityId;
        this.city = city;
        this.district = district;
        this.stationNo = stationNo;
        this.stationName = stationName;
        this.detailAddress = detailAddress;
        this.coordinate = coordinate;
        this.size = size;
        this.mediaCost = mediaCost;
    }

    public UserBus() {
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

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo == null ? null : stationNo.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getMediaCost() {
        return mediaCost;
    }

    public void setMediaCost(String mediaCost) {
        this.mediaCost = mediaCost == null ? null : mediaCost.trim();
    }
}