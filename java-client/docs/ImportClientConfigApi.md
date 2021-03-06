# ImportClientConfigApi

All URIs are relative to *https://localhost:7189*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertSimple**](ImportClientConfigApi.md#convertSimple) | **POST** /api/d6.0/import/clientConfig/convertSimple | Convert Simple Configuration
[**importClientConfig**](ImportClientConfigApi.md#importClientConfig) | **POST** /api/d6.0/import | Import Client Config
[**validate**](ImportClientConfigApi.md#validate) | **POST** /api/d6.0/import/clientConfig/validate | Validate Client Config


<a name="convertSimple"></a>
# **convertSimple**
> String convertSimple(simpleClientConfig, includeOriginComments)

Convert Simple Configuration

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ImportClientConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ImportClientConfigApi apiInstance = new ImportClientConfigApi();
String simpleClientConfig = "simpleClientConfig_example"; // String | simpleClientConfig
Boolean includeOriginComments = true; // Boolean | includeOriginComments
try {
    String result = apiInstance.convertSimple(simpleClientConfig, includeOriginComments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportClientConfigApi#convertSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **simpleClientConfig** | **String**| simpleClientConfig |
 **includeOriginComments** | **Boolean**| includeOriginComments | [optional]

### Return type

**String**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/hocon
 - **Accept**: application/hocon

<a name="importClientConfig"></a>
# **importClientConfig**
> ImportResult importClientConfig(clientConfig, clusterName, deploymentName, environmentName)

Import Client Config

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ImportClientConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ImportClientConfigApi apiInstance = new ImportClientConfigApi();
String clientConfig = "clientConfig_example"; // String | clientConfig
String clusterName = "clusterName_example"; // String | clusterName
String deploymentName = "deploymentName_example"; // String | deploymentName
String environmentName = "environmentName_example"; // String | environmentName
try {
    ImportResult result = apiInstance.importClientConfig(clientConfig, clusterName, deploymentName, environmentName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportClientConfigApi#importClientConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientConfig** | **String**| clientConfig |
 **clusterName** | **String**| clusterName | [optional]
 **deploymentName** | **String**| deploymentName | [optional]
 **environmentName** | **String**| environmentName | [optional]

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/hocon
 - **Accept**: application/json

<a name="validate"></a>
# **validate**
> ValidationResults validate(clientConfig, clusterName, deploymentName, environmentName)

Validate Client Config

### Example
```java
// Import classes:
//import com.cloudera.director.client.common.ApiClient;
//import com.cloudera.director.client.common.ApiException;
//import com.cloudera.director.client.common.Configuration;
//import com.cloudera.director.client.common.auth.*;
//import com.cloudera.director.client.latest.api.ImportClientConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

ImportClientConfigApi apiInstance = new ImportClientConfigApi();
String clientConfig = "clientConfig_example"; // String | clientConfig
String clusterName = "clusterName_example"; // String | clusterName
String deploymentName = "deploymentName_example"; // String | deploymentName
String environmentName = "environmentName_example"; // String | environmentName
try {
    ValidationResults result = apiInstance.validate(clientConfig, clusterName, deploymentName, environmentName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportClientConfigApi#validate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientConfig** | **String**| clientConfig |
 **clusterName** | **String**| clusterName | [optional]
 **deploymentName** | **String**| deploymentName | [optional]
 **environmentName** | **String**| environmentName | [optional]

### Return type

[**ValidationResults**](ValidationResults.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/hocon
 - **Accept**: application/json

