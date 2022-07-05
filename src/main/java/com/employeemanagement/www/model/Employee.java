package com.employeemanagement.www.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Structure of an employee
 */

@Schema(name = "employee", description = "Structure of an employee")
@JsonTypeName("employee")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-04T22:21:26.089-05:00[America/Chicago]")
public class Employee {

  @JsonProperty("employeeId")
  private BigDecimal employeeId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("designation")
  private String designation;

  public Employee employeeId(BigDecimal employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Unique id of an employee
   * @return employeeId
  */
  @Valid 
  @Schema(name = "employeeId", description = "Unique id of an employee", required = false)
  public BigDecimal getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(BigDecimal employeeId) {
    this.employeeId = employeeId;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of an employee
   * @return firstName
  */
  
  @Schema(name = "firstName", description = "First name of an employee", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of an employee
   * @return lastName
  */
  
  @Schema(name = "lastName", description = "Last name of an employee", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address of an employee
   * @return emailAddress
  */
  
  @Schema(name = "emailAddress", description = "Email address of an employee", required = false)
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Employee designation(String designation) {
    this.designation = designation;
    return this;
  }

  /**
   * Designation of an employee
   * @return designation
  */
  
  @Schema(name = "designation", description = "Designation of an employee", required = false)
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.employeeId, employee.employeeId) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.emailAddress, employee.emailAddress) &&
        Objects.equals(this.designation, employee.designation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, firstName, lastName, emailAddress, designation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

