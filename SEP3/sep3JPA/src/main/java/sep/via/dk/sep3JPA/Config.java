//package sep.via.dk.sep3JPA;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.remoting.rmi.RmiServiceExporter;
//import org.springframework.remoting.support.RemoteExporter;
//
//import sep.via.dk.sep3JPA.rmi.RemoteServer;
//import sep.via.dk.sep3JPA.rmi.RmiServer;
//
//@Configuration
//public class Config {
//    
//    @Bean
//    RemoteExporter registerRMIExporter() {
//         
//        RmiServiceExporter exporter = new RmiServiceExporter();
//        exporter.setServiceName("helloworldrmi");
//        exporter.setServiceInterface(RemoteServer.class);
//        exporter.setService(new RmiServer());
//        System.out.println("server is running");
//         
//        return exporter;   }
//    
//
//
//}