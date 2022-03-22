package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Target;

/**
 * @Author: 顾嘉伟
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter() {
        String text = "淦！乐色这里可以吸毒，这里可以开票，这里可以赌博，可以嫖娼，操了哈哈哈哈！";
        text= sensitiveFilter.filter(text);
        System.out.println(text);

        String text1 = "-淦！这里可以！吸⭐毒，这里可以开⭐票，这里可以赌博，可以嫖⭐娼，操-了哈哈哈哈！";
        text1= sensitiveFilter.filter(text1);
        System.out.println(text1);
    }

}
