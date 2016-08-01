package jp.ac.tama.service;

import jp.ac.tama.model.InputResult;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by kajiwarayutaka on 2016/08/01.
 */
@Service
public class InputService {
    public InputResult ScanInput(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        int right = scanner.nextInt();
        int left = scanner.nextInt();
        InputResult inputResult = new InputResult(right,left);
        return inputResult;

    }

}
