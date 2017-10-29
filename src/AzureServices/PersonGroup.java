package AzureServices;

// // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class PersonGroup extends Initialize {

	PersonGroup(String subscriptionKey, String server) {
		super(subscriptionKey, server);
		// TODO Auto-generated constructor stub
	}

	public void createPersonGroup(String personGroupId, String name, String userData) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {

				URIBuilder builder = new URIBuilder("https://" + super.getServer()
						+ ".api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId);

				URI uri = builder.build();
				HttpPut request = new HttpPut(uri);

				// Request headers. Replace the example key with your valid subscription key.
				request.setHeader("Content-Type", "application/json");
				request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

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

			URIBuilder builder = new URIBuilder("https://" + super.getServer()
					+ ".api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId);

			URI uri = builder.build();

			HttpDelete request = new HttpDelete(uri);

			// Request headers. Replace the example key with your valid subscription key.
			request.setHeader("Content-Type", "application/json");
			request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void getPersonGroup(String personGroupId) {

		HttpClient httpClient = new DefaultHttpClient();

		try {

			URIBuilder builder = new URIBuilder("https://" + super.getServer()
					+ ".api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId);

			URI uri = builder.build();

			HttpGet request = new HttpGet(uri);

			// Request headers. Replace the example key with your valid subscription key.
			request.setHeader("Content-Type", "application/json");
			request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void getPersonGroupTrainingStatus(String personGroupId) {

		HttpClient httpClient = new DefaultHttpClient();

		try {

			URIBuilder builder = new URIBuilder("https://" + super.getServer()
					+ ".api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId + "/training");

			URI uri = builder.build();

			HttpGet request = new HttpGet(uri);

			// Request headers. Replace the example key with your valid subscription key.
			request.setHeader("Content-Type", "application/json");
			request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void listPersonGroups() {

		HttpClient httpClient = new DefaultHttpClient();

		try {

			URIBuilder builder = new URIBuilder(
					"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups?top=1000");

			URI uri = builder.build();

			HttpGet request = new HttpGet(uri);

			// Request headers. Replace the example key with your valid subscription key.
			request.setHeader("Content-Type", "application/json");
			request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void trainPersonGroup(String personGroupId) {

		HttpClient httpClient = new DefaultHttpClient();

		try {

			URIBuilder builder = new URIBuilder("https://" + super.getServer()
					+ ".api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId+"/train");

			URI uri = builder.build();

			// HttpGet request = new HttpGet(uri);
			HttpPost request = new HttpPost(uri);

			// Request headers. Replace the example key with your valid subscription key.
			request.setHeader("Content-Type", "application/json");
			request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void updatePersonGroup(String personGroupId, String name, String userData) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {

				URIBuilder builder = new URIBuilder("https://" + super.getServer()
						+ ".api.cognitive.microsoft.com/face/v1.0/persongroups/" + personGroupId);

				URI uri = builder.build();
				//
				HttpPatch request = new HttpPatch(uri);

				// Request headers. Replace the example key with your valid subscription key.
				request.setHeader("Content-Type", "application/json");
				request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

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

}