package com.publicismedia.dti.cityradarboot.model;

public class UserBuilding {
    private Long id;

    private String user;

    private Integer cityId;

    private String city;

    private String district;

    private String buildingType;

    private String buildingName;

    private String address;

    private String coordinate;

    private String spotArea;

    private String spotLocation;

    private Integer quantityOfSpot;

    private Integer quantityOfAddress;

    private String floor;

    private String buildingNo;

    private String interaction;

    private String mediaCost;

    public UserBuilding(Long id, String user, Integer cityId, String city, String district, String buildingType, String buildingName, String address, String coordinate, String spotArea, String spotLocation, Integer quantityOfSpot, Integer quantityOfAddress, String floor, String buildingNo, String interaction, String mediaCost) {
        this.id = id;
        this.user = user;
        this.cityId = cityId;
        this.city = city;
        this.district = district;
        this.buildingType = buildingType;
        this.buildingName = buildingName;
        this.address = address;
        this.coordinate = coordinate;
        this.spotArea = spotArea;
        this.spotLocation = spotLocation;
        this.quantityOfSpot = quantityOfSpot;
        this.quantityOfAddress = quantityOfAddress;
        this.floor = floor;
        this.buildingNo = buildingNo;
        this.interaction = interaction;
        this.mediaCost = mediaCost;
    }

    public UserBuilding() {
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

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType == null ? null : buildingType.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }

    public String getSpotArea() {
        return spotArea;
    }

    public void setSpotArea(String spotArea) {
        this.spotArea = spotArea == null ? null : spotArea.trim();
    }

    public String getSpotLocation() {
        return spotLocation;
    }

    public void setSpotLocation(String spotLocation) {
        this.spotLocation = spotLocation == null ? null : spotLocation.trim();
    }

    public Integer getQuantityOfSpot() {
        return quantityOfSpot;
    }

    public void setQuantityOfSpot(Integer quantityOfSpot) {
        this.quantityOfSpot = quantityOfSpot;
    }

    public Integer getQuantityOfAddress() {
        return quantityOfAddress;
    }

    public void setQuantityOfAddress(Integer quantityOfAddress) {
        this.quantityOfAddress = quantityOfAddress;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction == null ? null : interaction.trim();
    }

    public String getMediaCost() {
        return mediaCost;
    }

    public void setMediaCost(String mediaCost) {
        this.mediaCost = mediaCost == null ? null : mediaCost.trim();
    }
}