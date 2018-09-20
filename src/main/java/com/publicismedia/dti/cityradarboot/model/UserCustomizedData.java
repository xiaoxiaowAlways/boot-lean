package com.publicismedia.dti.cityradarboot.model;

public class UserCustomizedData {
    private Long id;

    private String user;

    private String mediaType;

    private String dataType;

    private String address;

    private String coordinate;

    private Integer count;

    private String remark;

    private String filter;

    public UserCustomizedData(Long id, String user, String mediaType, String dataType, String address, String coordinate, Integer count, String remark, String filter) {
        this.id = id;
        this.user = user;
        this.mediaType = mediaType;
        this.dataType = dataType;
        this.address = address;
        this.coordinate = coordinate;
        this.count = count;
        this.remark = remark;
        this.filter = filter;
    }

    public UserCustomizedData() {
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

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter == null ? null : filter.trim();
    }
}