/*
 * Hyperplane API Gateway
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ModelsCategoricalAttributeFilter;
import com.konfigthis.client.model.ModelsNumericalAttributeFilter;
import com.konfigthis.client.model.ModelsTimestampAttributeFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Extra information for filtering users
 */
@ApiModel(description = "Extra information for filtering users")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsPostPersonaUsersRequest {
  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private ModelsTimestampAttributeFilter birthDate;

  public static final String SERIALIZED_NAME_BLOCKLIST = "blocklist";
  @SerializedName(SERIALIZED_NAME_BLOCKLIST)
  private List<String> blocklist = new ArrayList<>();

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private ModelsCategoricalAttributeFilter branch;

  public static final String SERIALIZED_NAME_CBO_CODE = "cbo_code";
  @SerializedName(SERIALIZED_NAME_CBO_CODE)
  private ModelsCategoricalAttributeFilter cboCode;

  public static final String SERIALIZED_NAME_DECLARED_MONTHLY_INCOME = "declared_monthly_income";
  @SerializedName(SERIALIZED_NAME_DECLARED_MONTHLY_INCOME)
  private ModelsNumericalAttributeFilter declaredMonthlyIncome;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private ModelsCategoricalAttributeFilter jobTitle;

  public ModelsPostPersonaUsersRequest() {
  }

  public ModelsPostPersonaUsersRequest birthDate(ModelsTimestampAttributeFilter birthDate) {
    
    
    
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Filter birth date based on a date range
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter birth date based on a date range")

  public ModelsTimestampAttributeFilter getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(ModelsTimestampAttributeFilter birthDate) {
    
    
    
    this.birthDate = birthDate;
  }


  public ModelsPostPersonaUsersRequest blocklist(List<String> blocklist) {
    
    
    
    
    this.blocklist = blocklist;
    return this;
  }

  public ModelsPostPersonaUsersRequest addBlocklistItem(String blocklistItem) {
    this.blocklist.add(blocklistItem);
    return this;
  }

   /**
   * List of user ids to not be included in the response
   * @return blocklist
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"['1234']\"]", required = true, value = "List of user ids to not be included in the response")

  public List<String> getBlocklist() {
    return blocklist;
  }


  public void setBlocklist(List<String> blocklist) {
    
    
    
    this.blocklist = blocklist;
  }


  public ModelsPostPersonaUsersRequest branch(ModelsCategoricalAttributeFilter branch) {
    
    
    
    
    this.branch = branch;
    return this;
  }

   /**
   * Filter branch based on a list of allowed values
   * @return branch
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Filter branch based on a list of allowed values")

  public ModelsCategoricalAttributeFilter getBranch() {
    return branch;
  }


  public void setBranch(ModelsCategoricalAttributeFilter branch) {
    
    
    
    this.branch = branch;
  }


  public ModelsPostPersonaUsersRequest cboCode(ModelsCategoricalAttributeFilter cboCode) {
    
    
    
    
    this.cboCode = cboCode;
    return this;
  }

   /**
   * Filter cbo code based on a list of allowed values
   * @return cboCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter cbo code based on a list of allowed values")

  public ModelsCategoricalAttributeFilter getCboCode() {
    return cboCode;
  }


  public void setCboCode(ModelsCategoricalAttributeFilter cboCode) {
    
    
    
    this.cboCode = cboCode;
  }


  public ModelsPostPersonaUsersRequest declaredMonthlyIncome(ModelsNumericalAttributeFilter declaredMonthlyIncome) {
    
    
    
    
    this.declaredMonthlyIncome = declaredMonthlyIncome;
    return this;
  }

   /**
   * Filter declared monthly income based on a numeric range
   * @return declaredMonthlyIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter declared monthly income based on a numeric range")

  public ModelsNumericalAttributeFilter getDeclaredMonthlyIncome() {
    return declaredMonthlyIncome;
  }


  public void setDeclaredMonthlyIncome(ModelsNumericalAttributeFilter declaredMonthlyIncome) {
    
    
    
    this.declaredMonthlyIncome = declaredMonthlyIncome;
  }


  public ModelsPostPersonaUsersRequest jobTitle(ModelsCategoricalAttributeFilter jobTitle) {
    
    
    
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Filter job title based on a list of allowed values
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter job title based on a list of allowed values")

  public ModelsCategoricalAttributeFilter getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(ModelsCategoricalAttributeFilter jobTitle) {
    
    
    
    this.jobTitle = jobTitle;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ModelsPostPersonaUsersRequest instance itself
   */
  public ModelsPostPersonaUsersRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsPostPersonaUsersRequest modelsPostPersonaUsersRequest = (ModelsPostPersonaUsersRequest) o;
    return Objects.equals(this.birthDate, modelsPostPersonaUsersRequest.birthDate) &&
        Objects.equals(this.blocklist, modelsPostPersonaUsersRequest.blocklist) &&
        Objects.equals(this.branch, modelsPostPersonaUsersRequest.branch) &&
        Objects.equals(this.cboCode, modelsPostPersonaUsersRequest.cboCode) &&
        Objects.equals(this.declaredMonthlyIncome, modelsPostPersonaUsersRequest.declaredMonthlyIncome) &&
        Objects.equals(this.jobTitle, modelsPostPersonaUsersRequest.jobTitle)&&
        Objects.equals(this.additionalProperties, modelsPostPersonaUsersRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, blocklist, branch, cboCode, declaredMonthlyIncome, jobTitle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsPostPersonaUsersRequest {\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    blocklist: ").append(toIndentedString(blocklist)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    cboCode: ").append(toIndentedString(cboCode)).append("\n");
    sb.append("    declaredMonthlyIncome: ").append(toIndentedString(declaredMonthlyIncome)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("birth_date");
    openapiFields.add("blocklist");
    openapiFields.add("branch");
    openapiFields.add("cbo_code");
    openapiFields.add("declared_monthly_income");
    openapiFields.add("job_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blocklist");
    openapiRequiredFields.add("branch");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsPostPersonaUsersRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsPostPersonaUsersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsPostPersonaUsersRequest is not found in the empty JSON string", ModelsPostPersonaUsersRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsPostPersonaUsersRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `birth_date`
      if (jsonObj.get("birth_date") != null && !jsonObj.get("birth_date").isJsonNull()) {
        ModelsTimestampAttributeFilter.validateJsonObject(jsonObj.getAsJsonObject("birth_date"));
      }
      // ensure the required json array is present
      if (jsonObj.get("blocklist") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("blocklist").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blocklist` to be an array in the JSON string but got `%s`", jsonObj.get("blocklist").toString()));
      }
      // validate the required field `branch`
      ModelsCategoricalAttributeFilter.validateJsonObject(jsonObj.getAsJsonObject("branch"));
      // validate the optional field `cbo_code`
      if (jsonObj.get("cbo_code") != null && !jsonObj.get("cbo_code").isJsonNull()) {
        ModelsCategoricalAttributeFilter.validateJsonObject(jsonObj.getAsJsonObject("cbo_code"));
      }
      // validate the optional field `declared_monthly_income`
      if (jsonObj.get("declared_monthly_income") != null && !jsonObj.get("declared_monthly_income").isJsonNull()) {
        ModelsNumericalAttributeFilter.validateJsonObject(jsonObj.getAsJsonObject("declared_monthly_income"));
      }
      // validate the optional field `job_title`
      if (jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) {
        ModelsCategoricalAttributeFilter.validateJsonObject(jsonObj.getAsJsonObject("job_title"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsPostPersonaUsersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsPostPersonaUsersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsPostPersonaUsersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsPostPersonaUsersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsPostPersonaUsersRequest>() {
           @Override
           public void write(JsonWriter out, ModelsPostPersonaUsersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsPostPersonaUsersRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsPostPersonaUsersRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsPostPersonaUsersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsPostPersonaUsersRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsPostPersonaUsersRequest
  */
  public static ModelsPostPersonaUsersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsPostPersonaUsersRequest.class);
  }

 /**
  * Convert an instance of ModelsPostPersonaUsersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
