/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.squareup.okhttp.ResponseBody;
import fixtures.lro.models.LRORetrysDelete202Retry200Headers;
import fixtures.lro.models.LRORetrysDeleteAsyncRelativeRetrySucceededHeaders;
import fixtures.lro.models.LRORetrysDeleteProvisioning202Accepted200SucceededHeaders;
import fixtures.lro.models.LRORetrysPost202Retry200Headers;
import fixtures.lro.models.LRORetrysPostAsyncRelativeRetrySucceededHeaders;
import fixtures.lro.models.LRORetrysPutAsyncRelativeRetrySucceededHeaders;
import fixtures.lro.models.Product;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in LRORetrysOperations.
 */
public interface LRORetrysOperations {
    /**
     * The interface defining all the services for LRORetrysOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LRORetrysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("lro/retryerror/put/201/creating/succeeded/200")
        Call<ResponseBody> put201CreatingSucceeded200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("lro/retryerror/putasync/retry/succeeded")
        Call<ResponseBody> putAsyncRelativeRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "lro/retryerror/delete/provisioning/202/accepted/200/succeeded", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteProvisioning202Accepted200Succeeded(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "lro/retryerror/delete/202/retry/200", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete202Retry200(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "lro/retryerror/deleteasync/retry/succeeded", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAsyncRelativeRetrySucceeded(@Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("lro/retryerror/post/202/retry/200")
        Call<ResponseBody> post202Retry200(@Body Product product, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("lro/retryerror/postasync/retry/succeeded")
        Call<ResponseBody> postAsyncRelativeRetrySucceeded(@Body Product product, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> put201CreatingSucceeded200(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponseWithHeaders if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysPutAsyncRelativeRetrySucceededHeaders> putAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponseWithHeaders if successful.
     */
    ServiceResponseWithHeaders<Product, LRORetrysDeleteProvisioning202Accepted200SucceededHeaders> deleteProvisioning202Accepted200Succeeded() throws CloudException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteProvisioning202Accepted200SucceededAsync(final ServiceCallback<Product> serviceCallback);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponseWithHeaders object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysDelete202Retry200Headers> delete202Retry200() throws CloudException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete202Retry200Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponseWithHeaders object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysDeleteAsyncRelativeRetrySucceededHeaders> deleteAsyncRelativeRetrySucceeded() throws CloudException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponseWithHeaders object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPost202Retry200Headers> post202Retry200(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponseWithHeaders object if successful.
     */
    ServiceResponseWithHeaders<Void, LRORetrysPostAsyncRelativeRetrySucceededHeaders> postAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback);

}