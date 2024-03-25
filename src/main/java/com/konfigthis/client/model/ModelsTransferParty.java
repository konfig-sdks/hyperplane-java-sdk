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
 * Attributes related to the sender or receiver of a given transaction
 */
@ApiModel(description = "Attributes related to the sender or receiver of a given transaction")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsTransferParty {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_BRANCH_NUMBER = "branch_number";
  @SerializedName(SERIALIZED_NAME_BRANCH_NUMBER)
  private String branchNumber;

  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "document_name";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "document_number";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER_I_S_P_B = "routing_number_ISPB";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER_I_S_P_B)
  private String routingNumberISPB;

  public ModelsTransferParty() {
  }

  public ModelsTransferParty accountNumber(String accountNumber) {
    
    
    
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Party account number
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Party account number")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    
    
    
    this.accountNumber = accountNumber;
  }


  public ModelsTransferParty branchNumber(String branchNumber) {
    
    
    
    
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * Party branch number
   * @return branchNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Party branch number")

  public String getBranchNumber() {
    return branchNumber;
  }


  public void setBranchNumber(String branchNumber) {
    
    
    
    this.branchNumber = branchNumber;
  }


  public ModelsTransferParty documentName(String documentName) {
    
    
    
    
    this.documentName = documentName;
    return this;
  }

   /**
   * Party document name
   * @return documentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Party document name")

  public String getDocumentName() {
    return documentName;
  }


  public void setDocumentName(String documentName) {
    
    
    
    this.documentName = documentName;
  }


  public ModelsTransferParty documentNumber(String documentNumber) {
    
    
    
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Party document number
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Party document number")

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    
    
    
    this.documentNumber = documentNumber;
  }


  public ModelsTransferParty name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Party name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Party name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ModelsTransferParty routingNumber(String routingNumber) {
    
    
    
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Party routing number
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Party routing number")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    
    
    
    this.routingNumber = routingNumber;
  }


  public ModelsTransferParty routingNumberISPB(String routingNumberISPB) {
    
    
    
    
    this.routingNumberISPB = routingNumberISPB;
    return this;
  }

   /**
   * Party ISPB routing number
   * @return routingNumberISPB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Party ISPB routing number")

  public String getRoutingNumberISPB() {
    return routingNumberISPB;
  }


  public void setRoutingNumberISPB(String routingNumberISPB) {
    
    
    
    this.routingNumberISPB = routingNumberISPB;
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
   * @return the ModelsTransferParty instance itself
   */
  public ModelsTransferParty putAdditionalProperty(String key, Object value) {
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
    ModelsTransferParty modelsTransferParty = (ModelsTransferParty) o;
    return Objects.equals(this.accountNumber, modelsTransferParty.accountNumber) &&
        Objects.equals(this.branchNumber, modelsTransferParty.branchNumber) &&
        Objects.equals(this.documentName, modelsTransferParty.documentName) &&
        Objects.equals(this.documentNumber, modelsTransferParty.documentNumber) &&
        Objects.equals(this.name, modelsTransferParty.name) &&
        Objects.equals(this.routingNumber, modelsTransferParty.routingNumber) &&
        Objects.equals(this.routingNumberISPB, modelsTransferParty.routingNumberISPB)&&
        Objects.equals(this.additionalProperties, modelsTransferParty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, branchNumber, documentName, documentNumber, name, routingNumber, routingNumberISPB, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTransferParty {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    routingNumberISPB: ").append(toIndentedString(routingNumberISPB)).append("\n");
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
    openapiFields.add("account_number");
    openapiFields.add("branch_number");
    openapiFields.add("document_name");
    openapiFields.add("document_number");
    openapiFields.add("name");
    openapiFields.add("routing_number");
    openapiFields.add("routing_number_ISPB");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsTransferParty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsTransferParty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTransferParty is not found in the empty JSON string", ModelsTransferParty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("branch_number") != null && !jsonObj.get("branch_number").isJsonNull()) && !jsonObj.get("branch_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch_number").toString()));
      }
      if ((jsonObj.get("document_name") != null && !jsonObj.get("document_name").isJsonNull()) && !jsonObj.get("document_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_name").toString()));
      }
      if ((jsonObj.get("document_number") != null && !jsonObj.get("document_number").isJsonNull()) && !jsonObj.get("document_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `document_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("document_number").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("routing_number") != null && !jsonObj.get("routing_number").isJsonNull()) && !jsonObj.get("routing_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routing_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routing_number").toString()));
      }
      if ((jsonObj.get("routing_number_ISPB") != null && !jsonObj.get("routing_number_ISPB").isJsonNull()) && !jsonObj.get("routing_number_ISPB").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routing_number_ISPB` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routing_number_ISPB").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsTransferParty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTransferParty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTransferParty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTransferParty.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTransferParty>() {
           @Override
           public void write(JsonWriter out, ModelsTransferParty value) throws IOException {
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
           public ModelsTransferParty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsTransferParty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsTransferParty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTransferParty
  * @throws IOException if the JSON string is invalid with respect to ModelsTransferParty
  */
  public static ModelsTransferParty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTransferParty.class);
  }

 /**
  * Convert an instance of ModelsTransferParty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
