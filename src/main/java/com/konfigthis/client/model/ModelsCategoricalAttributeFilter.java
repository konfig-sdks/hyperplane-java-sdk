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
 * ModelsCategoricalAttributeFilter
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsCategoricalAttributeFilter {
  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowed_values";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List<String> allowedValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_BLOCKED_VALUES = "blocked_values";
  @SerializedName(SERIALIZED_NAME_BLOCKED_VALUES)
  private List<String> blockedValues = new ArrayList<>();

  public ModelsCategoricalAttributeFilter() {
  }

  public ModelsCategoricalAttributeFilter allowedValues(List<String> allowedValues) {
    
    
    
    
    this.allowedValues = allowedValues;
    return this;
  }

  public ModelsCategoricalAttributeFilter addAllowedValuesItem(String allowedValuesItem) {
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * Allowed values
   * @return allowedValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"['0002']\"]", required = true, value = "Allowed values")

  public List<String> getAllowedValues() {
    return allowedValues;
  }


  public void setAllowedValues(List<String> allowedValues) {
    
    
    
    this.allowedValues = allowedValues;
  }


  public ModelsCategoricalAttributeFilter blockedValues(List<String> blockedValues) {
    
    
    
    
    this.blockedValues = blockedValues;
    return this;
  }

  public ModelsCategoricalAttributeFilter addBlockedValuesItem(String blockedValuesItem) {
    this.blockedValues.add(blockedValuesItem);
    return this;
  }

   /**
   * Blocked values
   * @return blockedValues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Blocked values")

  public List<String> getBlockedValues() {
    return blockedValues;
  }


  public void setBlockedValues(List<String> blockedValues) {
    
    
    
    this.blockedValues = blockedValues;
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
   * @return the ModelsCategoricalAttributeFilter instance itself
   */
  public ModelsCategoricalAttributeFilter putAdditionalProperty(String key, Object value) {
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
    ModelsCategoricalAttributeFilter modelsCategoricalAttributeFilter = (ModelsCategoricalAttributeFilter) o;
    return Objects.equals(this.allowedValues, modelsCategoricalAttributeFilter.allowedValues) &&
        Objects.equals(this.blockedValues, modelsCategoricalAttributeFilter.blockedValues)&&
        Objects.equals(this.additionalProperties, modelsCategoricalAttributeFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, blockedValues, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCategoricalAttributeFilter {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    blockedValues: ").append(toIndentedString(blockedValues)).append("\n");
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
    openapiFields.add("allowed_values");
    openapiFields.add("blocked_values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("allowed_values");
    openapiRequiredFields.add("blocked_values");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCategoricalAttributeFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCategoricalAttributeFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCategoricalAttributeFilter is not found in the empty JSON string", ModelsCategoricalAttributeFilter.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsCategoricalAttributeFilter.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("allowed_values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("allowed_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_values` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_values").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("blocked_values") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("blocked_values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blocked_values` to be an array in the JSON string but got `%s`", jsonObj.get("blocked_values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCategoricalAttributeFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCategoricalAttributeFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCategoricalAttributeFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCategoricalAttributeFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCategoricalAttributeFilter>() {
           @Override
           public void write(JsonWriter out, ModelsCategoricalAttributeFilter value) throws IOException {
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
           public ModelsCategoricalAttributeFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsCategoricalAttributeFilter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsCategoricalAttributeFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCategoricalAttributeFilter
  * @throws IOException if the JSON string is invalid with respect to ModelsCategoricalAttributeFilter
  */
  public static ModelsCategoricalAttributeFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCategoricalAttributeFilter.class);
  }

 /**
  * Convert an instance of ModelsCategoricalAttributeFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

