package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Tutor", "Joes", "Computer", "Education");

		List<String> upr_str = strings.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());

		List<String> lwr_str = strings.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());

		System.out.println("Uppercase Strings : " + upr_str);
		System.out.println("Lowercase Strings : " + lwr_str);
	}
}