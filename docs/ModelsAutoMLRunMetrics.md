

# ModelsAutoMLRunMetrics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cumulativePositiveRate** | **Map&lt;String, Map&lt;String, Double&gt;&gt;** | Cumulative positive rates at various thresholds, including ascending (lower to higher thresholds) and descending (higher to lower thresholds). It indicates how the proportion of positive instances within the total instances changes as the classification threshold is adjusted. |  [optional] |
|**labelPositiveRate** | **Double** | The percentage of users with positive label in the test set. |  [optional] |
|**positiveRateByDecile** | **Map&lt;String, Double&gt;** | The percentage of positive examples (examples with a positive label) in each of the ten equally-sized groups (deciles) of the test data when this data is sorted based on the model&#39;s predicted scores. |  [optional] |
|**testAuc** | **Double** | AUC of the test set |  [optional] |
|**testKs** | **Double** | KS of the test set |  [optional] |
|**trainAuc** | **Double** | AUC of the training set |  [optional] |
|**trainKs** | **Double** | KS of the training set |  [optional] |



