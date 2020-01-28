package org.rouche;

import java.util.List;

import lombok.*;

/**
 * @author Jean-Francois Larouche (rouche) on 2020-01-28
 */
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Issue1957Other {
    @Singular
    private List<OtherClazz> someNulls;
}
