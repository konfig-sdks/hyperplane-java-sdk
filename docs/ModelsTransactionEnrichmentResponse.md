

# ModelsTransactionEnrichmentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Transaction description |  [optional] |
|**amount** | **Double** | Amount of transaction |  [optional] |
|**category** | **String** | Category enum of transaction |  [optional] |
|**categoryName** | **String** | Category human-readable name of transaction |  [optional] |
|**currency** | **String** | Transaction currency |  [optional] |
|**currentInstallment** | **Integer** | Current installment. If 0, it is not an installment |  [optional] |
|**date** | **String** | Date of transaction |  [optional] |
|**installmentStartDate** | **String** | First installment date, that is, the purchase date |  [optional] |
|**merchantInfo** | [**ModelsMerchantInfo**](ModelsMerchantInfo.md) | Contains metadata about the merchant, if available. |  [optional] |
|**numberOfInstallments** | **Integer** | Number of installments |  [optional] |
|**totalInstalledAmount** | **Double** | Sum of amounts for all installments |  [optional] |
|**transactionId** | **String** | Unique transaction id |  [optional] |
|**transactionLocation** | [**ModelsLocation**](ModelsLocation.md) | Location where the transaction happened |  [optional] |
|**transactionStatus** | **String** | Transaction status |  [optional] |
|**transferMetadata** | [**ModelsTransferMetadata**](ModelsTransferMetadata.md) | Contains metadata about the payment method, the sender, and the receiver. |  [optional] |



