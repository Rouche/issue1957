package org.rouche;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Jean-Francois Larouche (rouche) on 2020-01-28
 */
@Mapper
public interface Issue1957Mapper {

    Issue1957Mapper INSTANCE = Mappers.getMapper(Issue1957Mapper.class);

    Issue1957Other mapToOther(Issue1957 issue1957O);
}
