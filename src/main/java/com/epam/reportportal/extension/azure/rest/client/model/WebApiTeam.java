/*
 * Core
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.1-preview
 * Contact: nugetvss@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.epam.reportportal.extension.azure.rest.client.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import java.util.UUID;

/**
 * 
 */
@Schema(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-22T22:33:25.592Z")
public class WebApiTeam extends WebApiTeamRef {
  @SerializedName("description")
  private String description = null;

  @SerializedName("identity")
  private Identity identity = null;

  @SerializedName("identityUrl")
  private String identityUrl = null;

  @SerializedName("projectId")
  private UUID projectId = null;

  @SerializedName("projectName")
  private String projectName = null;

  public WebApiTeam description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Team description
   * @return description
  **/
  @Schema(description = "Team description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WebApiTeam identity(Identity identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Team identity.
   * @return identity
  **/
  @Schema(description = "Team identity.")
  public Identity getIdentity() {
    return identity;
  }

  public void setIdentity(Identity identity) {
    this.identity = identity;
  }

  public WebApiTeam identityUrl(String identityUrl) {
    this.identityUrl = identityUrl;
    return this;
  }

   /**
   * Identity REST API Url to this team
   * @return identityUrl
  **/
  @Schema(description = "Identity REST API Url to this team")
  public String getIdentityUrl() {
    return identityUrl;
  }

  public void setIdentityUrl(String identityUrl) {
    this.identityUrl = identityUrl;
  }

  public WebApiTeam projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public WebApiTeam projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebApiTeam webApiTeam = (WebApiTeam) o;
    return Objects.equals(this.description, webApiTeam.description) &&
        Objects.equals(this.identity, webApiTeam.identity) &&
        Objects.equals(this.identityUrl, webApiTeam.identityUrl) &&
        Objects.equals(this.projectId, webApiTeam.projectId) &&
        Objects.equals(this.projectName, webApiTeam.projectName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, identity, identityUrl, projectId, projectName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebApiTeam {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identityUrl: ").append(toIndentedString(identityUrl)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
