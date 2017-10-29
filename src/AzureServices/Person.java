package AzureServices;

import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class Person extends PersonGroup {

	Person(String subscriptionKey, String server) {
		super(subscriptionKey, server);
		// TODO Auto-generated constructor stub
	}

	public void addPersonFace(String personGroupId, String personId, String url) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				System.out.println(super.getServer());
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId + "/persons/" + personId + "/persistedFaces");

				URI uri = builder.build();
				HttpPost request = new HttpPost(uri);

				// Request headers. Replace the example key with your valid subscription key.
				request.setHeader("Content-Type", "application/json");
				request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

				// Request body. The name field is the display name you want for the group (must
				// be under 128 characters).
				// The size limit for what you want to include in the userData field is 16KB.
				String body = "{ \"url\":\"" + url + "\"}";

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
	
	public void createPerson(String personGroupId, String name, String userData) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				System.out.println(super.getServer());
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId + "/persons/");

				URI uri = builder.build();
				HttpPost request = new HttpPost(uri);

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

	public void deletePerson(String personGroupId, String personId) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				System.out.println(super.getServer());
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId + "/persons/"+personId);

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
	}

	public void deletePersonFace(String personGroupId, String personId, String persistedFaceId) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId + "/persons/"+personId+"/persistedFaces/"+persistedFaceId);

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
	}
	
	public void getPerson(String personGroupId, String personId) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				System.out.println(super.getServer());
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId + "/persons/"+personId);

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
	}
	
	public void getPersonFace(String personGroupId, String personId, String persistedFaceId) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId + "/persons/"+personId+"/persistedFaces/"+persistedFaceId);

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
	}
	
	public void listPerson(String personGroupId) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId+"/persons");

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
	}
	
	public void updatePerson(String personGroupId, String personId, String name, String userData) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				System.out.println(super.getServer());
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/persongroups/"
								+ personGroupId + "/persons/"+ personId);

				URI uri = builder.build();
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
