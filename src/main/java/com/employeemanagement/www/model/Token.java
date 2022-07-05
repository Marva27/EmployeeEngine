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
 * Structure of a JWT
 */

@Schema(name = "token", description = "Structure of a JWT")
@JsonTypeName("token")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-04T22:21:26.089-05:00[America/Chicago]")
public class Token {

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("jwt")
  private String jwt;

  public Token userName(String userName) {
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

  public Token jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }

  /**
   * JWT Code
   * @return jwt
  */
  
  @Schema(name = "jwt", description = "JWT Code", required = false)
  public String getJwt() {
    return jwt;
  }

  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.userName, token.userName) &&
        Objects.equals(this.jwt, token.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, jwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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

