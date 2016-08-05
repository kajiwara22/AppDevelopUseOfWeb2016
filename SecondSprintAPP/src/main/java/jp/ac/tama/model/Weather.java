package jp.ac.tama.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by kajiwarayutaka on 2016/08/05.
 */
@Data
public class Weather{
    private List<Map<String,String>> weather;
    private Map<String,String> main;
}

