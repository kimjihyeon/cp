package nsus.platform.cp.api.controller;

import lombok.RequiredArgsConstructor;
import nsus.platform.cp.core.domain.Address;
import nsus.platform.cp.core.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/address/{id}")
    public Address getAddress(@PathVariable("id") Long id) {
        return addressService.getAddress(id);
    }

}
