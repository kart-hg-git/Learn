package in.swf.react;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class ReactTest {


    public static void testReact(){

        List<Integer> elements = new ArrayList<>();

        Flux.just(1, 2, 3, 4)
                 .log()
                .subscribe(elements::add).dispose();

//        assertThat(elements).containsExactly(1, 2, 3, 4);
    }

    public static void main(String[] args) {

        testReact();
    }


}
