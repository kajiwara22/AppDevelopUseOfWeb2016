package jp.ac.tama;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jp.ac.tama.entity.UserEntity;
import jp.ac.tama.service.InputUserService;
import jp.ac.tama.service.UserService;
import lombok.val;

@SpringBootApplication
public class FirstSpringAppApplication  implements CommandLineRunner {
	@Autowired
    private InputUserService inputUserService;

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("追加もしくは検索するユーザーを入力してください。");
		System.out.println("ユーザーIDを入力後エンターを押下し、 ");
		System.out.println("ユーザー名を入力後エンターを押下してください。 ");
		val inputUserResult = inputUserService.ScanInput(System.in);
		if(userService.existUser(inputUserResult)){
			System.out.println("ユーザーが存在しました。");
			System.out.println(userService.getUser(inputUserResult));
		}else{
			System.out.println("ユーザーが存在しませんでした。");
			System.out.println("ユーザーの追加を行います。。");
			userService.addUser(inputUserResult);
		}
		System.out.println("現在登録されているユーザーは以下のとおりです。");
		for (UserEntity user:userService.getUsers()) {
		    System.out.println(user.toString());
		}
		



	}
}
