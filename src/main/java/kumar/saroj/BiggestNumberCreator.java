package kumar.saroj;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestNumberCreator {

    public String buildTheLargestNumber(List<Integer> input) {
        StringBuilder builder = new StringBuilder();
        List<String> stringList = input.stream().map(String::valueOf).collect(Collectors.toList());

        Collections.sort(stringList, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        Collections.sort(stringList, Collections.reverseOrder());
        for (String myNum : stringList) {
            builder.append(myNum);
        }
        return builder.toString();


    }


}
