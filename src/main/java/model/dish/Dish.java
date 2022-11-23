package model.order;



import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import model.app_user.Merchant;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String shortDescription;
    private String numberOrder;
    private Double oldPrice;
    private Double newPrice;
    private String image;
    private int quantity;

    @Column(name = "deleteFlag", columnDefinition = "boolean default true")
    private boolean deleteFlag;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;
}
