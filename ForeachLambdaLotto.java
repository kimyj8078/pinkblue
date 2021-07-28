import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//foreach와 Lambda형식을 이용하여 List출력하기
//(2021.07.28) 
//출처: Java200제

public class ForeachLambdaLotto {
	public static void main(String[] args) {
		List<Integer>mmlists=Arrays.asList(1,6,16,22,23,33);
		mmlists.forEach(
				m->{System.out.printf(m+"\t");}
		);
		System.out.println();
		Consumer<Integer>consume=(Integer m)->
		{System.out.print(m+"\t");};
		mmlists.forEach(consume);
	}
}