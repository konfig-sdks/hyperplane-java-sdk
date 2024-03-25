

# ModelsPostPersonaUsersRequest

Extra information for filtering users

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**birthDate** | [**ModelsTimestampAttributeFilter**](ModelsTimestampAttributeFilter.md) | Filter birth date based on a date range |  [optional] |
|**blocklist** | **List&lt;String&gt;** | List of user ids to not be included in the response |  |
|**branch** | [**ModelsCategoricalAttributeFilter**](ModelsCategoricalAttributeFilter.md) | Filter branch based on a list of allowed values |  |
|**cboCode** | [**ModelsCategoricalAttributeFilter**](ModelsCategoricalAttributeFilter.md) | Filter cbo code based on a list of allowed values |  [optional] |
|**declaredMonthlyIncome** | [**ModelsNumericalAttributeFilter**](ModelsNumericalAttributeFilter.md) | Filter declared monthly income based on a numeric range |  [optional] |
|**jobTitle** | [**ModelsCategoricalAttributeFilter**](ModelsCategoricalAttributeFilter.md) | Filter job title based on a list of allowed values |  [optional] |



