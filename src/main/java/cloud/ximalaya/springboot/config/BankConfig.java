package cloud.ximalaya.springboot.config;

import cloud.ximalaya.springboot.pojo.Bank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

    // @Value+${} spel表达式 +注解可以读取 springboot 配置文件 获取相关数据
    @Value("${pay.nopassword.maxAmountTotal}")
    private  Double  maxAmountTotal;

    @Value("${pay.nopassword.maxAmountPerDeal}")
    private  Double  maxAmountPerDeal;

    @Bean
    public Bank c(){
        Bank bank = new Bank();
        bank.setMaxAmountPerDeal(maxAmountPerDeal);
        bank.setMaxAmountTotal(maxAmountTotal);
        return bank;
    }

}
