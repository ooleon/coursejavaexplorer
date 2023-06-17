/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

//import io.helidon.common.http.Http;
//import io.helidon.webserver.Handler;
//import io.helidon.webserver.ServerRequest;
//import io.helidon.webserver.ServerResponse;

/**
 *
 * @author leo
 */
public class ItemList {
//	public class ItemList implements Handler{
    String items;
    ItemList(String items) {
        this.items=items;
    }

/*    
    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content-Type:", "text/plain; charset=UTF-8");
        System.out.println(this.items);
        res.send();
        System.out.println("\npaso\n");
    }
*/

}
