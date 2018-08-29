import okhttp3.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.net.URL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")

public class TestMain {

    @Test
    public void getMoney() throws Exception {
        final OkHttpClient client = new OkHttpClient();
//        URL url = new URL("http://localhost:8181/test/money/1");
//        final Request money = new Request
//                .Builder()
//                .url(url)
//                .build();
//        System.err.println("origin money:" + client.newCall(money).execute().body().string());
        URL url1 = new URL("http://localhost:8080/test/money/1/subtract?money=8");
        URL url2 = new URL("http://localhost:8080/test/money/1/subtract?money=8");

        final Request update1 = new Request.Builder().url(url1).build();
        final Request update2 = new Request.Builder().url(url2).build();
        System.err.println("update1:" + client.newCall(update1).execute().body().string());
        System.err.println("update2:" + client.newCall(update2).execute().body().string());

//        System.err.println("origin money:" + client.newCall(money).execute().body().string());
    }

    @Test
    public void a(){

    }

}
