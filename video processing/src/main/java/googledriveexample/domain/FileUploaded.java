package googledriveexample.domain;

import googledriveexample.domain.*;
import googledriveexample.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date uploadedTime;
    private String type;
    private String userId;
}
