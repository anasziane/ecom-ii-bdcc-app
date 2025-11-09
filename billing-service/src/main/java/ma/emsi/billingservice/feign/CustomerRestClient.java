package ma.emsi.billingservice.feign;

import ma.emsi.billingservice.model.Customer;
import ma.emsi.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("customer-service")
public interface CustomerRestClient {
    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable Long id);

    //Récuperer la liste des customers mais je vais pas faire List<Customers> car j'ai pas une liste
    // Je vais recuperer ca avec hateos par : PageModel
    @GetMapping("/customers")
    PagedModel<Customer> getAllCustomers();
}