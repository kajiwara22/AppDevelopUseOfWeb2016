package jp.ac.tama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.ac.tama.entity.PrefectureInfo;
import jp.ac.tama.service.PrefectureInfoService;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
@RestController
@RequestMapping(value = "/prefecture")
public class PrefectureController {
    @Autowired
    private PrefectureInfoService prefectureInfoService;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public PrefectureInfo showState(@PathVariable int id){
        return prefectureInfoService.findOneState(id);
    }
}
