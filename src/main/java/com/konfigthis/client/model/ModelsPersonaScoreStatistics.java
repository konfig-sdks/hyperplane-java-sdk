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
import com.konfigthis.client.model.ModelsPersonaScorePercentiles;
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
 * Statistical attributes about the score distribution for a particular persona.
 */
@ApiModel(description = "Statistical attributes about the score distribution for a particular persona.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ModelsPersonaScoreStatistics {
  public static final String SERIALIZED_NAME_MAXIMUM_USER_SCORE = "maximum_user_score";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_USER_SCORE)
  private Double maximumUserScore;

  public static final String SERIALIZED_NAME_MINIMUM_USER_SCORE = "minimum_user_score";
  @SerializedName(SERIALIZED_NAME_MINIMUM_USER_SCORE)
  private Double minimumUserScore;

  public static final String SERIALIZED_NAME_PERSONA_SCORE_THRESHOLD = "persona_score_threshold";
  @SerializedName(SERIALIZED_NAME_PERSONA_SCORE_THRESHOLD)
  private Double personaScoreThreshold;

  public static final String SERIALIZED_NAME_SCORE_AVERAGE = "score_average";
  @SerializedName(SERIALIZED_NAME_SCORE_AVERAGE)
  private Double scoreAverage;

  public static final String SERIALIZED_NAME_SCORE_PERCENTILES = "score_percentiles";
  @SerializedName(SERIALIZED_NAME_SCORE_PERCENTILES)
  private ModelsPersonaScorePercentiles scorePercentiles;

  public static final String SERIALIZED_NAME_SCORE_STANDARD_DEVIATION = "score_standard_deviation";
  @SerializedName(SERIALIZED_NAME_SCORE_STANDARD_DEVIATION)
  private Double scoreStandardDeviation;

  public static final String SERIALIZED_NAME_TOTAL_USERS_ABOVE_THRESHOLD = "total_users_above_threshold";
  @SerializedName(SERIALIZED_NAME_TOTAL_USERS_ABOVE_THRESHOLD)
  private Integer totalUsersAboveThreshold;

  public static final String SERIALIZED_NAME_TOTAL_USERS_WITH_NON_ZERO_SCORE = "total_users_with_non_zero_score";
  @SerializedName(SERIALIZED_NAME_TOTAL_USERS_WITH_NON_ZERO_SCORE)
  private Integer totalUsersWithNonZeroScore;

  public ModelsPersonaScoreStatistics() {
  }

  public ModelsPersonaScoreStatistics maximumUserScore(Double maximumUserScore) {
    
    
    
    
    this.maximumUserScore = maximumUserScore;
    return this;
  }

  public ModelsPersonaScoreStatistics maximumUserScore(Integer maximumUserScore) {
    
    
    
    
    this.maximumUserScore = maximumUserScore.doubleValue();
    return this;
  }

   /**
   * Highest persona score assigned to a user for this persona
   * @return maximumUserScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "Highest persona score assigned to a user for this persona")

  public Double getMaximumUserScore() {
    return maximumUserScore;
  }


  public void setMaximumUserScore(Double maximumUserScore) {
    
    
    
    this.maximumUserScore = maximumUserScore;
  }


  public ModelsPersonaScoreStatistics minimumUserScore(Double minimumUserScore) {
    
    
    
    
    this.minimumUserScore = minimumUserScore;
    return this;
  }

  public ModelsPersonaScoreStatistics minimumUserScore(Integer minimumUserScore) {
    
    
    
    
    this.minimumUserScore = minimumUserScore.doubleValue();
    return this;
  }

   /**
   * Lowest persona score assigned to a user for this persona
   * @return minimumUserScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "Lowest persona score assigned to a user for this persona")

  public Double getMinimumUserScore() {
    return minimumUserScore;
  }


  public void setMinimumUserScore(Double minimumUserScore) {
    
    
    
    this.minimumUserScore = minimumUserScore;
  }


  public ModelsPersonaScoreStatistics personaScoreThreshold(Double personaScoreThreshold) {
    
    
    
    
    this.personaScoreThreshold = personaScoreThreshold;
    return this;
  }

  public ModelsPersonaScoreStatistics personaScoreThreshold(Integer personaScoreThreshold) {
    
    
    
    
    this.personaScoreThreshold = personaScoreThreshold.doubleValue();
    return this;
  }

   /**
   * Score threshold used to determine whether a user belongs to this persona
   * @return personaScoreThreshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "Score threshold used to determine whether a user belongs to this persona")

  public Double getPersonaScoreThreshold() {
    return personaScoreThreshold;
  }


  public void setPersonaScoreThreshold(Double personaScoreThreshold) {
    
    
    
    this.personaScoreThreshold = personaScoreThreshold;
  }


  public ModelsPersonaScoreStatistics scoreAverage(Double scoreAverage) {
    
    
    
    
    this.scoreAverage = scoreAverage;
    return this;
  }

  public ModelsPersonaScoreStatistics scoreAverage(Integer scoreAverage) {
    
    
    
    
    this.scoreAverage = scoreAverage.doubleValue();
    return this;
  }

   /**
   * Average score over all scored users in this persona
   * @return scoreAverage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "Average score over all scored users in this persona")

  public Double getScoreAverage() {
    return scoreAverage;
  }


  public void setScoreAverage(Double scoreAverage) {
    
    
    
    this.scoreAverage = scoreAverage;
  }


  public ModelsPersonaScoreStatistics scorePercentiles(ModelsPersonaScorePercentiles scorePercentiles) {
    
    
    
    
    this.scorePercentiles = scorePercentiles;
    return this;
  }

   /**
   * Percentile distribution of scores for users who have been assigned a score for this persona
   * @return scorePercentiles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Percentile distribution of scores for users who have been assigned a score for this persona")

  public ModelsPersonaScorePercentiles getScorePercentiles() {
    return scorePercentiles;
  }


  public void setScorePercentiles(ModelsPersonaScorePercentiles scorePercentiles) {
    
    
    
    this.scorePercentiles = scorePercentiles;
  }


  public ModelsPersonaScoreStatistics scoreStandardDeviation(Double scoreStandardDeviation) {
    
    
    
    
    this.scoreStandardDeviation = scoreStandardDeviation;
    return this;
  }

  public ModelsPersonaScoreStatistics scoreStandardDeviation(Integer scoreStandardDeviation) {
    
    
    
    
    this.scoreStandardDeviation = scoreStandardDeviation.doubleValue();
    return this;
  }

   /**
   * Standard deviation over all scored users in this persona
   * @return scoreStandardDeviation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "Standard deviation over all scored users in this persona")

  public Double getScoreStandardDeviation() {
    return scoreStandardDeviation;
  }


  public void setScoreStandardDeviation(Double scoreStandardDeviation) {
    
    
    
    this.scoreStandardDeviation = scoreStandardDeviation;
  }


  public ModelsPersonaScoreStatistics totalUsersAboveThreshold(Integer totalUsersAboveThreshold) {
    
    
    
    
    this.totalUsersAboveThreshold = totalUsersAboveThreshold;
    return this;
  }

   /**
   * Total number of users who meet or exceed the score threshold to be considered part of this persona.
   * @return totalUsersAboveThreshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "Total number of users who meet or exceed the score threshold to be considered part of this persona.")

  public Integer getTotalUsersAboveThreshold() {
    return totalUsersAboveThreshold;
  }


  public void setTotalUsersAboveThreshold(Integer totalUsersAboveThreshold) {
    
    
    
    this.totalUsersAboveThreshold = totalUsersAboveThreshold;
  }


  public ModelsPersonaScoreStatistics totalUsersWithNonZeroScore(Integer totalUsersWithNonZeroScore) {
    
    
    
    
    this.totalUsersWithNonZeroScore = totalUsersWithNonZeroScore;
    return this;
  }

   /**
   * Total number of users who have received a score for this persona.
   * @return totalUsersWithNonZeroScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "Total number of users who have received a score for this persona.")

  public Integer getTotalUsersWithNonZeroScore() {
    return totalUsersWithNonZeroScore;
  }


  public void setTotalUsersWithNonZeroScore(Integer totalUsersWithNonZeroScore) {
    
    
    
    this.totalUsersWithNonZeroScore = totalUsersWithNonZeroScore;
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
   * @return the ModelsPersonaScoreStatistics instance itself
   */
  public ModelsPersonaScoreStatistics putAdditionalProperty(String key, Object value) {
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
    ModelsPersonaScoreStatistics modelsPersonaScoreStatistics = (ModelsPersonaScoreStatistics) o;
    return Objects.equals(this.maximumUserScore, modelsPersonaScoreStatistics.maximumUserScore) &&
        Objects.equals(this.minimumUserScore, modelsPersonaScoreStatistics.minimumUserScore) &&
        Objects.equals(this.personaScoreThreshold, modelsPersonaScoreStatistics.personaScoreThreshold) &&
        Objects.equals(this.scoreAverage, modelsPersonaScoreStatistics.scoreAverage) &&
        Objects.equals(this.scorePercentiles, modelsPersonaScoreStatistics.scorePercentiles) &&
        Objects.equals(this.scoreStandardDeviation, modelsPersonaScoreStatistics.scoreStandardDeviation) &&
        Objects.equals(this.totalUsersAboveThreshold, modelsPersonaScoreStatistics.totalUsersAboveThreshold) &&
        Objects.equals(this.totalUsersWithNonZeroScore, modelsPersonaScoreStatistics.totalUsersWithNonZeroScore)&&
        Objects.equals(this.additionalProperties, modelsPersonaScoreStatistics.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumUserScore, minimumUserScore, personaScoreThreshold, scoreAverage, scorePercentiles, scoreStandardDeviation, totalUsersAboveThreshold, totalUsersWithNonZeroScore, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsPersonaScoreStatistics {\n");
    sb.append("    maximumUserScore: ").append(toIndentedString(maximumUserScore)).append("\n");
    sb.append("    minimumUserScore: ").append(toIndentedString(minimumUserScore)).append("\n");
    sb.append("    personaScoreThreshold: ").append(toIndentedString(personaScoreThreshold)).append("\n");
    sb.append("    scoreAverage: ").append(toIndentedString(scoreAverage)).append("\n");
    sb.append("    scorePercentiles: ").append(toIndentedString(scorePercentiles)).append("\n");
    sb.append("    scoreStandardDeviation: ").append(toIndentedString(scoreStandardDeviation)).append("\n");
    sb.append("    totalUsersAboveThreshold: ").append(toIndentedString(totalUsersAboveThreshold)).append("\n");
    sb.append("    totalUsersWithNonZeroScore: ").append(toIndentedString(totalUsersWithNonZeroScore)).append("\n");
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
    openapiFields.add("maximum_user_score");
    openapiFields.add("minimum_user_score");
    openapiFields.add("persona_score_threshold");
    openapiFields.add("score_average");
    openapiFields.add("score_percentiles");
    openapiFields.add("score_standard_deviation");
    openapiFields.add("total_users_above_threshold");
    openapiFields.add("total_users_with_non_zero_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("maximum_user_score");
    openapiRequiredFields.add("minimum_user_score");
    openapiRequiredFields.add("persona_score_threshold");
    openapiRequiredFields.add("score_average");
    openapiRequiredFields.add("score_percentiles");
    openapiRequiredFields.add("score_standard_deviation");
    openapiRequiredFields.add("total_users_above_threshold");
    openapiRequiredFields.add("total_users_with_non_zero_score");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsPersonaScoreStatistics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsPersonaScoreStatistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsPersonaScoreStatistics is not found in the empty JSON string", ModelsPersonaScoreStatistics.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsPersonaScoreStatistics.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `score_percentiles`
      ModelsPersonaScorePercentiles.validateJsonObject(jsonObj.getAsJsonObject("score_percentiles"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsPersonaScoreStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsPersonaScoreStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsPersonaScoreStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsPersonaScoreStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsPersonaScoreStatistics>() {
           @Override
           public void write(JsonWriter out, ModelsPersonaScoreStatistics value) throws IOException {
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
           public ModelsPersonaScoreStatistics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ModelsPersonaScoreStatistics instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ModelsPersonaScoreStatistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsPersonaScoreStatistics
  * @throws IOException if the JSON string is invalid with respect to ModelsPersonaScoreStatistics
  */
  public static ModelsPersonaScoreStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsPersonaScoreStatistics.class);
  }

 /**
  * Convert an instance of ModelsPersonaScoreStatistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

