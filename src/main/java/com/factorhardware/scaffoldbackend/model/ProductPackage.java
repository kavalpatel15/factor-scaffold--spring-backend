package com.factorhardware.scaffoldbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ProductPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userEmail;
    private String packageName;
    private String fileNames;// files?
    private String requestedQuantity; //maybe a list?
    private String dueDate;
    private String description;

    public ProductPackage(String userEmail, String packageName, String fileNames, String requestedQuantity, String dueDate, String description) {
        this.userEmail = userEmail;
        this.packageName = packageName;
        this.fileNames = fileNames;
        this.requestedQuantity = requestedQuantity;
        this.dueDate = dueDate;
        this.description = description;
    }

    public ProductPackage() {

    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFileNames() {
        return fileNames;
    }

    public void setFileNames(String fileNames) {
        this.fileNames = fileNames;
    }

    public String getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(String requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ProductPackage{" +
                "userEmail='" + userEmail + '\'' +
                ", packageName='" + packageName + '\'' +
                ", fileNames='" + fileNames + '\'' +
                ", requestedQuantity='" + requestedQuantity + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
