
package org.novosoft.task.base;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2015-02-09T17:25:35.866+07:00
 * Generated source version: 2.7.13
 * 
 */
 
public class TaskServiceServer{

    protected TaskServiceServer() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new org.novosoft.task.base.TaskServiceImpl();
        String address = "http://localhost:9090/TaskServiceImplPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new TaskServiceServer();
        System.out.println("Server ready..."); 
        
        Thread.sleep(60 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
 
 