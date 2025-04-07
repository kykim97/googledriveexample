package googledriveexample.domain;

import googledriveexample.domain.*;
import googledriveexample.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;

    public VideoStreamed(Video aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}
//>>> DDD / Domain Event
