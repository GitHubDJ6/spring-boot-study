package cloud.ximalaya.springboot.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Bank {
    private Double maxAmountPerDeal;
    private Double maxAmountTotal;
}
