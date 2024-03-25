

# ModelsPersonaCreateRequest

Defines a persona. Stores various weighted facets including their interests, demographics, location, company affinity, as well as predefined personas.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyFacets** | [**List&lt;ModelsFacetWeightObject&gt;**](ModelsFacetWeightObject.md) | Optional list of behavioral facet component objects. Each object outlines how a user&#39;s likelihood to consume from a particular company&#39;s products and how much it contributes to the persona definition. If left empty, no company-based scoring is done. Company facets can be found by listing personas of facet type &#39;company&#39;. Facet name must be a valid company facet in the persona taxonomy. |  [optional] |
|**demographicFacets** | [**List&lt;ModelsFacetWeightObject&gt;**](ModelsFacetWeightObject.md) | Optional list of interest facet component objects. Defines how much each demographic attribute (location, affluence, household composition, etc.)  weighs in the persona. If left empty, no demographic-based scoring is done. Demographic facets can be found by listing personas of facet type &#39;demographic&#39;. Facet name must be a valid demographic facet in the persona taxonomy. |  [optional] |
|**interestFacets** | [**List&lt;ModelsFacetWeightObject&gt;**](ModelsFacetWeightObject.md) | Optional list of interest facet component objects. Each object represents how much an interest weighs in the persona. If left empty, no interest-based scoring is done. Interests can be found by listing personas of facet type &#39;interest&#39;. Facet name must be a valid interest in the persona taxonomy. |  [optional] |
|**locations** | **List&lt;String&gt;** | Optional list of zip codes or city ids to filter users by. If left empty, no location-based filtering is done. |  [optional] |
|**personaName** | **String** | A name for describing this persona. Used for easy human-friendly identification. |  |
|**preDefinedPersonas** | [**List&lt;ModelsFacetWeightObject&gt;**](ModelsFacetWeightObject.md) | Optional list of pre-defined persona facet component objects. Each object outlines how a pre-defined persona (&#39;Car Owners&#39; or &#39;International Travelers&#39;) contributes to the persona definition. If left empty, no predefined personas are incorporated into the persona definition. Pre-defined personas have been optimized for financial use cases and have been validated at scale. They can be found by listing personas of facet type &#39;pre_defined_persona&#39;. Facet name must be a valid pre-defined persona facet in the persona taxonomy. |  [optional] |



