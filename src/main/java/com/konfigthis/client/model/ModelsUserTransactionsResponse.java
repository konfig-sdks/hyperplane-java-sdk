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
import com.konfigthis.client.model.ModelsPaginationMetadata;
import com.konfigthis.client.model.ModelsTransactionEnrichmentResponse;
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
 * Historic of enriched transactions of a given user
 */
@ApiModel(description = "Historic of enriched transactions of a given user")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsUserTransactionsResponse {
  public static final String SERIALIZED_NAME_ENRICHED_TRANSACTIONS = "enriched_transactions";
  @SerializedName(SERIALIZED_NAME_ENRICHED_TRANSACTIONS)
  private List<ModelsTransactionEnrichmentResponse> enrichedTransactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGINATION_METADATA = "pagination_metadata";
  @SerializedName(SERIALIZED_NAME_PAGINATION_METADATA)
  private ModelsPaginationMetadata paginationMetadata;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ModelsUserTransactionsResponse() {
  }

  public ModelsUserTransactionsResponse enrichedTransactions(List<ModelsTransactionEnrichmentResponse> enrichedTransactions) {
    
    
    
    
    this.enrichedTransactions = enrichedTransactions;
    return this;
  }

  public ModelsUserTransactionsResponse addEnrichedTransactionsItem(ModelsTransactionEnrichmentResponse enrichedTransactionsItem) {
    this.enrichedTransactions.add(enrichedTransactionsItem);
    return this;
  }

   /**
   * List of enriched transactions
   * @return enrichedTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of enriched transactions")

  public List<ModelsTransactionEnrichmentResponse> getEnrichedTransactions() {
    return enrichedTransactions;
  }


  public void setEnrichedTransactions(List<ModelsTransactionEnrichmentResponse> enrichedTransactions) {
    
    
    
    this.enrichedTransactions = enrichedTransactions;
  }


  public ModelsUserTransactionsResponse paginationMetadata(ModelsPaginationMetadata paginationMetadata) {
    
    
    
    
    this.paginationMetadata = paginationMetadata;
    return this;
  }

   /**
   * Pagination metadata needed to know the next call
   * @return paginationMetadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Pagination metadata needed to know the next call")

  public ModelsPaginationMetadata getPaginationMetadata() {
    return paginationMetadata;
  }


  public void setPaginationMetadata(ModelsPaginationMetadata paginationMetadata) {
    
    
    
    this.paginationMetadata = paginationMetadata;
  }


  public ModelsUserTransactionsResponse userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * User identifier
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123456", required = true, value = "User identifier")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
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
   * @return the ModelsUserTransactionsResponse instance itself
   */
  public ModelsUserTransactionsResponse putAdditionalProperty(String key, Object value) {
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
    ModelsUserTransactionsResponse modelsUserTransactionsResponse = (ModelsUserTransactionsResponse) o;
    return Objects.equals(this.enrichedTransactions, modelsUserTransactionsResponse.enrichedTransactions) &&
        Objects.equals(this.paginationMetadata, modelsUserTransactionsResponse.paginationMetadata) &&
        Objects.equals(this.userId, modelsUserTransactionsResponse.userId)&&
        Objects.equals(this.additionalProperties, modelsUserTransactionsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrichedTransactions, paginationMetadata, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsUserTransactionsResponse {\n");
    sb.append("    enrichedTransactions: ").append(toIndentedString(enrichedTransactions)).append("\n");
    sb.append("    paginationMetadata: ").append(toIndentedString(paginationMetadata)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("enriched_transactions");
    openapiFields.add("pagination_metadata");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enriched_transactions");
    openapiRequiredFields.add("pagination_metadata");
    openapiRequiredFields.add("user_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsUserTransactionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsUserTransactionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsUserTransactionsResponse is not found in the empty JSON string", ModelsUserTransactionsResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsUserTransactionsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("enriched_transactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `enriched_transactions` to be an array in the JSON string but got `%s`", jsonObj.get("enriched_transactions").toString()));
      }

      JsonArray jsonArrayenrichedTransactions = jsonObj.getAsJsonArray("enriched_transactions");
      // validate the required field `enriched_transactions` (array)
      for (int i = 0; i < jsonArrayenrichedTransactions.size(); i++) {
        ModelsTransactionEnrichmentResponse.validateJsonObject(jsonArrayenrichedTransactions.get(i).getAsJsonObject());
      };
      // validate the required field `pagination_metadata`
      ModelsPaginationMetadata.validateJsonObject(jsonObj.getAsJsonObject("pagination_metadata"));
      if (!jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsUserTransactionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsUserTransactionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsUserTransactionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsUserTransactionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsUserTransactionsResponse>() {
           @Override
           public void write(JsonWriter out, ModelsUserTransactionsResponse value) throws IOException {
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
           public ModelsUserTransactionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsUserTransactionsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsUserTransactionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsUserTransactionsResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsUserTransactionsResponse
  */
  public static ModelsUserTransactionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsUserTransactionsResponse.class);
  }

 /**
  * Convert an instance of ModelsUserTransactionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

