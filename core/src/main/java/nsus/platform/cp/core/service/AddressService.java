package nsus.platform.cp.core.service;

import lombok.RequiredArgsConstructor;
import nsus.platform.cp.core.domain.Address;
import nsus.platform.cp.core.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public Address getAddress(Long id) {
        return addressRepository.findById(id).orElseThrow();
    }

}
