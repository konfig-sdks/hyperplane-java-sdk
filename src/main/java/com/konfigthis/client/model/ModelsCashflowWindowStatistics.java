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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Inflow and outflow for a given user in a given time window
 */
@ApiModel(description = "Inflow and outflow for a given user in a given time window")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsCashflowWindowStatistics {
  public static final String SERIALIZED_NAME_INFLOW_AMOUNT = "inflow_amount";
  @SerializedName(SERIALIZED_NAME_INFLOW_AMOUNT)
  private Double inflowAmount;

  public static final String SERIALIZED_NAME_OUTFLOW_AMOUNT = "outflow_amount";
  @SerializedName(SERIALIZED_NAME_OUTFLOW_AMOUNT)
  private Double outflowAmount;

  public static final String SERIALIZED_NAME_WINDOW_END = "window_end";
  @SerializedName(SERIALIZED_NAME_WINDOW_END)
  private String windowEnd;

  public static final String SERIALIZED_NAME_WINDOW_START = "window_start";
  @SerializedName(SERIALIZED_NAME_WINDOW_START)
  private String windowStart;

  public ModelsCashflowWindowStatistics() {
  }

  public ModelsCashflowWindowStatistics inflowAmount(Double inflowAmount) {
    
    
    
    
    this.inflowAmount = inflowAmount;
    return this;
  }

  public ModelsCashflowWindowStatistics inflowAmount(Integer inflowAmount) {
    
    
    
    
    this.inflowAmount = inflowAmount.doubleValue();
    return this;
  }

   /**
   * Inflow amount on the given window
   * @return inflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inflow amount on the given window")

  public Double getInflowAmount() {
    return inflowAmount;
  }


  public void setInflowAmount(Double inflowAmount) {
    
    
    
    this.inflowAmount = inflowAmount;
  }


  public ModelsCashflowWindowStatistics outflowAmount(Double outflowAmount) {
    
    
    
    
    this.outflowAmount = outflowAmount;
    return this;
  }

  public ModelsCashflowWindowStatistics outflowAmount(Integer outflowAmount) {
    
    
    
    
    this.outflowAmount = outflowAmount.doubleValue();
    return this;
  }

   /**
   * Outflow amount on the given window
   * @return outflowAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Outflow amount on the given window")

  public Double getOutflowAmount() {
    return outflowAmount;
  }


  public void setOutflowAmount(Double outflowAmount) {
    
    
    
    this.outflowAmount = outflowAmount;
  }


  public ModelsCashflowWindowStatistics windowEnd(String windowEnd) {
    
    
    
    
    this.windowEnd = windowEnd;
    return this;
  }

   /**
   * End time of the given window
   * @return windowEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End time of the given window")

  public String getWindowEnd() {
    return windowEnd;
  }


  public void setWindowEnd(String windowEnd) {
    
    
    
    this.windowEnd = windowEnd;
  }


  public ModelsCashflowWindowStatistics windowStart(String windowStart) {
    
    
    
    
    this.windowStart = windowStart;
    return this;
  }

   /**
   * Start time of the given window
   * @return windowStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start time of the given window")

  public String getWindowStart() {
    return windowStart;
  }


  public void setWindowStart(String windowStart) {
    
    
    
    this.windowStart = windowStart;
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
   * @return the ModelsCashflowWindowStatistics instance itself
   */
  public ModelsCashflowWindowStatistics putAdditionalProperty(String key, Object value) {
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
    ModelsCashflowWindowStatistics modelsCashflowWindowStatistics = (ModelsCashflowWindowStatistics) o;
    return Objects.equals(this.inflowAmount, modelsCashflowWindowStatistics.inflowAmount) &&
        Objects.equals(this.outflowAmount, modelsCashflowWindowStatistics.outflowAmount) &&
        Objects.equals(this.windowEnd, modelsCashflowWindowStatistics.windowEnd) &&
        Objects.equals(this.windowStart, modelsCashflowWindowStatistics.windowStart)&&
        Objects.equals(this.additionalProperties, modelsCashflowWindowStatistics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inflowAmount, outflowAmount, windowEnd, windowStart, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCashflowWindowStatistics {\n");
    sb.append("    inflowAmount: ").append(toIndentedString(inflowAmount)).append("\n");
    sb.append("    outflowAmount: ").append(toIndentedString(outflowAmount)).append("\n");
    sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
    sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
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
    openapiFields.add("inflow_amount");
    openapiFields.add("outflow_amount");
    openapiFields.add("window_end");
    openapiFields.add("window_start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCashflowWindowStatistics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCashflowWindowStatistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCashflowWindowStatistics is not found in the empty JSON string", ModelsCashflowWindowStatistics.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("window_end") != null && !jsonObj.get("window_end").isJsonNull()) && !jsonObj.get("window_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `window_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("window_end").toString()));
      }
      if ((jsonObj.get("window_start") != null && !jsonObj.get("window_start").isJsonNull()) && !jsonObj.get("window_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `window_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("window_start").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCashflowWindowStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCashflowWindowStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCashflowWindowStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCashflowWindowStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCashflowWindowStatistics>() {
           @Override
           public void write(JsonWriter out, ModelsCashflowWindowStatistics value) throws IOException {
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
           public ModelsCashflowWindowStatistics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsCashflowWindowStatistics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsCashflowWindowStatistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCashflowWindowStatistics
  * @throws IOException if the JSON string is invalid with respect to ModelsCashflowWindowStatistics
  */
  public static ModelsCashflowWindowStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCashflowWindowStatistics.class);
  }

 /**
  * Convert an instance of ModelsCashflowWindowStatistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

