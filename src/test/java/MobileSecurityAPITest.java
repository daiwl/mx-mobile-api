//import com.magenta.maxoptra.mobile.api.ns.mns1.AuthRequest;
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//
//import javax.ws.rs.core.MediaType;
//
//public class MobileSecurityAPITest {
//
//    public static void main(String[] args) {
//        login();
//    }
//
//    private static void login() {
//        AuthRequest r = new AuthRequest();
//        r.setUsername("name");
//        request("/security/auth", r);
//    }
//
//    private static WebResource getResource() {
//        return Client.create().resource("http://localhost:8080/rest/mobile/api");
//    }
//
//    private static void request(String path, Object record) {
//        ClientResponse response = getResource()
//                .path(path)
//                .type(MediaType.APPLICATION_XML)
//                .accept(MediaType.APPLICATION_XML)
//                .post(ClientResponse.class, record);
//
//        if (response.getStatus() != 200) {
//            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//        }
//
//        String output = response.getEntity(String.class);
//
//        System.out.println("Response .... \n");
//        System.out.println(output);
//    }
//}
