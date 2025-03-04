import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void divideTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("divide", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 15, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void safeConvertStringtoIntTest() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(5, (int)method.invoke(null, "5"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void safeConvertStringtoIntTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "5a"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void safeConvertStringtoIntTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, "!"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void divideTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("divide", cArg);
  // Enter code here
    assertEquals(2, (int)method.invoke(null, 10, 5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void divideTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class};
        Method method = testClass.getDeclaredMethod("divide", cArg);
  // Enter code here
    assertEquals(2, (int)method.invoke(null, 12, 5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void validIndexTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { int[].class, int.class};
        Method method = testClass.getDeclaredMethod("validIndex", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, new int[]{1, 3, 5, 5, 2}, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void validIndexTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { int[].class, int.class};
        Method method = testClass.getDeclaredMethod("validIndex", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, new int[]{1, 3, 5}, 4));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void safeConvertStringtoIntTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("safeConvertStringtoInt", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, ""));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
