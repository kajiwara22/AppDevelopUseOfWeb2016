package jp.ac.tama.controller;

import jp.ac.tama.entity.PrefectureSimpleInfo;
import jp.ac.tama.service.PrefectureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
@RestController
@RequestMapping(value = "/prefectures")
public class PrefecturesController {
    @Autowired
    private PrefectureInfoService prefectureInfoService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<PrefectureSimpleInfo> showStates(){
        return prefectureInfoService.findAllState();
    }
}
