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
 * Inferred merchant info after transaction enrichment
 */
@ApiModel(description = "Inferred merchant info after transaction enrichment")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsMerchantInfo {
  public static final String SERIALIZED_NAME_BUSINESS_NAME = "business_name";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CNAE = "cnae";
  @SerializedName(SERIALIZED_NAME_CNAE)
  private String cnae;

  public static final String SERIALIZED_NAME_CNPJ = "cnpj";
  @SerializedName(SERIALIZED_NAME_CNPJ)
  private String cnpj;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ModelsMerchantInfo() {
  }

  public ModelsMerchantInfo businessName(String businessName) {
    
    
    
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Merchant business name
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant business name")

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    
    
    
    this.businessName = businessName;
  }


  public ModelsMerchantInfo category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Merchant category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant category")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public ModelsMerchantInfo cnae(String cnae) {
    
    
    
    
    this.cnae = cnae;
    return this;
  }

   /**
   * Merchant CNAE
   * @return cnae
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant CNAE")

  public String getCnae() {
    return cnae;
  }


  public void setCnae(String cnae) {
    
    
    
    this.cnae = cnae;
  }


  public ModelsMerchantInfo cnpj(String cnpj) {
    
    
    
    
    this.cnpj = cnpj;
    return this;
  }

   /**
   * Merchant CNPJ
   * @return cnpj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant CNPJ")

  public String getCnpj() {
    return cnpj;
  }


  public void setCnpj(String cnpj) {
    
    
    
    this.cnpj = cnpj;
  }


  public ModelsMerchantInfo name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Merchant name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
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
   * @return the ModelsMerchantInfo instance itself
   */
  public ModelsMerchantInfo putAdditionalProperty(String key, Object value) {
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
    ModelsMerchantInfo modelsMerchantInfo = (ModelsMerchantInfo) o;
    return Objects.equals(this.businessName, modelsMerchantInfo.businessName) &&
        Objects.equals(this.category, modelsMerchantInfo.category) &&
        Objects.equals(this.cnae, modelsMerchantInfo.cnae) &&
        Objects.equals(this.cnpj, modelsMerchantInfo.cnpj) &&
        Objects.equals(this.name, modelsMerchantInfo.name)&&
        Objects.equals(this.additionalProperties, modelsMerchantInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, category, cnae, cnpj, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsMerchantInfo {\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    cnae: ").append(toIndentedString(cnae)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("business_name");
    openapiFields.add("category");
    openapiFields.add("cnae");
    openapiFields.add("cnpj");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsMerchantInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsMerchantInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsMerchantInfo is not found in the empty JSON string", ModelsMerchantInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("business_name") != null && !jsonObj.get("business_name").isJsonNull()) && !jsonObj.get("business_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_name").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("cnae") != null && !jsonObj.get("cnae").isJsonNull()) && !jsonObj.get("cnae").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnae` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnae").toString()));
      }
      if ((jsonObj.get("cnpj") != null && !jsonObj.get("cnpj").isJsonNull()) && !jsonObj.get("cnpj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnpj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnpj").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsMerchantInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsMerchantInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsMerchantInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsMerchantInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsMerchantInfo>() {
           @Override
           public void write(JsonWriter out, ModelsMerchantInfo value) throws IOException {
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
           public ModelsMerchantInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsMerchantInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsMerchantInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsMerchantInfo
  * @throws IOException if the JSON string is invalid with respect to ModelsMerchantInfo
  */
  public static ModelsMerchantInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsMerchantInfo.class);
  }

 /**
  * Convert an instance of ModelsMerchantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

