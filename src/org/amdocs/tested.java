package org.amdocs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class tested implements intrfaceTesting{

    public static void main(String[] args) {
        intrfaceTesting i = new tested();
      //  i.display();
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().filter(x ->x%2==0).
                collect(Collectors.toList());
        System.out.println(square);
    }
}
