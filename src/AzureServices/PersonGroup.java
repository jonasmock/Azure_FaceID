package AzureServices;

// // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class PersonGroup {

	public void createPersonGroup(String personGroupId, String name, String userData) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				// The valid characters for the ID below include numbers, English letters in
				// lower case, '-', and '_'.
				// The maximum length of the personGroupId is 64.
				// this.personGroupId = "example-group-00";

				// NOTE: You must use the same region in your REST call as you used to obtain
				// your subscription keys.
				// For example, if you obtained your subscription keys from westus, replace
				// "westcentralus" in the
				// URL below with "westus".
				URIBuilder builder = new URIBuilder(
						"https://westcentralus.api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId);

				URI uri = builder.build();
				HttpPut request = new HttpPut(uri);

				// Request headers. Replace the example key with your valid subscription key.
				request.setHeader("Content-Type", "application/json");
				request.setHeader("Ocp-Apim-Subscription-Key", "f96086b39cb34c728e8ed9124506d9c9");

				// Request body. The name field is the display name you want for the group (must
				// be under 128 characters).
				// The size limit for what you want to include in the userData field is 16KB.
				String body = "{ \"name\":\"" + name + "\",\"userData\":\"" + userData + "\" }";

				StringEntity reqEntity = new StringEntity(body);
				request.setEntity(reqEntity);

				HttpResponse response = httpClient.execute(request);
				HttpEntity entity = response.getEntity();

				if (entity != null) {
					System.out.println(EntityUtils.toString(entity));

				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void deletePersonGroup(String personGroupId) {

		HttpClient httpClient = new DefaultHttpClient();

		try {
			// The valid characters for the ID below include numbers, English letters in
			// lower case, '-', and '_'.
			// The maximum length of the personGroupId is 64.
			// this.personGroupId = "example-group-00";

			// NOTE: You must use the same region in your REST call as you used to obtain
			// your subscription keys.
			// For example, if you obtained your subscription keys from westus, replace
			// "westcentralus" in the
			// URL below with "westus".
			URIBuilder builder = new URIBuilder(
					"https://westcentralus.api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId);

			URI uri = builder.build();

			HttpDelete request = new HttpDelete(uri);

			// Request headers. Replace the example key with your valid subscription key.
			request.setHeader("Content-Type", "application/json");
			request.setHeader("Ocp-Apim-Subscription-Key", "f96086b39cb34c728e8ed9124506d9c9");

			// Request body. The name field is the display name you want for the group (must
			// be under 128 characters).
			// The size limit for what you want to include in the userData field is 16KB.

			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}