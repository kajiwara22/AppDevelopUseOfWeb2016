package jp.ac.tama.controller;

import jp.ac.tama.entity.PrefectureInfo;
import jp.ac.tama.service.PrefectureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
@RestController
@RequestMapping(value = "/prefecture")
public class PrefectureController {
    @Autowired
    private PrefectureInfoService prefectureInfoService;

    @RequestMapping(value ="",method = RequestMethod.GET)
    public List<PrefectureInfo> showLikePrefecture(@RequestParam("name") String prefectureLike){
        return prefectureInfoService.findLikePrefecture(prefectureLike);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public PrefectureInfo showState(@PathVariable int id){
        return prefectureInfoService.findOneState(id);
    }
}
