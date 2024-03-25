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
import com.konfigthis.client.model.ModelsTransferParty;
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
 * Metadata related to the money transfer and involved parties
 */
@ApiModel(description = "Metadata related to the money transfer and involved parties")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsTransferMetadata {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private ModelsTransferParty receiver;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "reference_number";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private ModelsTransferParty sender;

  public ModelsTransferMetadata() {
  }

  public ModelsTransferMetadata paymentMethod(String paymentMethod) {
    
    
    
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Transfer payment method
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transfer payment method")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    
    
    
    this.paymentMethod = paymentMethod;
  }


  public ModelsTransferMetadata reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Transfer inferred reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transfer inferred reason")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public ModelsTransferMetadata receiver(ModelsTransferParty receiver) {
    
    
    
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Transfer party that receives the money
   * @return receiver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transfer party that receives the money")

  public ModelsTransferParty getReceiver() {
    return receiver;
  }


  public void setReceiver(ModelsTransferParty receiver) {
    
    
    
    this.receiver = receiver;
  }


  public ModelsTransferMetadata referenceNumber(String referenceNumber) {
    
    
    
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Transfer reference number
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transfer reference number")

  public String getReferenceNumber() {
    return referenceNumber;
  }


  public void setReferenceNumber(String referenceNumber) {
    
    
    
    this.referenceNumber = referenceNumber;
  }


  public ModelsTransferMetadata sender(ModelsTransferParty sender) {
    
    
    
    
    this.sender = sender;
    return this;
  }

   /**
   * Transfer party that sends the money
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transfer party that sends the money")

  public ModelsTransferParty getSender() {
    return sender;
  }


  public void setSender(ModelsTransferParty sender) {
    
    
    
    this.sender = sender;
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
   * @return the ModelsTransferMetadata instance itself
   */
  public ModelsTransferMetadata putAdditionalProperty(String key, Object value) {
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
    ModelsTransferMetadata modelsTransferMetadata = (ModelsTransferMetadata) o;
    return Objects.equals(this.paymentMethod, modelsTransferMetadata.paymentMethod) &&
        Objects.equals(this.reason, modelsTransferMetadata.reason) &&
        Objects.equals(this.receiver, modelsTransferMetadata.receiver) &&
        Objects.equals(this.referenceNumber, modelsTransferMetadata.referenceNumber) &&
        Objects.equals(this.sender, modelsTransferMetadata.sender)&&
        Objects.equals(this.additionalProperties, modelsTransferMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, reason, receiver, referenceNumber, sender, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTransferMetadata {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
    openapiFields.add("payment_method");
    openapiFields.add("reason");
    openapiFields.add("receiver");
    openapiFields.add("reference_number");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsTransferMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsTransferMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTransferMetadata is not found in the empty JSON string", ModelsTransferMetadata.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      // validate the optional field `receiver`
      if (jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonNull()) {
        ModelsTransferParty.validateJsonObject(jsonObj.getAsJsonObject("receiver"));
      }
      if ((jsonObj.get("reference_number") != null && !jsonObj.get("reference_number").isJsonNull()) && !jsonObj.get("reference_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_number").toString()));
      }
      // validate the optional field `sender`
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) {
        ModelsTransferParty.validateJsonObject(jsonObj.getAsJsonObject("sender"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsTransferMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTransferMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTransferMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTransferMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTransferMetadata>() {
           @Override
           public void write(JsonWriter out, ModelsTransferMetadata value) throws IOException {
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
           public ModelsTransferMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsTransferMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsTransferMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTransferMetadata
  * @throws IOException if the JSON string is invalid with respect to ModelsTransferMetadata
  */
  public static ModelsTransferMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTransferMetadata.class);
  }

 /**
  * Convert an instance of ModelsTransferMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

