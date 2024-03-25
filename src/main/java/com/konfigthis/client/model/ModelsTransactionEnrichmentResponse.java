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
import com.konfigthis.client.model.ModelsLocation;
import com.konfigthis.client.model.ModelsMerchantInfo;
import com.konfigthis.client.model.ModelsTransferMetadata;
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
 * ModelsTransactionEnrichmentResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsTransactionEnrichmentResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CURRENT_INSTALLMENT = "current_installment";
  @SerializedName(SERIALIZED_NAME_CURRENT_INSTALLMENT)
  private Integer currentInstallment;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_INSTALLMENT_START_DATE = "installment_start_date";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_START_DATE)
  private String installmentStartDate;

  public static final String SERIALIZED_NAME_MERCHANT_INFO = "merchant_info";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INFO)
  private ModelsMerchantInfo merchantInfo;

  public static final String SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS = "number_of_installments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS)
  private Integer numberOfInstallments;

  public static final String SERIALIZED_NAME_TOTAL_INSTALLED_AMOUNT = "total_installed_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_INSTALLED_AMOUNT)
  private Double totalInstalledAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_LOCATION = "transaction_location";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_LOCATION)
  private ModelsLocation transactionLocation;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transaction_status";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public static final String SERIALIZED_NAME_TRANSFER_METADATA = "transfer_metadata";
  @SerializedName(SERIALIZED_NAME_TRANSFER_METADATA)
  private ModelsTransferMetadata transferMetadata;

  public ModelsTransactionEnrichmentResponse() {
  }

  public ModelsTransactionEnrichmentResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Transaction description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ModelsTransactionEnrichmentResponse amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public ModelsTransactionEnrichmentResponse amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * Amount of transaction
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of transaction")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public ModelsTransactionEnrichmentResponse category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Category enum of transaction
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category enum of transaction")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public ModelsTransactionEnrichmentResponse categoryName(String categoryName) {
    
    
    
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Category human-readable name of transaction
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category human-readable name of transaction")

  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    
    
    
    this.categoryName = categoryName;
  }


  public ModelsTransactionEnrichmentResponse currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Transaction currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction currency")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public ModelsTransactionEnrichmentResponse currentInstallment(Integer currentInstallment) {
    
    
    
    
    this.currentInstallment = currentInstallment;
    return this;
  }

   /**
   * Current installment. If 0, it is not an installment
   * @return currentInstallment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current installment. If 0, it is not an installment")

  public Integer getCurrentInstallment() {
    return currentInstallment;
  }


  public void setCurrentInstallment(Integer currentInstallment) {
    
    
    
    this.currentInstallment = currentInstallment;
  }


  public ModelsTransactionEnrichmentResponse date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Date of transaction
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of transaction")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public ModelsTransactionEnrichmentResponse installmentStartDate(String installmentStartDate) {
    
    
    
    
    this.installmentStartDate = installmentStartDate;
    return this;
  }

   /**
   * First installment date, that is, the purchase date
   * @return installmentStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First installment date, that is, the purchase date")

  public String getInstallmentStartDate() {
    return installmentStartDate;
  }


  public void setInstallmentStartDate(String installmentStartDate) {
    
    
    
    this.installmentStartDate = installmentStartDate;
  }


  public ModelsTransactionEnrichmentResponse merchantInfo(ModelsMerchantInfo merchantInfo) {
    
    
    
    
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Contains metadata about the merchant, if available.
   * @return merchantInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains metadata about the merchant, if available.")

  public ModelsMerchantInfo getMerchantInfo() {
    return merchantInfo;
  }


  public void setMerchantInfo(ModelsMerchantInfo merchantInfo) {
    
    
    
    this.merchantInfo = merchantInfo;
  }


  public ModelsTransactionEnrichmentResponse numberOfInstallments(Integer numberOfInstallments) {
    
    
    
    
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Number of installments
   * @return numberOfInstallments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of installments")

  public Integer getNumberOfInstallments() {
    return numberOfInstallments;
  }


  public void setNumberOfInstallments(Integer numberOfInstallments) {
    
    
    
    this.numberOfInstallments = numberOfInstallments;
  }


  public ModelsTransactionEnrichmentResponse totalInstalledAmount(Double totalInstalledAmount) {
    
    
    
    
    this.totalInstalledAmount = totalInstalledAmount;
    return this;
  }

  public ModelsTransactionEnrichmentResponse totalInstalledAmount(Integer totalInstalledAmount) {
    
    
    
    
    this.totalInstalledAmount = totalInstalledAmount.doubleValue();
    return this;
  }

   /**
   * Sum of amounts for all installments
   * @return totalInstalledAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of amounts for all installments")

  public Double getTotalInstalledAmount() {
    return totalInstalledAmount;
  }


  public void setTotalInstalledAmount(Double totalInstalledAmount) {
    
    
    
    this.totalInstalledAmount = totalInstalledAmount;
  }


  public ModelsTransactionEnrichmentResponse transactionId(String transactionId) {
    
    
    
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Unique transaction id
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique transaction id")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    
    
    
    this.transactionId = transactionId;
  }


  public ModelsTransactionEnrichmentResponse transactionLocation(ModelsLocation transactionLocation) {
    
    
    
    
    this.transactionLocation = transactionLocation;
    return this;
  }

   /**
   * Location where the transaction happened
   * @return transactionLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location where the transaction happened")

  public ModelsLocation getTransactionLocation() {
    return transactionLocation;
  }


  public void setTransactionLocation(ModelsLocation transactionLocation) {
    
    
    
    this.transactionLocation = transactionLocation;
  }


  public ModelsTransactionEnrichmentResponse transactionStatus(String transactionStatus) {
    
    
    
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Transaction status
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction status")

  public String getTransactionStatus() {
    return transactionStatus;
  }


  public void setTransactionStatus(String transactionStatus) {
    
    
    
    this.transactionStatus = transactionStatus;
  }


  public ModelsTransactionEnrichmentResponse transferMetadata(ModelsTransferMetadata transferMetadata) {
    
    
    
    
    this.transferMetadata = transferMetadata;
    return this;
  }

   /**
   * Contains metadata about the payment method, the sender, and the receiver.
   * @return transferMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains metadata about the payment method, the sender, and the receiver.")

  public ModelsTransferMetadata getTransferMetadata() {
    return transferMetadata;
  }


  public void setTransferMetadata(ModelsTransferMetadata transferMetadata) {
    
    
    
    this.transferMetadata = transferMetadata;
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
   * @return the ModelsTransactionEnrichmentResponse instance itself
   */
  public ModelsTransactionEnrichmentResponse putAdditionalProperty(String key, Object value) {
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
    ModelsTransactionEnrichmentResponse modelsTransactionEnrichmentResponse = (ModelsTransactionEnrichmentResponse) o;
    return Objects.equals(this.description, modelsTransactionEnrichmentResponse.description) &&
        Objects.equals(this.amount, modelsTransactionEnrichmentResponse.amount) &&
        Objects.equals(this.category, modelsTransactionEnrichmentResponse.category) &&
        Objects.equals(this.categoryName, modelsTransactionEnrichmentResponse.categoryName) &&
        Objects.equals(this.currency, modelsTransactionEnrichmentResponse.currency) &&
        Objects.equals(this.currentInstallment, modelsTransactionEnrichmentResponse.currentInstallment) &&
        Objects.equals(this.date, modelsTransactionEnrichmentResponse.date) &&
        Objects.equals(this.installmentStartDate, modelsTransactionEnrichmentResponse.installmentStartDate) &&
        Objects.equals(this.merchantInfo, modelsTransactionEnrichmentResponse.merchantInfo) &&
        Objects.equals(this.numberOfInstallments, modelsTransactionEnrichmentResponse.numberOfInstallments) &&
        Objects.equals(this.totalInstalledAmount, modelsTransactionEnrichmentResponse.totalInstalledAmount) &&
        Objects.equals(this.transactionId, modelsTransactionEnrichmentResponse.transactionId) &&
        Objects.equals(this.transactionLocation, modelsTransactionEnrichmentResponse.transactionLocation) &&
        Objects.equals(this.transactionStatus, modelsTransactionEnrichmentResponse.transactionStatus) &&
        Objects.equals(this.transferMetadata, modelsTransactionEnrichmentResponse.transferMetadata)&&
        Objects.equals(this.additionalProperties, modelsTransactionEnrichmentResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, amount, category, categoryName, currency, currentInstallment, date, installmentStartDate, merchantInfo, numberOfInstallments, totalInstalledAmount, transactionId, transactionLocation, transactionStatus, transferMetadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTransactionEnrichmentResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currentInstallment: ").append(toIndentedString(currentInstallment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    installmentStartDate: ").append(toIndentedString(installmentStartDate)).append("\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
    sb.append("    totalInstalledAmount: ").append(toIndentedString(totalInstalledAmount)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionLocation: ").append(toIndentedString(transactionLocation)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    transferMetadata: ").append(toIndentedString(transferMetadata)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("amount");
    openapiFields.add("category");
    openapiFields.add("category_name");
    openapiFields.add("currency");
    openapiFields.add("current_installment");
    openapiFields.add("date");
    openapiFields.add("installment_start_date");
    openapiFields.add("merchant_info");
    openapiFields.add("number_of_installments");
    openapiFields.add("total_installed_amount");
    openapiFields.add("transaction_id");
    openapiFields.add("transaction_location");
    openapiFields.add("transaction_status");
    openapiFields.add("transfer_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsTransactionEnrichmentResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsTransactionEnrichmentResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTransactionEnrichmentResponse is not found in the empty JSON string", ModelsTransactionEnrichmentResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("category_name") != null && !jsonObj.get("category_name").isJsonNull()) && !jsonObj.get("category_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_name").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("installment_start_date") != null && !jsonObj.get("installment_start_date").isJsonNull()) && !jsonObj.get("installment_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installment_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installment_start_date").toString()));
      }
      // validate the optional field `merchant_info`
      if (jsonObj.get("merchant_info") != null && !jsonObj.get("merchant_info").isJsonNull()) {
        ModelsMerchantInfo.validateJsonObject(jsonObj.getAsJsonObject("merchant_info"));
      }
      if ((jsonObj.get("transaction_id") != null && !jsonObj.get("transaction_id").isJsonNull()) && !jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
      // validate the optional field `transaction_location`
      if (jsonObj.get("transaction_location") != null && !jsonObj.get("transaction_location").isJsonNull()) {
        ModelsLocation.validateJsonObject(jsonObj.getAsJsonObject("transaction_location"));
      }
      if ((jsonObj.get("transaction_status") != null && !jsonObj.get("transaction_status").isJsonNull()) && !jsonObj.get("transaction_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_status").toString()));
      }
      // validate the optional field `transfer_metadata`
      if (jsonObj.get("transfer_metadata") != null && !jsonObj.get("transfer_metadata").isJsonNull()) {
        ModelsTransferMetadata.validateJsonObject(jsonObj.getAsJsonObject("transfer_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsTransactionEnrichmentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTransactionEnrichmentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTransactionEnrichmentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTransactionEnrichmentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTransactionEnrichmentResponse>() {
           @Override
           public void write(JsonWriter out, ModelsTransactionEnrichmentResponse value) throws IOException {
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
           public ModelsTransactionEnrichmentResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsTransactionEnrichmentResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsTransactionEnrichmentResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTransactionEnrichmentResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsTransactionEnrichmentResponse
  */
  public static ModelsTransactionEnrichmentResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTransactionEnrichmentResponse.class);
  }

 /**
  * Convert an instance of ModelsTransactionEnrichmentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

