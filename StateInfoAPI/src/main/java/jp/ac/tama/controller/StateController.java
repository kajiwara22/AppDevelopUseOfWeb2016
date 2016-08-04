package jp.ac.tama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.ac.tama.entity.StateInfo;
import jp.ac.tama.service.StateInfoService;

/**
 * Created by kajiwarayutaka on 2016/08/04.
 */
@RestController
@RequestMapping(value = "/state")
public class StateController {
    @Autowired
    private StateInfoService stateInfoService;

    @RequestMapping(value = "{stateId}",method = RequestMethod.GET)
    public StateInfo showState(@PathVariable int stateId){
        return stateInfoService.findOneState(stateId);
    }
}
