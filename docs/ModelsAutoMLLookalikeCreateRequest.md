

# ModelsAutoMLLookalikeCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**engagementType** | **String** | Intended use case of this product, between MULTI_ENGAGE and SINGLE_ENGAGE |  |
|**negativeLabelUsers** | [**List&lt;ModelsLookalikeLabel&gt;**](ModelsLookalikeLabel.md) | List of negative users in lookalike model. Model will be trained to identify users dissimilar to these users. If None, negative users will be generated from data. List length must be either 0 or greater than 10. |  [optional] |
|**positiveLabelUsers** | [**List&lt;ModelsLookalikeLabel&gt;**](ModelsLookalikeLabel.md) | List of positive users in lookalike model. Model will be trained to identify users similar to these users. This list must contain at least ten elements. |  |
|**runDescription** | **String** | Custom run description to attach to run |  [optional] |



