// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.cloudera.director.client.d6_0.model;

import java.util.Objects;
import com.cloudera.director.client.d6_0.model.DiagnosticDataSummary;
import com.cloudera.director.client.d6_0.model.ErrorInfo;
import com.cloudera.director.client.d6_0.model.Health;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The status of a multi-step Cloudera Altus Director process
 */
@ApiModel(description = "The status of a multi-step Cloudera Altus Director process")

public class Status {
  @SerializedName("completedSteps")
  private Integer completedSteps = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("descriptionDetails")
  private List<String> descriptionDetails = null;
  @SerializedName("diagnosticDataSummaries")
  private List<DiagnosticDataSummary> diagnosticDataSummaries = null;
  @SerializedName("errorInfo")
  private ErrorInfo errorInfo = null;
  @SerializedName("health")
  private Health health = null;
  @SerializedName("remainingSteps")
  private Integer remainingSteps = null;
  /**
   * Current stage of the process
   */
  @JsonAdapter(StageEnum.Adapter.class)
  public enum StageEnum {
    BOOTSTRAPPING("BOOTSTRAPPING"),
    
    BOOTSTRAP_FAILED("BOOTSTRAP_FAILED"),
    
    READY("READY"),
    
    UPDATING("UPDATING"),
    
    UPDATE_FAILED("UPDATE_FAILED"),
    
    TERMINATING("TERMINATING"),
    
    TERMINATE_FAILED("TERMINATE_FAILED"),
    
    TERMINATED("TERMINATED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StageEnum fromValue(String text) {
      for (StageEnum b : StageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("stage")
  private StageEnum stage = null;

  public Status() {
    // Do nothing
  }

  private Status(StatusBuilder builder) {
      this.completedSteps = builder.completedSteps;
      this.description = builder.description;
      this.descriptionDetails = builder.descriptionDetails;
      this.diagnosticDataSummaries = builder.diagnosticDataSummaries;
      this.errorInfo = builder.errorInfo;
      this.health = builder.health;
      this.remainingSteps = builder.remainingSteps;
      this.stage = builder.stage;
    }

  public static StatusBuilder builder() {
    return new StatusBuilder();
  }

  public static class StatusBuilder {
      private Integer completedSteps = null;
      private String description = null;
      private List<String> descriptionDetails = new ArrayList<String>();
      private List<DiagnosticDataSummary> diagnosticDataSummaries = new ArrayList<DiagnosticDataSummary>();
      private ErrorInfo errorInfo = null;
      private Health health = null;
      private Integer remainingSteps = null;
      private StageEnum stage = null;
  

    public StatusBuilder completedSteps(Integer completedSteps) {
      this.completedSteps = completedSteps;
      return this;
    }


    public StatusBuilder description(String description) {
      this.description = description;
      return this;
    }


    public StatusBuilder descriptionDetails(List<String> descriptionDetails) {
      this.descriptionDetails = descriptionDetails;
      return this;
    }


    public StatusBuilder diagnosticDataSummaries(List<DiagnosticDataSummary> diagnosticDataSummaries) {
      this.diagnosticDataSummaries = diagnosticDataSummaries;
      return this;
    }


    public StatusBuilder errorInfo(ErrorInfo errorInfo) {
      this.errorInfo = errorInfo;
      return this;
    }


    public StatusBuilder health(Health health) {
      this.health = health;
      return this;
    }


    public StatusBuilder remainingSteps(Integer remainingSteps) {
      this.remainingSteps = remainingSteps;
      return this;
    }


    public StatusBuilder stage(StageEnum stage) {
      this.stage = stage;
      return this;
    }


    public Status build() {
      return new Status(this);
    }
  }

  public StatusBuilder toBuilder() {
    return builder()
      .completedSteps(completedSteps)
            .description(description)
            .descriptionDetails(descriptionDetails)
            .diagnosticDataSummaries(diagnosticDataSummaries)
            .errorInfo(errorInfo)
            .health(health)
            .remainingSteps(remainingSteps)
            .stage(stage)
      ;
  }

  public Status completedSteps(Integer completedSteps) {
    this.completedSteps = completedSteps;
    return this;
  }

   /**
   * Number of steps completed for the process
   * @return completedSteps
  **/
  @ApiModelProperty(required = true, value = "Number of steps completed for the process")
  public Integer getCompletedSteps() {
    return completedSteps;
  }

  public void setCompletedSteps(Integer completedSteps) {
    this.completedSteps = completedSteps;
  }

  public Status description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Status description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Status description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Status descriptionDetails(List<String> descriptionDetails) {
    this.descriptionDetails = descriptionDetails;
    return this;
  }

  public Status addDescriptionDetailsItem(String descriptionDetailsItem) {
    if (this.descriptionDetails == null) {
      this.descriptionDetails = new ArrayList<String>();
    }
    this.descriptionDetails.add(descriptionDetailsItem);
    return this;
  }

   /**
   * Detailed status description
   * @return descriptionDetails
  **/
  @ApiModelProperty(value = "Detailed status description")
  public List<String> getDescriptionDetails() {
    return descriptionDetails;
  }

  public void setDescriptionDetails(List<String> descriptionDetails) {
    this.descriptionDetails = descriptionDetails;
  }

  public Status diagnosticDataSummaries(List<DiagnosticDataSummary> diagnosticDataSummaries) {
    this.diagnosticDataSummaries = diagnosticDataSummaries;
    return this;
  }

  public Status addDiagnosticDataSummariesItem(DiagnosticDataSummary diagnosticDataSummariesItem) {
    if (this.diagnosticDataSummaries == null) {
      this.diagnosticDataSummaries = new ArrayList<DiagnosticDataSummary>();
    }
    this.diagnosticDataSummaries.add(diagnosticDataSummariesItem);
    return this;
  }

   /**
   * Diagnostic data summaries
   * @return diagnosticDataSummaries
  **/
  @ApiModelProperty(value = "Diagnostic data summaries")
  public List<DiagnosticDataSummary> getDiagnosticDataSummaries() {
    return diagnosticDataSummaries;
  }

  public void setDiagnosticDataSummaries(List<DiagnosticDataSummary> diagnosticDataSummaries) {
    this.diagnosticDataSummaries = diagnosticDataSummaries;
  }

  public Status errorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * Error information associated with the status
   * @return errorInfo
  **/
  @ApiModelProperty(value = "Error information associated with the status")
  public ErrorInfo getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(ErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }

  public Status health(Health health) {
    this.health = health;
    return this;
  }

   /**
   * Health reported for the entity being processed
   * @return health
  **/
  @ApiModelProperty(required = true, value = "Health reported for the entity being processed")
  public Health getHealth() {
    return health;
  }

  public void setHealth(Health health) {
    this.health = health;
  }

  public Status remainingSteps(Integer remainingSteps) {
    this.remainingSteps = remainingSteps;
    return this;
  }

   /**
   * Number of remaining steps planned for the process
   * @return remainingSteps
  **/
  @ApiModelProperty(required = true, value = "Number of remaining steps planned for the process")
  public Integer getRemainingSteps() {
    return remainingSteps;
  }

  public void setRemainingSteps(Integer remainingSteps) {
    this.remainingSteps = remainingSteps;
  }

  public Status stage(StageEnum stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Current stage of the process
   * @return stage
  **/
  @ApiModelProperty(required = true, value = "Current stage of the process")
  public StageEnum getStage() {
    return stage;
  }

  public void setStage(StageEnum stage) {
    this.stage = stage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.completedSteps, status.completedSteps) &&
        Objects.equals(this.description, status.description) &&
        Objects.equals(this.descriptionDetails, status.descriptionDetails) &&
        Objects.equals(this.diagnosticDataSummaries, status.diagnosticDataSummaries) &&
        Objects.equals(this.errorInfo, status.errorInfo) &&
        Objects.equals(this.health, status.health) &&
        Objects.equals(this.remainingSteps, status.remainingSteps) &&
        Objects.equals(this.stage, status.stage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedSteps, description, descriptionDetails, diagnosticDataSummaries, errorInfo, health, remainingSteps, stage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    completedSteps: ").append(toIndentedString(completedSteps)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionDetails: ").append(toIndentedString(descriptionDetails)).append("\n");
    sb.append("    diagnosticDataSummaries: ").append(toIndentedString(diagnosticDataSummaries)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    remainingSteps: ").append(toIndentedString(remainingSteps)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

