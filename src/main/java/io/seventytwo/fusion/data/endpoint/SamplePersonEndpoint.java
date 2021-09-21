package io.seventytwo.fusion.data.endpoint;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.server.connect.Endpoint;
import io.seventytwo.fusion.data.entity.SamplePerson;
import io.seventytwo.fusion.data.service.SamplePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.vaadin.artur.helpers.GridSorter;
import org.vaadin.artur.helpers.PagingUtil;

import java.util.List;
import java.util.Optional;

@Endpoint
@AnonymousAllowed
public class SamplePersonEndpoint {

    private final SamplePersonService service;

    public SamplePersonEndpoint(@Autowired SamplePersonService service) {
        this.service = service;
    }

    public List<SamplePerson> list(int offset, int limit, List<GridSorter> sortOrder) {
        Page<SamplePerson> page = service
                .list(PagingUtil.offsetLimitTypeScriptSortOrdersToPageable(offset, limit, sortOrder));
        return page.getContent();
    }

    public Optional<SamplePerson> get(Integer id) {
        return service.get(id);
    }

    public SamplePerson update(SamplePerson entity) {
        return service.update(entity);
    }

    public void delete(Integer id) {
        service.delete(id);
    }

    public int count() {
        return service.count();
    }

}
