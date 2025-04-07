package googledriveexample.domain;

import googledriveexample.domain.*;
import googledriveexample.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;
}
