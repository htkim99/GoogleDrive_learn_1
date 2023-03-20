package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String filename;
    private String url;
    private String type;
    private Integer size;
    private String path;
}
