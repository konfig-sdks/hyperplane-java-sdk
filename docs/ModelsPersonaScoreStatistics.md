

# ModelsPersonaScoreStatistics

Statistical attributes about the score distribution for a particular persona.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maximumUserScore** | **Double** | Highest persona score assigned to a user for this persona |  |
|**minimumUserScore** | **Double** | Lowest persona score assigned to a user for this persona |  |
|**personaScoreThreshold** | **Double** | Score threshold used to determine whether a user belongs to this persona |  |
|**scoreAverage** | **Double** | Average score over all scored users in this persona |  |
|**scorePercentiles** | [**ModelsPersonaScorePercentiles**](ModelsPersonaScorePercentiles.md) | Percentile distribution of scores for users who have been assigned a score for this persona |  |
|**scoreStandardDeviation** | **Double** | Standard deviation over all scored users in this persona |  |
|**totalUsersAboveThreshold** | **Integer** | Total number of users who meet or exceed the score threshold to be considered part of this persona. |  |
|**totalUsersWithNonZeroScore** | **Integer** | Total number of users who have received a score for this persona. |  |



