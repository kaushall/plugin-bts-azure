/*
 * WorkItemTracking
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.1-preview
 * Contact: nugetvss@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.epam.reportportal.extension.azure.rest.client.model.workitem;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Describes a state transition in a work item.
 */
@Schema(description = "Describes a state transition in a work item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-03T21:33:08.123Z")
public class WorkItemStateTransition {
  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("to")
  private String to = null;

  public WorkItemStateTransition actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public WorkItemStateTransition addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Gets a list of actions needed to transition to that state.
   * @return actions
  **/
  @Schema(description = "Gets a list of actions needed to transition to that state.")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public WorkItemStateTransition to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Name of the next state.
   * @return to
  **/
  @Schema(description = "Name of the next state.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemStateTransition workItemStateTransition = (WorkItemStateTransition) o;
    return Objects.equals(this.actions, workItemStateTransition.actions) &&
        Objects.equals(this.to, workItemStateTransition.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemStateTransition {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
