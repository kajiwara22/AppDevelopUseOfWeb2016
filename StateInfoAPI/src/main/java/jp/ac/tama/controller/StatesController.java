package jp.ac.tama.controller;

import jp.ac.tama.entity.StatesInfo;
import jp.ac.tama.service.StateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
@RestController
@RequestMapping(value = "/states")
public class StatesController {
    @Autowired
    private StateInfoService stateInfoService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<StatesInfo> showStates(){
        return stateInfoService.findAllState();
    }
}
