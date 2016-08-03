package jp.ac.tama;

import jp.ac.tama.entity.UserEntity;
import jp.ac.tama.service.InputService;
import jp.ac.tama.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication  implements CommandLineRunner {
	@Autowired
	private InputService inputService;

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for (UserEntity user:userService.getFirstKAuser()) {
			System.out.println(user.toString());
		}
		for (UserEntity user:userService.getUsers()) {
			System.out.println(user.toString());
		}

		System.out.println("ユーザーを確認します。");
        if(!userService.existUser()){
			System.out.println("ユーザーはいませんでした。");
			System.out.println("ユーザーを追加します。");
			userService.addUser();
			for (UserEntity user:userService.getUsers()) {
				System.out.println(user.toString());
			}
		}
		System.out.println("ユーザーを確認します。");
		if(userService.existUser()){
		    System.out.println(userService.getUser().toString());
		}
		System.out.println("ユーザーIdが３か５で割り切れるユーザー数を求めます。");
		System.out.println(userService.getSekaiNoNabetsuneCount());

		System.out.println("ユーザーを確認します。");
		if(userService.existUser()){
			System.out.println("ユーザーは存在します。");
			System.out.println("ユーザーを削除します。");
			userService.deleteUser();
			for (UserEntity user:userService.getUsers()) {
				System.out.println(user.toString());
			}
		}



	}
}
