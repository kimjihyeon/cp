package nsus.platform.cp.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String city;

    private String street;

    private String zipcode;

}
