package com.employeemanagement.www.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Structure of an admin user signup
 */

@Schema(name = "adminUserSignUp", description = "Structure of an admin user signup")
@JsonTypeName("adminUserSignUp")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-04T22:21:26.089-05:00[America/Chicago]")
public class AdminUserSignUp {

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("password")
  private String password;

  public AdminUserSignUp firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the admin user
   * @return firstName
  */
  
  @Schema(name = "firstName", description = "First name of the admin user", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AdminUserSignUp lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the admin user
   * @return lastName
  */
  
  @Schema(name = "lastName", description = "Last name of the admin user", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AdminUserSignUp emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address of the admin user
   * @return emailAddress
  */
  
  @Schema(name = "emailAddress", description = "Email address of the admin user", required = false)
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public AdminUserSignUp userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Username of the admin user
   * @return userName
  */
  
  @Schema(name = "userName", description = "Username of the admin user", required = false)
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AdminUserSignUp password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the admin user
   * @return password
  */
  
  @Schema(name = "password", description = "Password of the admin user", required = false)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminUserSignUp adminUserSignUp = (AdminUserSignUp) o;
    return Objects.equals(this.firstName, adminUserSignUp.firstName) &&
        Objects.equals(this.lastName, adminUserSignUp.lastName) &&
        Objects.equals(this.emailAddress, adminUserSignUp.emailAddress) &&
        Objects.equals(this.userName, adminUserSignUp.userName) &&
        Objects.equals(this.password, adminUserSignUp.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, userName, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminUserSignUp {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

