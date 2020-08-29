package com.macro.mall;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author emiya
 * @Date 2020/7/25 20:52
 * @Version: 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptTest {
    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void getPass() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("emiya");

        String url = textEncryptor.encrypt("LTAIDKZMlZdeZNSo");
        String name = textEncryptor.encrypt("cCo56Ag0kcrduUXjNPifCsufVVvzwN");
        String password = textEncryptor.encrypt("http://127.0.0.1:8080/aliyun/oss/callback");
        System.out.println(url+"----------------");
        System.out.println(name+"----------------");
        System.out.println(password+"----------------");
        Assert.assertTrue(name.length() > 0);
        Assert.assertTrue(password.length() > 0);
    }
}
