package org.rouche;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * @author Jean-Francois Larouche (rouche) on 2020-01-28
 */
@Data
@Builder
public class Clazz {
    private List<String> fields;
}
