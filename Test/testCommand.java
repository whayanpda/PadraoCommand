import static org.junit.jupiter.api.Assertions.*;
import org.example.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class testCommand {

   @Test
   public void testExecuteACommand() {

      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      PrintStream originalOut = System.out;
      System.setOut(new PrintStream(outContent));

      Invoker.invoke("A");


      String expectedOutput = "Executou o comando A" + System.lineSeparator();
      assertEquals(expectedOutput, outContent.toString());


      System.setOut(originalOut);
   }

   @Test
   public void testExecuteBCommand() {

      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      PrintStream originalOut = System.out;
      System.setOut(new PrintStream(outContent));

      Invoker.invoke("B");


      String expectedOutput = "Executou o comando B" + System.lineSeparator();
      assertEquals(expectedOutput, outContent.toString());


      System.setOut(originalOut);
   }

   @Test
   public void testCommandNotFound() {

      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      PrintStream originalOut = System.out;
      System.setOut(new PrintStream(outContent));

      Invoker.invoke("C");


      String expectedOutput = "Comando não encontrado: C" + System.lineSeparator();
      assertEquals(expectedOutput, outContent.toString());


      System.setOut(originalOut);
   }
}
