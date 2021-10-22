package com.sparta.bt.northwindrest.dto;

public class ProductDTO{
    private Integer id;

    private String productName;

    private Integer supplierID;

    private Integer categoryID;

    private String quantityPerUnit;

    private Double unitPrice;

    private Integer unitsInStock;

    private Integer unitsOnOrder;

    private Integer reorderLevel;

    private Integer discontinued;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Integer getSupplierID() {
            return supplierID;
        }

        public void setSupplierID(Integer supplierID) {
            this.supplierID = supplierID;
        }

        public Integer getCategoryID() {
            return categoryID;
        }

        public void setCategoryID(Integer categoryID) {
            this.categoryID = categoryID;
        }

        public String getQuantityPerUnit() {
            return quantityPerUnit;
        }

        public void setQuantityPerUnit(String quantityPerUnit) {
            this.quantityPerUnit = quantityPerUnit;
        }

        public Double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public Integer getUnitsInStock() {
            return unitsInStock;
        }

        public void setUnitsInStock(Integer unitsInStock) {
            this.unitsInStock = unitsInStock;
        }

        public Integer getUnitsOnOrder() {
            return unitsOnOrder;
        }

        public void setUnitsOnOrder(Integer unitsOnOrder) {
            this.unitsOnOrder = unitsOnOrder;
        }

        public Integer getReorderLevel() {
            return reorderLevel;
        }

        public void setReorderLevel(Integer reorderLevel) {
            this.reorderLevel = reorderLevel;
        }

        public Integer getDiscontinued() {
            return discontinued;
        }

        public void setDiscontinued(Integer discontinued) {
            this.discontinued = discontinued;
        }
}
