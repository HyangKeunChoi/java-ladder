package study2.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

	Scanner scanner = new Scanner(System.in);
	private static final String PARTICIPATE_MESSAGES = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
	private static final String HEIGHT_MESSAGES = "최대 사다리 높이는 몇 개인가요?";
	private static final int NAME_LENGTH_LIMIT = 5;
	
	public List<String> getParticipantNames() {
		System.out.println(PARTICIPATE_MESSAGES);
		String str = scanner.nextLine();
		String[] name = str.replace(" ", "")
							.split(",");
		Arrays.stream(name).forEach(s -> {
			if (s.length() > NAME_LENGTH_LIMIT) {
				throw new IllegalArgumentException("이름은 최대 5자 입니다.");
			}
		});
		return Arrays.asList(name);
	}

	public int InputHeight() {
		System.out.println(HEIGHT_MESSAGES);
		
		return scanner.nextInt();
	}

}
