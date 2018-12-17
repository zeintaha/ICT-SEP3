package sep.via.dk.sep3JPA;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import sep.via.dk.sep3JPA.rmi.RemoteServer;


@SpringBootApplication
@ComponentScan("sep.via.dk.sep3JPA")
public class Sep3JpaApplication {

	
// 

	public static void main(String[] args) throws AccessException, RemoteException, NotBoundException {
		 SpringApplication.run(Sep3JpaApplication.class, args);
//		 RemoteServer helloWorldRMI= SpringApplication.run(Sep3JpaApplication.class, args).getBean(RemoteServer.class);	
//		 System.out.println("================Client Side ========================");
//      	 System.out.println(helloWorldRMI.sayHelloRmi("FADI"));
	}
}
