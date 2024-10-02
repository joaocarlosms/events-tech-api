package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID>{

}
