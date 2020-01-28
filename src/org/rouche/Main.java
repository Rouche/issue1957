package org.rouche;

import java.util.ArrayList;

/**
 * @author Jean-Francois Larouche (rouche) on 2020-01-28
 */
public class Main {

    public static void main(String[] args) {

        Issue1957 issue1957 = new Issue1957();

        Issue1957Other other = Issue1957Mapper.INSTANCE.mapToOther(issue1957);

        System.out.println(other.toString());
    }
}
