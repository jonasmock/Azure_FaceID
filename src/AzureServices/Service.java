package AzureServices;

import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class Service extends Person{

	Service(String subscriptionKey, String server) {
		super(subscriptionKey, server);
		// TODO Auto-generated constructor stub
	}
	
	
	public void verify(String personGroupId, String personId, String faceId) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				System.out.println(super.getServer());
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/verify");

				URI uri = builder.build();
				HttpPost request = new HttpPost(uri);

				// Request headers. Replace the example key with your valid subscription key.
				request.setHeader("Content-Type", "application/json");
				request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

				// Request body. The name field is the display name you want for the group (must
				// be under 128 characters).
				// The size limit for what you want to include in the userData field is 16KB.
				String body = "{ \"faceId\":\"" + faceId + "\",\"personId\":\"" + personId + "\",\"personGroupId\":\""+personGroupId+"\" }";

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
	
	public void detect(String url) {
		{
			HttpClient httpClient = new DefaultHttpClient();

			try {
				System.out.println(super.getServer());
				URIBuilder builder = new URIBuilder(
						"https://" + super.getServer() + ".api.cognitive.microsoft.com/face/v1.0/detect?returnFaceId=true&returnFaceLandmarks=false");

				URI uri = builder.build();
				HttpPost request = new HttpPost(uri);

				// Request headers. Replace the example key with your valid subscription key.
				request.setHeader("Content-Type", "application/json");
				request.setHeader("Ocp-Apim-Subscription-Key", super.getSubscriptionKey());

				// Request body. The name field is the display name you want for the group (must
				// be under 128 characters).
				// The size limit for what you want to include in the userData field is 16KB.
				String body = "{ \"url\":\"" + url + "\" }";

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
