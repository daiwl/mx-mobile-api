//import com.magenta.maxoptra.mobile.api.ns.mns0.MobileAPIRequest;
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//
//import javax.ws.rs.core.MediaType;
//
//public class MobileScheduleAPITest {
//    public static void main(String[] args) {
//        sync();
//    }
//
//    private static void sync() {
//        MobileAPIRequest syncRequest = new MobileAPIRequest();
//        syncRequest.setTime(123L);
//
//        request("sync", syncRequest);
//    }
//
//    private static WebResource getResource() {
//        return Client.create().resource("http://localhost:8080/rest/mobile/api/schedule/");
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
