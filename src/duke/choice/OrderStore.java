package duke.choice;

import duke.choice.Clothing;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import duke.choice.Customer;
import duke.choice.Kikito;
import java.util.Arrays;

// helidon reference a external micro server, I prefer use SpringBoot
//import io.helidon.webserver.Routing;
//import io.helidon.webserver.ServerConfiguration;
//import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class OrderStore {

	static Clothing item1;
	static Clothing item2;
	static Clothing item3;
	static Clothing item4;
	static int measurement = 3;

	double price = 0.0;
	static double average = 0.0;
	static int counting = 0;

	static Customer c1;
	
	public static void main(String[] args) {
		SpringApplication.run(OrderStore.class, args);


		OrderStore os = new OrderStore();
		System.out.println("Welcome to Duke OrderStore!");
		c1 = new Customer();
		c1.setName("Pinky");
		c1.setSize("S");
		c1.setSize(6);
		System.out.println("Customer: " + c1.getName() + ", " + c1.getSize() + ", ");
		System.out.println("Minimum Price: " + Clothing.MINIMUM_PRICE);
		System.out.println("Tax: " + Clothing.TAX);

		System.out.println("Clothing: ");

		item1 = new Clothing();
		item2 = new Clothing();
		item3 = new Clothing();
		item4 = new Clothing();
		Clothing[] items1 = { item1 };
		Clothing[] items2 = { item2 };
		Clothing[] items = { item3, item4, item1, item2 };
//        Clothing[] items = {item1, item2, item3, item4};

		item1.setDescription("Blue Jacket");
		item1.setPrice(10.9);
		item1.setSize("M");

		item2.setDescription("Orange T-Shirt");
		item2.setPrice(11.5);
		item2.setSize("S");

		item3.setDescription("Blue T-Shirt");
		item3.setPrice(12.5);
		item3.setSize("S");

		item4.setDescription("Green Jacket");
		item4.setPrice(14.5);
		item4.setSize("M");

		int cantidadItem1 = 1;
		int cantidadItem2 = 2;

		c1.addItems(items);
		System.out.println(c1.getItems().length);
		c1.listItems();
		System.out.println();
		c1.getTotalClothingCost();
		/*
		 */
		os.average(items);

		Arrays.sort(c1.getItems());

		c1.listItems();

		/*        
        try {
            ItemList list = new ItemList(c1.getItems()[0].toString());
            Routing routing = Routing.builder()
                    .get("/items", list).build();
            ServerConfiguration configuration;
            configuration = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(configuration, routing);
            ws.start();
        } catch (UnknownHostException ex) {
            //Logger.getLogger(OrderStore.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
		*/
		
	}

	private static void server(Clothing[] items) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void average(Clothing[] items) {
		for (Clothing item : items) {
			if (item.getSize().equals("L")) {
				counting++;
				average = average + item.getPrice();
			}
		}
		try {
			average = (counting == 0) ? 0 : average / counting;
//            average = average / counting;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Average: " + average);

	}

	private void test() {
	}

    @GetMapping("/")
    public ResponseEntity<Clothing[]> getClothing() {
    	return ResponseEntity.status(HttpStatus.CREATED).body(c1.getItems());
    }

	
}
