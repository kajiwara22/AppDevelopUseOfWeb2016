package jp.ac.tama.service;

import jp.ac.tama.model.InputUserResult;
import lombok.val;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by kajiwarayutaka on 2016/08/02.
 */
@Service
public class InputUserService {
    public InputUserResult ScanInput(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        String userId = scanner.nextLine();
        String userName = scanner.nextLine();
        val inputUserResult = new InputUserResult(userId,userName);
        return inputUserResult;
    }
}
