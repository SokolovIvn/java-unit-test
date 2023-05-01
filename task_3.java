/*
Описание задания: 

Тесты из предыдущего задания можно объединить в один параметризованный тест. Так код будет поддерживаемым и с ним будет удобнее работать.
Допиши параметризованный тест checkIsAdultWhenAgeThenResult, который проверит возраст из каждого класса эквивалентности. Учти, что код приложения пишут люди из разных стран, и в некоторых совершеннолетие наступает в 21 год.
В тест будет передаваться два аргумента: возраст и ожидаемый результат проверки. Реализуй это требование с помощью двумерного массива аргументов.


*/

 // Напиши аннотацию для параметризованных тестов
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


   @RunWith(Parameterized.class) 
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	 // Инициализируй поля класса в конструкторе
      this.age = age;
      this.result = result;
  }

   // Пометь метод аннотацией для параметров
    @Parameterized.Parameters
    public static Object[][] getTextData() {
	return new Object[][] {
		 // Заполни массив тестовыми данными и ожидаемым результатом


                {18, true},
                {20, true},
                {21, true},
                {22, true}
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	 // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("sadf", true, isAdult);
	}
}

