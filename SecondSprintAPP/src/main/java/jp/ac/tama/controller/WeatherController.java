package jp.ac.tama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.ac.tama.model.Weather;
import jp.ac.tama.service.WeatherService;

/**
 * Created by kajiwarayutaka on 2016/08/05.
 */
@RestController
@RequestMapping(value = "weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    @RequestMapping(value = "" ,method = RequestMethod.GET)
    public Weather showWeather(){
        return weatherService.getWeather();
    }
}
