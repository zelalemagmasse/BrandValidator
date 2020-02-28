package com.eyob.brandvalidator.model.recall;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recall {
  private String country;
  private String city;
  private String product_type;
  private String product_description;
 // private String report_date;
  //private String recall_initiation_date;
  
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getProduct_type() {
	return product_type;
}
public void setProduct_type(String product_type) {
	this.product_type = product_type;
}
public String getProduct_description() {
	return product_description;
}
public void setProduct_description(String product_description) {
	this.product_description = product_description;
}
//public String getReport_date() {
//	return report_date;
//}
//public void setReport_date(String report_date) {
//	this.report_date = report_date;
//}
//public String getRecall_initiation_date() {
//	return recall_initiation_date;
//}
//public void setRecall_initiation_date(String recall_initiation_date) {
//	this.recall_initiation_date = recall_initiation_date;
//}
  
  
  
  
}
