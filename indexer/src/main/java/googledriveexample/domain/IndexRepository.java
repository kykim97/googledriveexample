package googledriveexample.domain;

import googledriveexample.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "indices", path = "indices")
public interface IndexRepository
    extends PagingAndSortingRepository<Index, Long> {}
