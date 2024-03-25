

# ModelsInputLabelSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labelWeightCounts** | **Map&lt;String, Integer&gt;** | Counts of given labels, broken down by label and weight. The keys are stringified pairs of (label_value, weight_value). |  [optional] |
|**monthlyCounts** | **Map&lt;String, Integer&gt;** | For each month (shown in YYYY-MM format), the number of labels given. |  [optional] |
|**monthlyPositiveRates** | **Map&lt;String, Double&gt;** | For each month (shown in YYYY-MM format), what is the rate of positive labels given. |  [optional] |
|**numInputLabels** | **Integer** | Number of labels that were provided by the user. |  |
|**numInputUsers** | **Integer** | Number of distinct users that were provided by the user |  |
|**numMatchedLabels** | **Integer** | Number of data rows that will be used in training |  |
|**numTrainingUsers** | **Integer** | Number of distinct users that will be used in training |  |



